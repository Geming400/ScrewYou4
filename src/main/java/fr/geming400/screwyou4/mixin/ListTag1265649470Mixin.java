package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.ListTag.class)
public class ListTag1265649470Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void remove__1417066460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417066460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remove(I)Ljava/lang/Object;", cancellable = true)
    private void remove__1455405760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455405760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1303911716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303911716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Ljava/lang/Object;", cancellable = true)
    private void get__1455405760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455405760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void get__1417066460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417066460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1643806063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643806063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_130188999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130188999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1303911716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303911716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShort(I)Ljava/util/Optional;", cancellable = true)
    private void getShort_2110860243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110860243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInt(I)Ljava/util/Optional;", cancellable = true)
    private void getInt_2110860243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110860243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(I)Ljava/util/Optional;", cancellable = true)
    private void getFloat_2110860243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110860243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDouble(I)Ljava/util/Optional;", cancellable = true)
    private void getDouble_2110860243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110860243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1303924209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1303924209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__1485901781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1485901781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/ListTag;", cancellable = true)
    private void copy__619188311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-619188311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1303928053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303928053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(ILnet/minecraft/nbt/Tag;)V", cancellable = true)
    private void add__1283106152(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1283106152L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(ILjava/lang/Object;)V", cancellable = true)
    private void add__1901428858(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1901428858L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stream()Ljava/util/stream/Stream;", cancellable = true)
    private void stream_1054943155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054943155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(ILnet/minecraft/nbt/Tag;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void set__1090257454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090257454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(ILjava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void set__2146611356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146611356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_1303904989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303904989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept__1049007213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1049007213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__2059162199(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2059162199L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write_1848704633(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1848704633L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__1612692271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612692271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asList()Ljava/util/Optional;", cancellable = true)
    private void asList_1511110892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511110892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getString(I)Ljava/util/Optional;", cancellable = true)
    private void getString_2110860243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110860243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_1303911716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303911716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDoubleOr(ID)D", cancellable = true)
    private void getDoubleOr_265135098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(265135098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFloatOr(IF)F", cancellable = true)
    private void getFloatOr_266984062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(266984062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntOr(II)I", cancellable = true)
    private void getIntOr_269757508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(269757508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShortOr(IS)S", cancellable = true)
    private void getShortOr_279002328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279002328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void addTag__1283102308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1283102308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList(I)Ljava/util/Optional;", cancellable = true)
    private void getList_2110860243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110860243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListOrEmpty(I)Lnet/minecraft/nbt/ListTag;", cancellable = true)
    private void getListOrEmpty__727467294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-727467294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compoundStream()Ljava/util/stream/Stream;", cancellable = true)
    private void compoundStream_1054943155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054943155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringOr(ILjava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void getStringOr__946076444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-946076444L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addAndUnwrap(Lnet/minecraft/nbt/Tag;)V", cancellable = true)
    private void addAndUnwrap_873968433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(873968433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIntArray(I)Ljava/util/Optional;", cancellable = true)
    private void getIntArray_2110860243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110860243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongArray(I)Ljava/util/Optional;", cancellable = true)
    private void getLongArray_2110860243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110860243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCompound(I)Ljava/util/Optional;", cancellable = true)
    private void getCompound_2110860243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110860243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCompoundOrEmpty(I)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getCompoundOrEmpty_1504320175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1504320175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void setTag__1283102308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1283102308L))
            info.setReturnValue(null);
    }


}
