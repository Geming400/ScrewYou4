package fr.geming400.screwyou4.killer.parser;

import java.nio.ByteBuffer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConstantPool implements ClassWriteable {

    private final Field.ConstantPoolEntriesArray entries;
    public final ClassRepresentation classRepresentation;

    public ConstantPool(ByteBuffer buffer, ClassRepresentation classRepresentation) {
        this.entries = new Field.ConstantPoolEntriesArray(buffer);
        this.classRepresentation = classRepresentation;
    }

    @Override
    public String toString() {
        return this.entries.format("", this);
    }

    public PoolEntry get(int index) {
        return this.entries.get(index);
    }

    @SuppressWarnings("unchecked")
    public <P extends PoolEntry> P get(Class<P> targetType, Predicate<P> predicate, Supplier<P> defaultEntry) {
        return (P) this.entries.value.stream().filter(entry -> targetType.isInstance(entry) && predicate.test((P) entry)).findFirst().orElseGet(() -> {
            P entry = defaultEntry.get();
            this.entries.append(entry);
            return entry;
        });
    }

    public <P extends PoolEntry> short getIndex(Class<P> targetType, Predicate<P> predicate, Supplier<P> defaultEntry) {
        return (short) this.entries.value.indexOf(this.get(targetType, predicate, defaultEntry));
    }

    public void append(PoolEntry entry) {
        this.entries.append(entry);
    }

    public <P extends PoolEntry> P getExpected(int index) {
        // noinspection unchecked
        return (P) this.entries.get(index);
    }

    @Override
    public void write(ByteBuffer buffer) {
        this.entries.write(buffer);
    }

    @Override
    public String format(String name, ConstantPool constantPool) {
        return "";
    }

    @Override
    public int size() {
        return this.entries.size();
    }

    public static <P extends PoolEntry.OneFieldPoolEntry<F, V>, F extends Field<V>, V> Predicate<P> sameValue(V value) {
        return entry -> entry.getValue().equals(value);
    }

    public static <P extends PoolEntry.TwoFieldsPoolEntry<F1, F2, V1, V2>, F1 extends Field<V1>, V1, F2 extends Field<V2>, V2> Predicate<P> sameValue(F1 value1, F2 value2) {
        return entry -> entry.getValue1().equals(value1) && entry.getValue2().equals(value2);
    }

    public static <P extends PoolEntry.OneReferencePoolEntry, E extends PoolEntry.OneFieldPoolEntry<F, V>, F extends Field<V>, V> Predicate<P> sameReference(V value, ConstantPool constantPool) {
        return entry -> entry.getField().<E>getExpected(constantPool).getValue().equals(value);
    }

    public static <P extends PoolEntry.TwoReferencesPoolEntry, E1 extends PoolEntry.OneFieldPoolEntry<F1, V1>, E2 extends PoolEntry.OneFieldPoolEntry<F2, V2>, F1 extends Field<V1>, F2 extends Field<V2>, V1, V2> Predicate<P> sameReference(V1 value1, V2 value2, ConstantPool constantPool) {
        return entry -> entry.getField1().<E1>getExpected(constantPool).getValue().equals(value1) && entry.getField2().<E2>getExpected(constantPool).getValue().equals(value2);
    }
}
