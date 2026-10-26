package fr.geming400.screwyou4.killer;

import fr.geming400.screwyou4.killer.parser.ConstantPool;
import fr.geming400.screwyou4.killer.parser.Field;
import fr.geming400.screwyou4.killer.parser.Infos;
import fr.geming400.screwyou4.killer.parser.PoolEntry;

import java.lang.classfile.Opcode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

public class BytecodeGenerator {

    private final Infos.MethodInfo method;
    private final ConstantPool constantPool;
    private short maxStack;
    private short maxLocals;
    private final ArrayList<Byte> bytes = new ArrayList<>();

    public BytecodeGenerator(Infos.MethodInfo method, ConstantPool constantPool) {
        this.method = method;
        this.constantPool = constantPool;
        String desc = method.getDesc();
        this.maxLocals = BytecodeUtils.getParametersSize(desc.substring(desc.indexOf("(") + 1, desc.lastIndexOf(")")), true);
        this.maxLocals++;
        this.maxStack = this.maxLocals;
    }

    public Field.IntPrefixedArrayField<Field.ByteField> toArray() {
        ByteBuffer buffer = ByteBuffer.allocate(16 + this.bytes.size());
        buffer.putInt(12 + this.bytes.size());
        buffer.putShort(this.maxStack);
        buffer.putShort(this.maxLocals);
        buffer.putInt(this.bytes.size());
        for (Byte b : this.bytes) {
            buffer.put(b);
        }
        buffer.putInt(0);
        return new Field.IntPrefixedArrayField<>(buffer.flip(), Field.ByteField::new);
    }

    private void addShortToBytes(short value) {
        this.bytes.add((byte) (value >> 8));
        this.bytes.add((byte) value);
    }

    public void returnVoid() {
        this.bytes.add((byte) Opcode.RETURN.bytecode());
    }

    public void returnPrimitive() {
        this.bytes.add((byte) Opcode.IRETURN.bytecode());
    }

    public void returnObject() {
        this.bytes.add((byte) Opcode.ARETURN.bytecode());
    }

    public void returnLong() {
        this.bytes.add((byte) Opcode.LRETURN.bytecode());
    }

    public void returnFloat() {
        this.bytes.add((byte) Opcode.FRETURN.bytecode());
    }

    public void returnDouble() {
        this.bytes.add((byte) Opcode.DRETURN.bytecode());
    }

    public void loadConstant(short index) {
        this.maxStack++;
        this.bytes.add((byte) Opcode.LDC_W.bytecode());
        this.addShortToBytes(index);
    }

    public void loadLongConstant(short index) {
        this.maxStack++;
        this.maxStack++;
        this.bytes.add((byte) Opcode.LDC2_W.bytecode());
        this.addShortToBytes(index);
    }

    public void pushByte(Byte b) {
        this.maxStack++;
        this.bytes.add((byte) Opcode.BIPUSH.bytecode());
        this.bytes.add(b);
    }

    public void pushShort(short s) {
        this.maxStack++;
        this.bytes.add((byte) Opcode.SIPUSH.bytecode());
        this.addShortToBytes(s);
    }

    public void pushInt(int i) {
        short index = this.constantPool.getIndex(
                PoolEntry.IntPoolEntry.class,
                ConstantPool.sameValue(i),
                () -> new PoolEntry.IntPoolEntry(i));
        this.loadConstant(index);
    }

    public void pushLong(long l) {
        short index = this.constantPool.getIndex(
                PoolEntry.LongPoolEntry.class,
                ConstantPool.sameValue(l),
                () -> new PoolEntry.LongPoolEntry(l));
        this.loadLongConstant(index);
    }

    public void pushFloat(float f) {
        short index = this.constantPool.getIndex(
                PoolEntry.FloatPoolEntry.class,
                ConstantPool.sameValue(f),
                () -> new PoolEntry.FloatPoolEntry(f));
        this.loadConstant(index);
    }

