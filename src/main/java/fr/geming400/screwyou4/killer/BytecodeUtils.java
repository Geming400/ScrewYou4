package fr.geming400.screwyou4.killer;

import fr.geming400.screwyou4.killer.parser.ClassRepresentation;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class BytecodeUtils {

    public static short getParametersSize(String desc, boolean longDoubleAdd) {
        short parametersSize = 0;
        boolean inParameterType = false;
        boolean inArray = false;
        for (char c : desc.toCharArray()) {
            if (c == ';') {
                inParameterType = false;
                inArray = false;
            }

            if (c == '[') {
                inArray = true;
                continue;
            }

            if (inParameterType) {
                continue;
            }

            if ("BCDFIJSZ".contains(String.valueOf(c))) {
                parametersSize++;
                if (longDoubleAdd && !inArray && (c == 'D' || c == 'J')) {
                    parametersSize++;
                }

                inArray = false;
            }

            if (c == 'L') {
                parametersSize++;
                inParameterType = true;
            }
        }

        return parametersSize;
    }

    public static int getStackSize(Class<?> clazz) {
        if (clazz.isPrimitive()) {
            if (clazz == Double.class || clazz == double.class || clazz == Float.class || clazz == float.class) {
                return 2;
            } else if (clazz == Void.class || clazz == void.class) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    private static <C> String getBytecodeClassName(Class<C> clazz, boolean shenanigans) {
        if (clazz.isPrimitive()) {
            return switch (clazz) {
                case Class<C> _ when clazz.equals(boolean.class) -> "Z";
                case Class<C> _ when clazz.equals(byte.class) -> "B";
                case Class<C> _ when clazz.equals(short.class) -> "S";
                case Class<C> _ when clazz.equals(char.class) -> "C";
                case Class<C> _ when clazz.equals(int.class) -> "I";
                case Class<C> _ when clazz.equals(long.class) -> "J";
                case Class<C> _ when clazz.equals(float.class) -> "F";
                case Class<C> _ when clazz.equals(double.class) -> "D";
                case Class<C> _ when clazz.equals(void.class) -> "V";
                default -> throw new IllegalStateException("Wtf even happened ?");
            };
        } else if (clazz.isArray()) {
            return "[" + getBytecodeClassName(clazz.getComponentType(), shenanigans);
        } else {
            if (shenanigans) {
                return "L" + clazz.getName().replace('.', '/') + ";";
            } else {
                return clazz.getName().replace('.', '/');
            }
        }
    }

    public static String getFullBytecodeClassName(Class<?> clazz) {
        return getBytecodeClassName(clazz, true);
    }

    public static String getShortBytecodeClassName(Class<?> clazz) {
        return getBytecodeClassName(clazz, false);
    }

    public static String getTypeSignature(Class<?> returnType, Class<?>... parametersTypes) {
        return "(" + Arrays.stream(parametersTypes).map(BytecodeUtils::getFullBytecodeClassName).collect(Collectors.joining()) + ")" + getFullBytecodeClassName(returnType);
    }

    public static String getFullSignature(String methodName, Class<?> returnType, Class<?>... parametersTypes) {
        return methodName + getTypeSignature(returnType, parametersTypes);
    }
}
