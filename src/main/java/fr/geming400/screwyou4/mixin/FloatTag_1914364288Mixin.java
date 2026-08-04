package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.FloatTag.class)
public class FloatTag_1914364288Mixin {
        @Inject(at = @At("HEAD"), method = "value()F", cancellable = true)
    private void value_1952623650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952623650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__995090750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-995090750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_778903816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778903816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1952627029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952627029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byteValue()B", cancellable = true)
    private void byteValue_1952619806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952619806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shortValue()S", cancellable = true)
    private void shortValue_1952636143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952636143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intValue()I", cancellable = true)
    private void intValue_1952626533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952626533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "longValue()J", cancellable = true)
    private void longValue_1952627494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952627494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "floatValue()F", cancellable = true)
    private void floatValue_1952623650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952623650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doubleValue()D", cancellable = true)
    private void doubleValue_1952621728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952621728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(F)Lnet/minecraft/nbt/FloatTag;", cancellable = true)
    private static void valueOf_1439189006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1439189006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__837186964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-837186964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/FloatTag;", cancellable = true)
    private void copy__1234474292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1234474292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_1952619806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952619806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__1410447382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1410447382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept__400292396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-400292396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write__1797547846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1797547846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__963977454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963977454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box()Ljava/lang/Number;", cancellable = true)
    private void box__1676854576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1676854576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_1952626533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952626533L))
            info.setReturnValue(null);
    }


}
