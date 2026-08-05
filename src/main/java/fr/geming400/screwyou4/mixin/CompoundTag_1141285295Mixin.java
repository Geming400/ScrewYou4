package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.CompoundTag.class)
public class CompoundTag_1141285295Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/String;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void remove_712895333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712895333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1179547540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179547540L))
            info.setReturnValue(-1149816859);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/lang/String;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void get_712895333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712895333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "put(Ljava/lang/String;Lnet/minecraft/nbt/Tag;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void put_351319121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(351319121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1768170239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1768170239L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_5824823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(5824823L))
            info.setReturnValue("⢚xL]R埯ᥪRm*8 rEꖰ!ྨOFu,b5 䠽-D5ሂ5j蒘b%poEU'!n+}c䡫G0&)e,2꺝rKroeNN#G zcJo5x4낷RH꺩㯧踲SaKBeg_j㔌zjJ=Pm`!");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/Collection;", cancellable = true)
    private void values__672362978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-672362978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1179547540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179547540L))
            info.setReturnValue(-1149816859);
    }

    @Inject(at = @At("HEAD"), method = "getBoolean(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getBoolean__1143646446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143646446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putBoolean(Ljava/lang/String;Z)V", cancellable = true)
    private void putBoolean__1747124831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1747124831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getByte(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getByte__1143646446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143646446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putByte(Ljava/lang/String;B)V", cancellable = true)
    private void putByte__1769289335(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1769289335L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getShort(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getShort__1143646446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143646446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putShort(Ljava/lang/String;S)V", cancellable = true)
    private void putShort__1753589478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1753589478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInt(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getInt__1143646446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143646446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putInt(Ljava/lang/String;I)V", cancellable = true)
    private void putInt__1762824688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1762824688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLong(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getLong__1143646446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143646446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putLong(Ljava/lang/String;J)V", cancellable = true)
    private void putLong__1761901167(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1761901167L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getFloat__1143646446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143646446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putFloat(Ljava/lang/String;F)V", cancellable = true)
    private void putFloat__1765595251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1765595251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDouble(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getDouble__1143646446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143646446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putDouble(Ljava/lang/String;D)V", cancellable = true)
    private void putDouble__1767442293(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1767442293L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Lcom/mojang/serialization/MapCodec;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)V", cancellable = true)
    private void store_68567012(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(68567012L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Lcom/mojang/serialization/MapCodec;Ljava/lang/Object;)V", cancellable = true)
    private void store__1678959188(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1678959188L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Ljava/lang/String;Lcom/mojang/serialization/Codec;Ljava/lang/Object;)V", cancellable = true)
    private void store__455129842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-455129842L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Ljava/lang/String;Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)V", cancellable = true)
    private void store__1579127358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1579127358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void copy__428937626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-428937626L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__1610265957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610265957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1179563877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179563877L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/lang/String;)Z", cancellable = true)
    private void contains__2001317009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2001317009L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "merge(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void merge__468809167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-468809167L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "entrySet()Ljava/util/Set;", cancellable = true)
    private void entrySet__687750192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-687750192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_1179540813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179540813L))
            info.setReturnValue(110);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept__1173371389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1173371389L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept_2111440921(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2111440921L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEach__596865596(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-596865596L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write_1724340457(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1724340457L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keySet()Ljava/util/Set;", cancellable = true)
    private void keySet__687750192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-687750192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__1737056447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1737056447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Ljava/lang/String;Lcom/mojang/serialization/Codec;)Ljava/util/Optional;", cancellable = true)
    private void read__858554773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-858554773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Ljava/lang/String;Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/DynamicOps;)Ljava/util/Optional;", cancellable = true)
    private void read__1342739401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342739401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lcom/mojang/serialization/MapCodec;Lcom/mojang/serialization/DynamicOps;)Ljava/util/Optional;", cancellable = true)
    private void read__1803821483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803821483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lcom/mojang/serialization/MapCodec;)Ljava/util/Optional;", cancellable = true)
    private void read__142558835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-142558835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getString(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getString__1143646446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143646446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_1179547540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179547540L))
            info.setReturnValue(-1148818259);
    }

    @Inject(at = @At("HEAD"), method = "getList(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getList__1143646446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143646446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asCompound()Ljava/util/Optional;", cancellable = true)
    private void asCompound_1386746716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1386746716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putString(Ljava/lang/String;Ljava/lang/String;)V", cancellable = true)
    private void putString_2073473525(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2073473525L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getByteOr(Ljava/lang/String;B)B", cancellable = true)
    private void getByteOr__1769308555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1769308555L))
            info.setReturnValue(6);
    }

    @Inject(at = @At("HEAD"), method = "getIntOr(Ljava/lang/String;I)I", cancellable = true)
    private void getIntOr__1762837181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1762837181L))
            info.setReturnValue(1201743585);
    }

    @Inject(at = @At("HEAD"), method = "getShortOr(Ljava/lang/String;S)S", cancellable = true)
    private void getShortOr__1753592361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1753592361L))
            info.setReturnValue((short) 23959);
    }

    @Inject(at = @At("HEAD"), method = "getFloatOr(Ljava/lang/String;F)F", cancellable = true)
    private void getFloatOr__1765610627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1765610627L))
            info.setReturnValue(6.659033E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLongOr(Ljava/lang/String;J)J", cancellable = true)
    private void getLongOr__1761912699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1761912699L))
            info.setReturnValue(-6751118492590888156L);
    }

    @Inject(at = @At("HEAD"), method = "putByteArray(Ljava/lang/String;[B)V", cancellable = true)
    private void putByteArray_1844449202(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1844449202L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCompound(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getCompound__1143646446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143646446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByteArray(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getByteArray__1143646446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143646446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringOr(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void getStringOr__916803037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-916803037L))
            info.setReturnValue("MM껗7p)iI̋<<A$}幉',(3X춻Yhgo앜Q");
    }

    @Inject(at = @At("HEAD"), method = "getIntArray(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getIntArray__1143646446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143646446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCompoundOrEmpty(Ljava/lang/String;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getCompoundOrEmpty__441099024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-441099024L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "putLongArray(Ljava/lang/String;[J)V", cancellable = true)
    private void putLongArray_1851837370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1851837370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBooleanOr(Ljava/lang/String;Z)Z", cancellable = true)
    private void getBooleanOr__1747120987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747120987L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDoubleOr(Ljava/lang/String;D)D", cancellable = true)
    private void getDoubleOr__1767459591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1767459591L))
            info.setReturnValue(6.659033005606693E8D);
    }

    @Inject(at = @At("HEAD"), method = "getLongArray(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getLongArray__1143646446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143646446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "storeNullable(Ljava/lang/String;Lcom/mojang/serialization/Codec;Ljava/lang/Object;)V", cancellable = true)
    private void storeNullable__455129842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-455129842L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "storeNullable(Ljava/lang/String;Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)V", cancellable = true)
    private void storeNullable__1579127358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1579127358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putIntArray(Ljava/lang/String;[I)V", cancellable = true)
    private void putIntArray_1850913849(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1850913849L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getListOrEmpty(Ljava/lang/String;)Lnet/minecraft/nbt/ListTag;", cancellable = true)
    private void getListOrEmpty__155873885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155873885L))
            info.setReturnValue(new net.minecraft.nbt.ListTag());
    }


}
