import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.SimpleRemapper;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.RecordComponentNode;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/** Renames every client.onyx class and package and disambiguates duplicate methods. */
public final class RenameClasses {
    private static final String OLD_PREFIX = "client/onyx/";
    private static final String NEW_PREFIX = "openonyx/";

    private RenameClasses() {
    }

    public static void main(String[] args) throws IOException {
        if (args.length < 2 || args.length > 3) {
            throw new IllegalArgumentException(
                    "usage: RenameClasses <input.jar> <output.jar> [mapping.tsv]");
        }
        Path input = Paths.get(args[0]);
        Path output = Paths.get(args[1]);
        Path mapping = args.length == 3 ? Paths.get(args[2]) : null;
        Map<String, String> classMap = buildMap(input);
        Map<MethodKey, String> methodMap = buildMethodMap(input, classMap);
        rewrite(input, output, classMap, methodMap);
        if (mapping != null) {
            writeMap(mapping, classMap);
        }
        System.out.println("renamed=" + classMap.size() + " output=" + output);
    }

    private static Map<String, String> buildMap(Path input) throws IOException {
        TreeSet<String> packages = new TreeSet<>();
        List<String> classes = new ArrayList<>();
        try (ZipFile zip = new ZipFile(input.toFile())) {
            zip.stream().map(ZipEntry::getName)
                    .filter(name -> name.startsWith(OLD_PREFIX) && name.endsWith(".class"))
                    .forEach(name -> {
                        String internal = name.substring(0, name.length() - ".class".length());
                        int slash = internal.lastIndexOf('/');
                        packages.add(internal.substring(0, slash));
                        classes.add(internal);
                    });
        }
        classes.sort(Comparator.naturalOrder());
        Map<String, String> packageMap = new LinkedHashMap<>();
        int packageIndex = 1;
        for (String oldPackage : packages) {
            packageMap.put(oldPackage, packageName(oldPackage, packageIndex++));
        }
        Map<String, String> classMap = new LinkedHashMap<>();
        Map<String, Integer> nameUses = new HashMap<>();
        try (ZipFile zip = new ZipFile(input.toFile())) {
            int classIndex = 1;
            for (String oldClass : classes) {
                int slash = oldClass.lastIndexOf('/');
                String oldPackage = oldClass.substring(0, slash);
                String suggested = suggestedClassName(zip, oldClass, classIndex);
                int use = nameUses.merge(suggested, 1, Integer::sum);
                if (use > 1) {
                    suggested += "_" + use;
                }
                classMap.put(oldClass, packageMap.get(oldPackage) + "/" + suggested);
                classIndex++ ;
            }
        }
        return classMap;
    }

    private static String packageName(String oldPackage, int packageIndex) {
        if (oldPackage.equals("client/onyx")) {
            return NEW_PREFIX + "core";
        }
        if (oldPackage.startsWith("client/onyx/r/t/")) {
            String[] parts = oldPackage.substring("client/onyx/r/t/".length()).split("/");
            String category = switch (parts[0]) {
                case "d" -> "render";
                case "k" -> "hud";
                case "m" -> "movement";
                case "r" -> "combat";
                case "t" -> "player";
                default -> null;
            };
            if (category != null) {
                StringBuilder result = new StringBuilder(NEW_PREFIX)
                        .append("features/").append(category);
                for (int index = 1; index < parts.length; index++) {
                    result.append('/').append(parts[index].equals("t")
                            ? "internal" : "group_" + parts[index]);
                }
                return result.toString();
            }
        }
        String[] parts = oldPackage.substring("client/onyx/".length()).split("/");
        String root = switch (parts[0]) {
            case "a" -> "input";
            case "c" -> "interaction";
            case "d" -> "history";
            case "e" -> "theme";
            case "g" -> "network";
            case "i" -> "skins";
            case "j" -> "music";
            case "k" -> "movement";
            case "l" -> "commands";
            case "m" -> "render";
            case "p" -> "protocol";
            case "r" -> "features";
            case "s" -> "connection";
            case "t" -> "utilities";
            case "u" -> "ipc";
            case "v" -> "events";
            case "w" -> "ui";
            case "y" -> "configuration";
            case "z" -> "misc";
            default -> "package";
        };
        StringBuilder result = new StringBuilder(NEW_PREFIX).append(root);
        for (int index = 1; index < parts.length; index++) {
            result.append('/').append(parts[index].equals("t")
                    ? "internal" : "group_" + parts[index]);
        }
        return result.toString();
    }

