package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.CompoundTag.class)
public class CompoundTag_1141285295Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/String;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void remove__984942239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-984942239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1585016883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1585016883L))
            info.setReturnValue(694122997);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/lang/String;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void get__832417841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832417841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "put(Ljava/lang/String;Lnet/minecraft/nbt/Tag;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void put__812625952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-812625952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_232658530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(232658530L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1911708323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911708323L))
            info.setReturnValue("o(!?u8pcMJ\uD583f\u5377<N|_47\uC401VScBo`z\u4BD4!B\u55E88\"\u5A319I^om6mvo\u2D89/F^9MKG\u1DB9^*M7h\uB0C3\u51B2p#rd\uBBC1Z1\u341DC5d");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/Collection;", cancellable = true)
    private void values_1989944512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1989944512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1698636889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698636889L))
            info.setReturnValue(-1053520872);
    }

    @Inject(at = @At("HEAD"), method = "getBoolean(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getBoolean__761794428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-761794428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putBoolean(Ljava/lang/String;Z)V", cancellable = true)
    private void putBoolean__587000646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-587000646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getByte(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getByte_1094476560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094476560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putByte(Ljava/lang/String;B)V", cancellable = true)
    private void putByte__297976512(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-297976512L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getShort(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getShort_570403416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(570403416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putShort(Ljava/lang/String;S)V", cancellable = true)
    private void putShort__707144505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-707144505L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInt(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getInt_449620107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(449620107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putInt(Ljava/lang/String;I)V", cancellable = true)
    private void putInt__334123920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-334123920L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLong(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getLong__1365723260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1365723260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putLong(Ljava/lang/String;J)V", cancellable = true)
    private void putLong_385237692(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(385237692L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getFloat_519499832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519499832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putFloat(Ljava/lang/String;F)V", cancellable = true)
    private void putFloat_1609146650(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1609146650L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDouble(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getDouble__124023527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-124023527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putDouble(Ljava/lang/String;D)V", cancellable = true)
    private void putDouble_1667304523(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1667304523L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Lcom/mojang/serialization/MapCodec;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)V", cancellable = true)
    private void store_134017763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(134017763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Ljava/lang/String;Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)V", cancellable = true)
    private void store__1312064285(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1312064285L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Lcom/mojang/serialization/MapCodec;Ljava/lang/Object;)V", cancellable = true)
    private void store_1343949645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1343949645L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Ljava/lang/String;Lcom/mojang/serialization/Codec;Ljava/lang/Object;)V", cancellable = true)
    private void store__1741274803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1741274803L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void copy_1609474769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609474769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__425092602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-425092602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__2094565630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2094565630L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/lang/String;)Z", cancellable = true)
    private void contains_1140091504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1140091504L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "merge(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void merge_672677993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672677993L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "entrySet()Ljava/util/Set;", cancellable = true)
    private void entrySet__93418688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-93418688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId__517045028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-517045028L))
            info.setReturnValue(35);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__567806447(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-567806447L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept_784245515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(784245515L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEach_1279522606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1279522606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write__1781249558(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1781249558L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keySet()Ljava/util/Set;", cancellable = true)
    private void keySet_541737325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541737325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__1692552815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692552815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Ljava/lang/String;Lcom/mojang/serialization/Codec;)Ljava/util/Optional;", cancellable = true)
    private void read_2075305089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2075305089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lcom/mojang/serialization/MapCodec;)Ljava/util/Optional;", cancellable = true)
    private void read__367465929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-367465929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Ljava/lang/String;Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/DynamicOps;)Ljava/util/Optional;", cancellable = true)
    private void read__791577631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-791577631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lcom/mojang/serialization/MapCodec;Lcom/mojang/serialization/DynamicOps;)Ljava/util/Optional;", cancellable = true)
    private void read__14831637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-14831637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getString(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getString_87564633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87564633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_596048815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(596048815L))
            info.setReturnValue(-1610278330);
    }

    @Inject(at = @At("HEAD"), method = "getShortOr(Ljava/lang/String;S)S", cancellable = true)
    private void getShortOr_669179424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669179424L))
            info.setReturnValue((short) 9997);
    }

    @Inject(at = @At("HEAD"), method = "getIntOr(Ljava/lang/String;I)I", cancellable = true)
    private void getIntOr__1705799233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1705799233L))
            info.setReturnValue(-1674113208);
    }

    @Inject(at = @At("HEAD"), method = "getFloatOr(Ljava/lang/String;F)F", cancellable = true)
    private void getFloatOr_472547750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(472547750L))
            info.setReturnValue(5.65705E7F);
    }

    @Inject(at = @At("HEAD"), method = "getBooleanOr(Ljava/lang/String;Z)Z", cancellable = true)
    private void getBooleanOr_396868378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(396868378L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "storeNullable(Ljava/lang/String;Lcom/mojang/serialization/Codec;Ljava/lang/Object;)V", cancellable = true)
    private void storeNullable__92350484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-92350484L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "storeNullable(Ljava/lang/String;Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)V", cancellable = true)
    private void storeNullable_1989668260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1989668260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDoubleOr(Ljava/lang/String;D)D", cancellable = true)
    private void getDoubleOr_488819203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488819203L))
            info.setReturnValue(5.6570500355925806E7D);
    }

    @Inject(at = @At("HEAD"), method = "putString(Ljava/lang/String;Ljava/lang/String;)V", cancellable = true)
    private void putString__1699841547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1699841547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getList(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getList__2117806298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2117806298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListOrEmpty(Ljava/lang/String;)Lnet/minecraft/nbt/ListTag;", cancellable = true)
    private void getListOrEmpty__1101126931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1101126931L))
            info.setReturnValue(new net.minecraft.nbt.ListTag());
    }

    @Inject(at = @At("HEAD"), method = "getByteArray(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getByteArray_1944372429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944372429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntArray(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getIntArray__1533299662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1533299662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongArray(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getLongArray_487528665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487528665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putIntArray(Ljava/lang/String;[I)V", cancellable = true)
    private void putIntArray_1142614656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1142614656L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCompound(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getCompound__1305680653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1305680653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringOr(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void getStringOr_96536813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(96536813L))
            info.setReturnValue("^;/\uAE43v5\u5987\u5AFD@\u99F3\"n\u0E31\u7DAEM;#OtvEz\u1964|7B?UAv?p%w2u>\"`!&! 1E=31aP@\u2EC5\u3AA64.mG9EqiI::1GoJu}mTn\u2D90wq#o76\u28AD7>O");
    }

    @Inject(at = @At("HEAD"), method = "putByteArray(Ljava/lang/String;[B)V", cancellable = true)
    private void putByteArray_1531239952(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1531239952L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putLongArray(Ljava/lang/String;[J)V", cancellable = true)
    private void putLongArray__852099956(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-852099956L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCompoundOrEmpty(Ljava/lang/String;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getCompoundOrEmpty_267211207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(267211207L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "asCompound()Ljava/util/Optional;", cancellable = true)
    private void asCompound_546444377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(546444377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongOr(Ljava/lang/String;J)J", cancellable = true)
    private void getLongOr__2093691398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2093691398L))
            info.setReturnValue(-4543483966189913425L);
    }

    @Inject(at = @At("HEAD"), method = "getByteOr(Ljava/lang/String;B)B", cancellable = true)
    private void getByteOr_1265121142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1265121142L))
            info.setReturnValue(-14);
    }


}