    public void pushDouble(double d) {
        short index = this.constantPool.getIndex(
                PoolEntry.DoublePoolEntry.class,
                ConstantPool.sameValue(d),
                () -> new PoolEntry.DoublePoolEntry(d));
        this.loadLongConstant(index);
    }

    public void pushNull() {
        this.maxStack++;
        this.bytes.add((byte) Opcode.ACONST_NULL.bytecode());
    }

    public void pushString(String string) {
        this.maxStack++;
        short index = this.constantPool.getIndex(
                PoolEntry.StringPoolEntry.class,
                ConstantPool.sameReference(string, this.constantPool),
                () -> new PoolEntry.StringPoolEntry(
                        this.constantPool.getIndex(
                                PoolEntry.Utf8PoolEntry.class,
                                ConstantPool.sameValue(string),
                                () -> new PoolEntry.Utf8PoolEntry(string)
                        )
                ));
        this.loadConstant(index);
    }

    private void invoke(Opcode opcode, Class<?> owningClass, String methodName, Class<?> returnType, Class<?>... parametersTypes) {
        String signature = BytecodeUtils.getTypeSignature(returnType, parametersTypes);
        String owningClassName = BytecodeUtils.getShortBytecodeClassName(owningClass);
        short index = this.constantPool.getIndex(
                PoolEntry.MethodReferencePoolEntry.class,
                methodReferencePoolEntry -> methodReferencePoolEntry.getField1().<PoolEntry.ClassPoolEntry>getExpected(this.constantPool).getField().<PoolEntry.Utf8PoolEntry>getExpected(this.constantPool).getValue().equals(owningClassName)
                        && ConstantPool.sameReference(methodName, signature, this.constantPool).test(methodReferencePoolEntry.getField2().getExpected(this.constantPool)),
                () -> new PoolEntry.MethodReferencePoolEntry(
                        this.constantPool.getIndex(
                                PoolEntry.ClassPoolEntry.class,
                                ConstantPool.sameReference(owningClassName, this.constantPool),
                                () -> new PoolEntry.ClassPoolEntry(
                                        this.constantPool.getIndex(
                                                PoolEntry.Utf8PoolEntry.class,
                                                ConstantPool.sameValue(owningClassName),
                                                () -> new PoolEntry.Utf8PoolEntry(owningClassName)
                                        )
                                )
                        ),
                        this.constantPool.getIndex(
                                PoolEntry.NameAndTypePoolEntry.class,
                                ConstantPool.sameReference(methodName, signature, this.constantPool),
                                () -> new PoolEntry.NameAndTypePoolEntry(
                                        this.constantPool.getIndex(
                                                PoolEntry.Utf8PoolEntry.class,
                                                ConstantPool.sameValue(methodName),
                                                () -> new PoolEntry.Utf8PoolEntry(methodName)
                                        ),
                                        this.constantPool.getIndex(
                                                PoolEntry.Utf8PoolEntry.class,
                                                ConstantPool.sameValue(signature),
                                                () -> new  PoolEntry.Utf8PoolEntry(signature)
                                        )
                                )
                        )
                )
        );
        this.bytes.add((byte) opcode.bytecode());
        this.addShortToBytes(index);
        this.maxStack = (short) (this.maxStack + BytecodeUtils.getStackSize(returnType) - Arrays.stream(parametersTypes).mapToInt(BytecodeUtils::getStackSize).sum());
    }

    public void invokeVirtual(Class<?> owningClass, String methodName, Class<?> returnType, Class<?>... parametersTypes) {
        this.invoke(Opcode.INVOKEVIRTUAL, owningClass, methodName, returnType, parametersTypes);
    }

    public void invokeStatic(Class<?> owningClass, String methodName, Class<?> returnType, Class<?>... parametersTypes) {
        this.invoke(Opcode.INVOKESTATIC, owningClass, methodName, returnType, parametersTypes);
    }
}