    private static String explicitModuleName(String oldClass) {
        return switch (oldClass) {
            case "client/onyx/r/t/d/A" -> "TNTTimer";
            case "client/onyx/r/t/d/Aa" -> "ClickGUI";
            case "client/onyx/r/t/d/B" -> "SkeletonESP";
            case "client/onyx/r/t/d/Ba" -> "Boxes";
            case "client/onyx/r/t/d/C" -> "SeeInvisibles";
            case "client/onyx/r/t/d/D" -> "Particles";
            case "client/onyx/r/t/d/E" -> "SkinChanger";
            case "client/onyx/r/t/d/Ga" -> "Camera";
            case "client/onyx/r/t/d/Ja" -> "CapeChanger";
            case "client/onyx/r/t/d/K" -> "Zoom";
            case "client/onyx/r/t/d/La" -> "ESP";
            case "client/onyx/r/t/d/P" -> "ParticleLimiter";
            case "client/onyx/r/t/d/R" -> "Fullbright";
            case "client/onyx/r/t/d/U" -> "NoRender";
            case "client/onyx/r/t/d/V" -> "Hurtcam";
            case "client/onyx/r/t/d/Xa" -> "BedESP";
            case "client/onyx/r/t/d/Z" -> "Freelook";
            case "client/onyx/r/t/d/ca" -> "Chams";
            case "client/onyx/r/t/d/da" -> "ContainerESP";
            case "client/onyx/r/t/d/e" -> "Wings";
            case "client/onyx/r/t/d/f" -> "Trails";
            case "client/onyx/r/t/d/g" -> "Skybox";
            case "client/onyx/r/t/d/ha" -> "ChinaHat";
            case "client/onyx/r/t/d/k" -> "TargetESP";
            case "client/onyx/r/t/d/l" -> "Trajectories";
            case "client/onyx/r/t/d/ma" -> "Crosshair";
            case "client/onyx/r/t/d/o" -> "FogRemove";
            case "client/onyx/r/t/d/p" -> "GlowESP";
            case "client/onyx/r/t/d/pa" -> "Arrows";
            case "client/onyx/r/t/d/qa" -> "BlockOverlay";
            case "client/onyx/r/t/d/r" -> "ItemPhysics";
            case "client/onyx/r/t/d/sa" -> "Animations";
            case "client/onyx/r/t/d/t" -> "JumpCircles";
            case "client/onyx/r/t/d/u" -> "FogBlur";
            case "client/onyx/r/t/d/v" -> "Hand";
            case "client/onyx/r/t/d/va" -> "Ambience";
            case "client/onyx/r/t/k/B" -> "Notifications";
            case "client/onyx/r/t/k/D" -> "DiscordRPC";
            case "client/onyx/r/t/k/L" -> "Watermark";
            case "client/onyx/r/t/k/S" -> "CustomGui";
            case "client/onyx/r/t/k/a" -> "Keybinds";
            case "client/onyx/r/t/k/d" -> "PotionHUD";
            case "client/onyx/r/t/k/j" -> "TargetHUD";
            case "client/onyx/r/t/k/s" -> "ArrayListModule";
            case "client/onyx/r/t/m/J" -> "AutoSprint";
            case "client/onyx/r/t/m/K" -> "SafeWalk";
            case "client/onyx/r/t/m/c" -> "NoSlow";
            case "client/onyx/r/t/m/t/K" -> "Safe";
            case "client/onyx/r/t/r/A" -> "BedBreaker";
            case "client/onyx/r/t/r/M" -> "JumpReset";
            case "client/onyx/r/t/r/c" -> "Velocity";
            case "client/onyx/r/t/r/k" -> "BedDefender";
            case "client/onyx/r/t/r/l" -> "KillAura";
            case "client/onyx/r/t/r/m" -> "AntiBot";
            case "client/onyx/r/t/t/G" -> "FastPlace";
            case "client/onyx/r/t/t/I" -> "ChestStealer";
            case "client/onyx/r/t/t/J" -> "Scaffold";
            case "client/onyx/r/t/t/e" -> "NameChanger";
            case "client/onyx/r/t/t/f" -> "Deposit";
            case "client/onyx/r/t/t/h" -> "InventoryManager";
            case "client/onyx/c" -> "OnyxClient";
            case "client/onyx/lqzxvptmnk" -> "ObfuscationMarker";
            case "client/onyx/r/J" -> "ModuleCategory";
            case "client/onyx/r/K" -> "Module";
            case "client/onyx/r/c" -> "ModuleManager";
            case "client/onyx/r/e" -> "ModuleState";
            case "client/onyx/v/A" -> "PerformanceDiagnostics";
            case "client/onyx/v/B" -> "ChatTransformer";
            case "client/onyx/v/E" -> "BenchmarkHarness";
            case "client/onyx/v/J" -> "TargetType";
            case "client/onyx/v/L" -> "RotationMode";
            case "client/onyx/v/b" -> "BenchmarkSample";
            case "client/onyx/v/d" -> "BenchmarkScenario";
            case "client/onyx/v/g" -> "BenchmarkPhase";
            case "client/onyx/v/h" -> "BenchmarkMetric";
            case "client/onyx/v/F" -> "NotificationDispatcher";
            case "client/onyx/v/G" -> "AimController";
            case "client/onyx/v/H" -> "MovementRotation";
            case "client/onyx/v/I" -> "GeometryUtils";
            case "client/onyx/v/K" -> "ChatFormattingUtils";
            case "client/onyx/v/M" -> "RotationManager";
            case "client/onyx/v/c" -> "EntityRelationUtils";
            case "client/onyx/v/e" -> "RotationMath";
            case "client/onyx/v/f" -> "Rotation";
            case "client/onyx/v/i" -> "InventoryUtils";
            case "client/onyx/v/k" -> "HypixelUtils";
            case "client/onyx/v/l" -> "RotationSettings";
            case "client/onyx/v/m" -> "FileDialogUtils";
            case "client/onyx/d/J" -> "Setting";
            case "client/onyx/d/f" -> "ModeSetting";
            case "client/onyx/d/h" -> "SettingValue";
            case "client/onyx/d/j" -> "UndoManager";
            case "client/onyx/d/l" -> "ModeOption";
            case "client/onyx/d/L" -> "Range";
            case "client/onyx/d/t/G" -> "MultiSelectSetting";
            case "client/onyx/d/t/H" -> "ActionSetting";
            case "client/onyx/d/t/I" -> "BlockSetSetting";
            case "client/onyx/d/t/J" -> "RangeSetting";
            case "client/onyx/d/t/K" -> "TextSetting";
            case "client/onyx/d/t/L" -> "ItemListSetting";
            case "client/onyx/d/t/M" -> "ColorSetting";
            case "client/onyx/d/t/c" -> "ItemMappingSetting";
            case "client/onyx/d/t/e" -> "MultiEnumSetting";
            case "client/onyx/d/t/f" -> "BooleanSetting";
            case "client/onyx/d/t/h" -> "NumberSetting";
            case "client/onyx/d/t/j" -> "KeybindSetting";
            case "client/onyx/d/t/l" -> "EnumSetting";
            case "client/onyx/r/t/r/J" -> "BedTracker";
            case "client/onyx/r/t/r/K" -> "CombatController";
            case "client/onyx/r/t/r/e" -> "TargetFilter";
            case "client/onyx/r/t/r/f" -> "TargetScanner";
            case "client/onyx/r/t/r/G" -> "AutoBlockTrigger";
            case "client/onyx/r/t/r/L" -> "AutoBlockMode";
            case "client/onyx/r/t/r/h" -> "HitCheck";
            case "client/onyx/r/t/r/t/K" -> "CombatMode";
            case "client/onyx/t/n" -> "Timer";
            case "client/onyx/y/K" -> "Event";
            case "client/onyx/y/t/J" -> "PacketDirection";
            case "client/onyx/y/t/K" -> "WorldChangeEvent";
            case "client/onyx/y/t/c" -> "TickEvent";
            case "client/onyx/y/t/i" -> "PacketEvent";
            case "client/onyx/y/t/l" -> "TickEndEvent";
            case "client/onyx/w/t/L" -> "TextEditor";
            case "client/onyx/c/c" -> "BlockUtils";
            case "client/onyx/c/t/m" -> "PlacementResult";
            case "client/onyx/m/k/c" -> "CrystalEffectSettings";
            case "client/onyx/t/D" -> "MovementInputState";
            case "client/onyx/t/N" -> "FileUtils";
            case "client/onyx/t/j" -> "BlockItemUtils";
            case "client/onyx/t/l" -> "RayTraceUtils";
            case "client/onyx/c/K" -> "SwingMode";
            case "client/onyx/c/t/A" -> "BlockPlacementContext";
            case "client/onyx/t/U" -> "RayTraceMode";
            case "client/onyx/v/j" -> "RotationFixMode";
            case "client/onyx/r/t/r/H" -> "PlacementOrder";
            case "client/onyx/r/t/r/I" -> "BedTarget";
            case "client/onyx/r/t/r/i" -> "DefensePattern";
            case "client/onyx/r/t/r/j" -> "DefenseStep";
            default -> null;
        };
    }

