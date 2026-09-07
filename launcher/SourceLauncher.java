import java.lang.reflect.InvocationTargetException;

/**
 * Source entrypoint for the supplied Minecraft runtime.
 * The runtime's Start class supplies the legacy launch arguments; this class
 * keeps the executable entrypoint in source so Gradle can build it without
 * bundling the proprietary runtime.
 */
public final class SourceLauncher {
    private SourceLauncher() {
    }

    public static void main(String[] args) {
        try {
            Class<?> launcher = Class.forName("Start");
            launcher.getMethod("main", String[].class).invoke(null, (Object)args);
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException exception) {
            throw new IllegalStateException("The supplied runtime does not contain Start.main", exception);
        } catch (InvocationTargetException exception) {
            Throwable cause = exception.getCause();
            if (cause instanceof RuntimeException runtimeException) {
                throw runtimeException;
            }
            if (cause instanceof Error error) {
                throw error;
            }
            throw new IllegalStateException("The supplied runtime launcher failed", cause);
        }
    }
}
