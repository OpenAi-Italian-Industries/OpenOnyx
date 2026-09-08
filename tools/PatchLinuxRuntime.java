import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/** Creates a Linux/Java 21 compatible copy of the recovered Onyx runtime. */
public final class PatchLinuxRuntime {
    private static final String NETWORK_MANAGER = "net/minecraft/network/NetworkManager";
    private static final String PACKET_DIRECTION = "client/onyx/y/t/J";
    private static final String PACKET = "net/minecraft/network/Packet";
    private static final String HOOK_DESCRIPTOR = "(L" + PACKET_DIRECTION + ";L" + PACKET + ";)Z";
    private static final String GUARDED_HOOK_DESCRIPTOR =
            "(L" + PACKET_DIRECTION + ";L" + PACKET + ";L" + NETWORK_MANAGER + ";)Z";

    private PatchLinuxRuntime() {
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            throw new IllegalArgumentException("usage: PatchLinuxRuntime <input.jar> <output.jar>");
        }

        Path input = Path.of(args[0]);
        Path output = Path.of(args[1]);
        Files.createDirectories(output.toAbsolutePath().getParent());

        boolean patchedNetworkManager = false;
        Set<String> entries = new HashSet<>();
        try (InputStream fileInput = Files.newInputStream(input);
             ZipInputStream zipInput = new ZipInputStream(fileInput);
             OutputStream fileOutput = Files.newOutputStream(output);
             ZipOutputStream zipOutput = new ZipOutputStream(fileOutput)) {
            ZipEntry entry;
            while ((entry = zipInput.getNextEntry()) != null) {
                if (!entries.add(entry.getName())) {
                    throw new IOException("duplicate JAR entry: " + entry.getName());
                }

                ZipEntry replacement = new ZipEntry(entry.getName());
                replacement.setTime(entry.getTime());
                zipOutput.putNextEntry(replacement);
                byte[] data = zipInput.readAllBytes();
                if ((NETWORK_MANAGER + ".class").equals(entry.getName())) {
                    data = patchNetworkManager(data);
                    patchedNetworkManager = true;
                }
                zipOutput.write(data);
                zipOutput.closeEntry();
                zipInput.closeEntry();
            }
        }

        if (!patchedNetworkManager) {
            Files.deleteIfExists(output);
            throw new IOException("NetworkManager.class was not found");
        }
        System.out.println("Created " + output);
    }

    private static byte[] patchNetworkManager(byte[] original) {
        ClassReader reader = new ClassReader(original);
        ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_MAXS);
        int[] guardedHooks = {0};
        int[] disabledEpollChecks = {0};

        ClassVisitor visitor = new ClassVisitor(Opcodes.ASM9, writer) {
            @Override
            public MethodVisitor visitMethod(
                    int access,
                    String name,
                    String descriptor,
                    String signature,
                    String[] exceptions) {
                MethodVisitor delegate = super.visitMethod(access, name, descriptor, signature, exceptions);
                return new MethodVisitor(Opcodes.ASM9, delegate) {
                    @Override
                    public void visitMethodInsn(
                            int opcode,
                            String owner,
                            String calledName,
                            String calledDescriptor,
                            boolean isInterface) {
                        if (opcode == Opcodes.INVOKESTATIC
                                && NETWORK_MANAGER.equals(owner)
                                && "onyxCancels".equals(calledName)
                                && HOOK_DESCRIPTOR.equals(calledDescriptor)) {
                            super.visitVarInsn(Opcodes.ALOAD, 0);
                            super.visitMethodInsn(
                                    Opcodes.INVOKESTATIC,
                                    NETWORK_MANAGER,
                                    "onyxCancelsForClient",
                                    GUARDED_HOOK_DESCRIPTOR,
                                    false);
                            guardedHooks[0]++;
                            return;
                        }

                        if (opcode == Opcodes.INVOKESTATIC
                                && "createNetworkManagerAndConnect".equals(name)
                                && "io/netty/channel/epoll/Epoll".equals(owner)
                                && "isAvailable".equals(calledName)
                                && "()Z".equals(calledDescriptor)) {
                            super.visitInsn(Opcodes.ICONST_0);
                            disabledEpollChecks[0]++;
                            return;
                        }

                        super.visitMethodInsn(opcode, owner, calledName, calledDescriptor, isInterface);
                    }
                };
            }

            @Override
            public void visitEnd() {
                MethodVisitor method = super.visitMethod(
                        Opcodes.ACC_PRIVATE | Opcodes.ACC_STATIC,
                        "onyxCancelsForClient",
                        GUARDED_HOOK_DESCRIPTOR,
                        null,
                        null);
                method.visitCode();
                method.visitVarInsn(Opcodes.ALOAD, 2);
                method.visitFieldInsn(
                        Opcodes.GETFIELD,
                        NETWORK_MANAGER,
                        "direction",
                        "Lnet/minecraft/network/EnumPacketDirection;");
                method.visitFieldInsn(
                        Opcodes.GETSTATIC,
                        "net/minecraft/network/EnumPacketDirection",
                        "CLIENTBOUND",
                        "Lnet/minecraft/network/EnumPacketDirection;");
                Label clientConnection = new Label();
                method.visitJumpInsn(Opcodes.IF_ACMPEQ, clientConnection);
                method.visitInsn(Opcodes.ICONST_0);
                method.visitInsn(Opcodes.IRETURN);
                method.visitLabel(clientConnection);
                method.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
                method.visitVarInsn(Opcodes.ALOAD, 0);
                method.visitVarInsn(Opcodes.ALOAD, 1);
                method.visitMethodInsn(
                        Opcodes.INVOKESTATIC,
                        NETWORK_MANAGER,
                        "onyxCancels",
                        HOOK_DESCRIPTOR,
                        false);
                method.visitInsn(Opcodes.IRETURN);
                method.visitMaxs(0, 0);
                method.visitEnd();
                super.visitEnd();
            }
        };

        reader.accept(visitor, 0);
        if (guardedHooks[0] != 4) {
            throw new IllegalStateException("expected 4 packet hooks, found " + guardedHooks[0]);
        }
        if (disabledEpollChecks[0] != 1) {
            throw new IllegalStateException("expected 1 epoll check, found " + disabledEpollChecks[0]);
        }
        return writer.toByteArray();
    }
}