    private static String suggestedClassName(ZipFile zip, String oldClass, int index)
            throws IOException {
        String moduleName = explicitModuleName(oldClass);
        if (moduleName != null) {
            return moduleName;
        }
        ZipEntry entry = zip.getEntry(oldClass + ".class");
        ClassNode node = new ClassNode();
        new ClassReader(zip.getInputStream(entry)).accept(node,
                ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
        if (node.recordComponents != null && !node.recordComponents.isEmpty()) {
            StringBuilder name = new StringBuilder("Data");
            for (RecordComponentNode component : node.recordComponents) {
                name.append('_').append(capitalize(component.name));
            }
            return name.toString();
        }
        String prefix = purposePrefix(oldClass);
        if ((node.access & org.objectweb.asm.Opcodes.ACC_ENUM) != 0) {
            return prefix + "Mode_" + String.format("%03d", index);
        }
        if ((node.access & org.objectweb.asm.Opcodes.ACC_INTERFACE) != 0) {
            return prefix + "Listener_" + String.format("%03d", index);
        }
        return prefix + "Support_" + String.format("%03d", index);
    }

    private static String purposePrefix(String oldClass) {
        String segment = oldClass.substring("client/onyx/".length()).split("/")[0];
        return switch (segment) {
            case "a" -> "Input";
            case "c" -> "Interaction";
            case "d" -> "Setting";
            case "e" -> "Theme";
            case "g", "s" -> "Network";
            case "i" -> "Skin";
            case "j" -> "Music";
            case "k" -> "Movement";
            case "l" -> "Command";
            case "m" -> "Render";
            case "p" -> "Protocol";
            case "r" -> "Feature";
            case "t" -> "Utility";
            case "u", "y" -> "Event";
            case "v" -> "Event";
            case "w" -> "Ui";
            case "z" -> "Misc";
            default -> "Onyx";
        };
    }
    private static String mapKillAuraField(String owner, String name) {
        if (!"client/onyx/r/t/r/l".equals(owner)
                && !"openonyx/features/combat/KillAura".equals(owner)) {
            return null;
        }
        return switch (name) {
            case "F" -> "MIN_ATTACK_INTERVAL_MS";
            case "G" -> "previousTarget";
            case "A" -> "onlySword";
            case "K" -> "random";
            case "B" -> "minCps";
            case "C" -> "target";
            case "J" -> "rotationSettings";
            case "D" -> "lastAttackAt";
            case "c" -> "combatController";
            case "a" -> "aimController";
            case "k" -> "autoBlockMode";
            case "g" -> "maxCps";
            case "M" -> "hitCheck";
            case "L" -> "attackTimer";
            case "j" -> "toggleAutoBlock";
            case "m" -> "targetTicks";
            case "h" -> "targetDistance";
            case "l" -> "autoBlockKeyDown";
            case "I" -> "autoBlockKey";
            case "d" -> "autoBlockTrigger";
            case "i" -> "hitAngle";
            case "f" -> "switchDelay";
            case "H" -> "throughWalls";
            case "e" -> "targetFilters";
            default -> null;
        };
    }

    private static String mapKillAuraMethod(String owner, String name, String descriptor) {
        if (!"client/onyx/r/t/r/l".equals(owner)
                && !"openonyx/features/combat/KillAura".equals(owner)) {
            return null;
        }
        if ("L".equals(name) && "(Lnet/minecraft/entity/Entity;)D".equals(descriptor)) {
            return "distanceToEntity";
        }
        if ("L".equals(name) && "(Lclient/onyx/y/t/i;)V".equals(descriptor)) {
            return "onPacket";
        }
        if ("L".equals(name) && "(Lopenonyx/configuration/internal/PacketEvent;)V".equals(descriptor)) {
            return "onPacket";
        }
        if ("H".equals(name) && "()Z".equals(descriptor)) return "shouldAttack";
        if ("e".equals(name) && "()Z".equals(descriptor)) return "isAttackReady";
        if ("l".equals(name) && "()Z".equals(descriptor)) return "isActive";
        if ("L".equals(name) && "(Lopenonyx/events/Rotation;)Z".equals(descriptor)) return "passesHitCheck";
        if ("k".equals(name) && "()Z".equals(descriptor)) return "shouldBlock";
        if ("L".equals(name) && "(Lnet/minecraft/entity/EntityLivingBase;)Z".equals(descriptor)) return "isValidTarget";
        if ("F".equals(name) && "()V".equals(descriptor)) return "attackIfReady";
        if ("l".equals(name) && "()V".equals(descriptor)) return "resetCombatState";
        if ("L".equals(name) && "(Lnet/minecraft/entity/Entity;)Z".equals(descriptor)) return "canSeeEntity";
        if ("L".equals(name) && "(Lopenonyx/configuration/internal/TickEndEvent;)V".equals(descriptor)) return "onTickEnd";
        if ("d".equals(name) && "()Lnet/minecraft/entity/EntityLivingBase;".equals(descriptor)) return "findTarget";
        if ("L".equals(name) && "()J".equals(descriptor)) return "nextAttackDelayMillis";
        if ("h".equals(name) && "()V".equals(descriptor)) return "updateAutoBlockKey";
        if ("L".equals(name) && "(Lopenonyx/configuration/internal/TickEvent;)V".equals(descriptor)) return "onTick";
        if ("L".equals(name) && "(Lopenonyx/configuration/internal/WorldChangeEvent;)V".equals(descriptor)) return "onWorldChange";
        if ("L".equals(name) && "()Lnet/minecraft/entity/EntityLivingBase;".equals(descriptor)) return "getPreviousTarget";
        if ("D".equals(name) && "()V".equals(descriptor)) return "onDisable";
        if ("D".equals(name) && "()Lnet/minecraft/entity/EntityLivingBase;".equals(descriptor)) return "getTarget";
        if ("L".equals(name) && "(ZZZ)Z".equals(descriptor)) return "targetSelectionAllowed";
        return null;
    }

    private static String capitalize(String value) {
        if (value.isEmpty()) return "Value";
        return Character.toUpperCase(value.charAt(0)) + value.substring(1);
    }
    private static Map<MethodKey, String> buildMethodMap(Path input, Map<String, String> classMap)
            throws IOException {
        Map<MethodKey, String> result = new HashMap<>();
        try (ZipFile zip = new ZipFile(input.toFile())) {
            zip.stream().filter(entry -> entry.getName().endsWith(".class")).forEach(entry -> {
                try (InputStream in = zip.getInputStream(entry)) {
                    ClassNode node = new ClassNode();
                    new ClassReader(in.readAllBytes()).accept(node, ClassReader.SKIP_CODE
                            | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                    Set<String> usedNames = new HashSet<>();
                    for (MethodNode method : node.methods) {
                        usedNames.add(method.name);
                    }
                    Map<String, List<MethodNode>> groups = new LinkedHashMap<>();
                    for (MethodNode method : node.methods) {
                        if (!method.name.equals("<init>") && !method.name.equals("<clinit>")) {
                            groups.computeIfAbsent(method.name + argumentDescriptor(method.desc),
                                    ignored -> new ArrayList<>()).add(method);
                        }
                    }
                    for (List<MethodNode> methods : groups.values()) {
                        Set<String> descriptors = new HashSet<>();
                        for (MethodNode method : methods) {
                            descriptors.add(method.desc);
                        }
                        if (descriptors.size() < 2) continue;
                        methods.sort(Comparator.comparing(method -> method.desc));
                        String owner = stripClass(entry.getName());
                        String mappedOwner = classMap.get(owner);
                        String base = methods.get(0).name;
                        for (int index = 0; index < methods.size(); index++) {
                            String name = base;
                            if (index > 0) {
                                int suffix = index + 1;
                                name = base + "_" + suffix;
                                while (usedNames.contains(name)) {
                                    name = base + "_" + ++suffix;
                                }
                            }
                            usedNames.add(name);
                            MethodNode method = methods.get(index);
                            result.put(new MethodKey(owner, method.name, method.desc), name);
                            if (mappedOwner != null) {
                                result.put(new MethodKey(mappedOwner, method.name, method.desc), name);
                            }
                        }
                    }
                } catch (IOException exception) {
                    throw new RewriteException(exception);
                }
            });
        } catch (RewriteException exception) {
            throw exception.exception;
        }
        return result;
    }

    private static String argumentDescriptor(String descriptor) {
        return descriptor.substring(0, descriptor.indexOf(')') + 1);
    }

    private record MethodKey(String owner, String name, String descriptor) {
    }

    private static void rewrite(Path input, Path output, Map<String, String> classMap,
            Map<MethodKey, String> methodMap) throws IOException {
        Path parent = output.toAbsolutePath().getParent();
        if (parent != null) Files.createDirectories(parent);
        SimpleRemapper remapper = new SimpleRemapper(classMap) {
            @Override
            public String mapFieldName(String owner, String name, String descriptor) {
                String renamed = mapKillAuraField(owner, name);
                return renamed == null ? super.mapFieldName(owner, name, descriptor) : renamed;
            }

            @Override
            public String mapMethodName(String owner, String name, String descriptor) {
                String renamed = mapKillAuraMethod(owner, name, descriptor);
                if (renamed != null) return renamed;
                renamed = methodMap.get(new MethodKey(owner, name, descriptor));
                if (renamed != null) return renamed;
                String mappedOwner = classMap.get(owner);
                renamed = mappedOwner == null ? null
                        : methodMap.get(new MethodKey(mappedOwner, name, descriptor));
                return renamed == null ? super.mapMethodName(owner, name, descriptor) : renamed;
            }
        };
        try (ZipFile inputZip = new ZipFile(input.toFile());
             OutputStream fileOut = Files.newOutputStream(output);
             ZipOutputStream outputZip = new ZipOutputStream(fileOut)) {
            inputZip.stream().forEach(entry -> {
                if ("openonyx/core/ObfuscationMarker".equals(
                        classMap.get(stripClass(entry.getName())))) {
                    return;
                }
                try (InputStream in = inputZip.getInputStream(entry)) {
                    String outputName = classMap.containsKey(stripClass(entry.getName()))
                            ? classMap.get(stripClass(entry.getName())) + ".class"
                            : entry.getName();
                    ZipEntry outputEntry = new ZipEntry(outputName);
                    outputZip.putNextEntry(outputEntry);
                    if (!entry.isDirectory()) {
                        byte[] bytes = in.readAllBytes();
                        if (entry.getName().endsWith(".class")) {
                            ClassWriter writer = new ClassWriter(0);
                            ClassRemapper remappingVisitor = new ClassRemapper(writer, remapper) {
                                @Override
                                public MethodVisitor visitMethod(int access, String name, String descriptor,
                                        String signature, String[] exceptions) {
                                    MethodVisitor visitor = super.visitMethod(
                                            access, name, descriptor, signature, exceptions);
                                    return new MethodVisitor(org.objectweb.asm.Opcodes.ASM9, visitor) {
                                        @Override
                                        public void visitLdcInsn(Object value) {
                                            if (value instanceof String) {
                                                value = ((String) value)
                                                        .replace("client.onyx.", "openonyx.")
                                                        .replace("client.onyx", "openonyx");
                                            }
                                            super.visitLdcInsn(value);
                                        }

                                        @Override
                                        public void visitMethodInsn(int opcode, String owner, String name,
                                                String descriptor, boolean isInterface) {
                                            if (("openonyx/core/ObfuscationMarker".equals(owner)
                                                    || "client/onyx/lqzxvptmnk".equals(owner))
                                                    && "qpwoeirzn".equals(name)
                                                    && "(I)V".equals(descriptor)) {
                                                return;
                                            }
                                            super.visitMethodInsn(opcode, owner, name, descriptor, isInterface);
                                        }
                                    };
                                }
                            };
                            new ClassReader(bytes).accept(remappingVisitor, 0);
                            bytes = writer.toByteArray();
                        }
                        outputZip.write(bytes);
                    }
                    outputZip.closeEntry();
                } catch (IOException exception) {
                    throw new RewriteException(exception);
                }
            });
        } catch (RewriteException exception) {
            throw exception.exception;
        }
    }

    private static String stripClass(String name) {
        return name.endsWith(".class")
                ? name.substring(0, name.length() - ".class".length())
                : name;
    }

    private static void writeMap(Path output, Map<String, String> classMap) throws IOException {
        Path parent = output.toAbsolutePath().getParent();
        if (parent != null) Files.createDirectories(parent);
        List<String> rows = new ArrayList<>();
        rows.add("original_internal_name\trecovered_internal_name");
        classMap.forEach((oldName, newName) -> rows.add(oldName + "\t" + newName));
        Files.write(output, rows, StandardCharsets.UTF_8);
    }

    private static final class RewriteException extends RuntimeException {
        private final IOException exception;

        private RewriteException(IOException exception) {
            this.exception = exception;
        }
    }
}
