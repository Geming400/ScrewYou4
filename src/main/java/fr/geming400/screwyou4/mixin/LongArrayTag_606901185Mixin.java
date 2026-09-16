package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.LongArrayTag.class)
public class LongArrayTag_606901185Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/nbt/LongTag;", cancellable = true)
    private void remove_1904977734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904977734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void remove_203445994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(203445994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1050632773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050632773L))
            info.setReturnValue(90878563);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/nbt/LongTag;", cancellable = true)
    private void get__194873832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-194873832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void get__364683588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-364683588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__301725580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301725580L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1377324213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1377324213L))
            info.setReturnValue("LkLY_5M5!hi4@Z#!TWj=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1164252779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164252779L))
            info.setReturnValue(-856722304);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__178926522(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-178926522L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/LongArrayTag;", cancellable = true)
    private void copy_1636017955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636017955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__959476712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-959476712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId__1051429138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1051429138L))
            info.setReturnValue(47);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__1102190557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1102190557L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept_249861405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(249861405L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write_1979333628(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1979333628L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType_2068030371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2068030371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_61664705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(61664705L))
            info.setReturnValue(305036521);
    }

    @Inject(at = @At("HEAD"), method = "addTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void addTag_1855081861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855081861L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAsLongArray()[J", cancellable = true)
    private void getAsLongArray__831854461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831854461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asLongArray()Ljava/util/Optional;", cancellable = true)
    private void asLongArray__1186002535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1186002535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void setTag__999600826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-999600826L))
            info.setReturnValue(false);
    }


}
