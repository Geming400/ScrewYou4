package fr.geming400.screwyou4.killer;

import fr.geming400.screwyou4.agent.Agent;
import fr.geming400.screwyou4.killer.parser.ClassRepresentation;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.jetbrains.annotations.Nullable;

import java.lang.instrument.Instrumentation;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public class ClassExecutioner implements PreLaunchEntrypoint {

    private static Class<?> agentClass;
    private static ClassJudger classJudger;

    public static void kill(Sentence sentence) {
        Class<?>[] classes = getLoadedClasses();
        Class<?> toKill;
        toKill = classes[sentence.random().nextInt(classes.length)];
        tryRetransform(sentence, toKill, _ -> kill(sentence));
    }

    public static Class<?>[] getLoadedClasses() {
        checkClassDecoderPresent();
        Instrumentation inst = classJudger.getInstrumentation();
        return (Class<?>[]) inst.getAllLoadedClasses();
    }

    public static void tryRetransform(Sentence sentence, Class<?> toKill, @Nullable Consumer<Exception> exceptionCallback) {
        classJudger.addToKill(toKill, sentence);
        Thread.ofVirtual().start(
                () -> {
                    try {
                        classJudger.killClass(toKill);
                    } catch (Exception e) {
                        classJudger.cancel(toKill);
                        if (exceptionCallback != null) {
                            exceptionCallback.accept(e);
                        }
                    }
                }
        );
    }

    public static ClassRepresentation getRepresentation(Class<?> toKill) {
        AtomicReference<ClassRepresentation> classRepresentation = new AtomicReference<>();
        classJudger.addToKill(toKill, Sentence.ofGetter(b -> classRepresentation.set(new ClassRepresentation(b))));
        try {
            classJudger.killClass(toKill);
        } catch (Exception e) {
            classJudger.cancel(toKill);
            return null;
        }
        return classRepresentation.get();
    }

    @Override
    public void onPreLaunch() {
        try {
            Agent.class.getDeclaredMethod("launch").invoke(null);
            agentClass = ClassLoader.getSystemClassLoader().loadClass(Agent.class.getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ClassJudger.preparePostMortem();
    }

    private static void checkClassDecoderPresent() {
        if (classJudger == null) {
            try {
                classJudger = new ClassJudger(((Instrumentation) agentClass.getDeclaredMethod("getInstrumentationOrThrow").invoke(null)));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
