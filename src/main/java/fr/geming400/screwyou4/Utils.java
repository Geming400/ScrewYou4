package fr.geming400.screwyou4;

import org.objectweb.asm.Type;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Objects;

public class Utils {
    private Utils() {}

    public static boolean isPackagePrivate(Method method) {
        int modifiers = method.getModifiers();
        return !Modifier.isPublic(modifiers)
                && !Modifier.isProtected(modifiers)
                && !Modifier.isPrivate(modifiers);
    }

    public static boolean hasDefaultAccessibleConstructor(Class<?> clazz) {
        if (Modifier.isAbstract(clazz.getModifiers()))
            return false;

        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            if (constructor.getParameterCount() == 0)
                return true;
        }

        return false;
    }

    public static long getUniqueMethodID(Method method) {
        return Objects.hash(Type.getMethodDescriptor(method), method.getModifiers(), method.getDeclaringClass().getName());
    }

    public static String getMixinSignature(Method method) {
        return method.getName() + Type.getMethodDescriptor(method);
    }

    public static boolean isVoid(Class<?> clazz) {
        return clazz.equals(Void.TYPE);
    }

    public static String getSimpleNameWithPackage(Class<?> clazz) {
        return clazz.getPackageName() + "." + clazz.getSimpleName();
    }
}
