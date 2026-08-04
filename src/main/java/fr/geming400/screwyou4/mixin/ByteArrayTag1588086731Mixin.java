package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.ByteArrayTag.class)
public class ByteArrayTag1588086731Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/nbt/ByteTag;", cancellable = true)
    private void remove__274205607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-274205607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void remove__1094500239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1094500239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1626348977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1626348977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/nbt/ByteTag;", cancellable = true)
    private void get__274205607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-274205607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void get__1094500239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1094500239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1321368802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1321368802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_452626260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452626260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1626348977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1626348977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1626361470(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1626361470L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__1163593480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163593480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_1626342250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1626342250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept__726569952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-726569952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__1736724938(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1736724938L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write__2123825402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2123825402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__1290255010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1290255010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_1626348977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1626348977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asByteArray()Ljava/util/Optional;", cancellable = true)
    private void asByteArray_1833548153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1833548153L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void addTag__960665047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-960665047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsByteArray()[B", cancellable = true)
    private void getAsByteArray__1521045935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1521045935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void setTag__960665047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-960665047L))
            info.setReturnValue(null);
    }


}
