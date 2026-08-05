package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.HiddenByteBuf.class)
public class HiddenByteBuf_910724893Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1998730145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1998730145L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__224735083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224735083L))
            info.setReturnValue("TP|%Oj8=X^O9衪g*!.k4IE絛KZEP%}Jok^툆_GT/nuN4S)眭/m\"㮻ᥞsO[Jqᷙ0鴴6xwgG Bm!a読蠫㹗_麚q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_948987634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948987634L))
            info.setReturnValue(1500254753);
    }

    @Inject(at = @At("HEAD"), method = "release(I)Z", cancellable = true)
    private void release_2124645708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124645708L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "release()Z", cancellable = true)
    private void release_949003475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949003475L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void contents__1688180722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1688180722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private static void pack_922803091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(922803091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch()Lnet/minecraft/network/HiddenByteBuf;", cancellable = true)
    private void touch__1173523692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1173523692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch(Ljava/lang/Object;)Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void touch_476709780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476709780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch()Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void touch_1068817584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068817584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch(Ljava/lang/Object;)Lnet/minecraft/network/HiddenByteBuf;", cancellable = true)
    private void touch__474940752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-474940752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private static void unpack_922803091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(922803091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refCnt()I", cancellable = true)
    private void refCnt_948987138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948987138L))
            info.setReturnValue(1777273961);
    }

    @Inject(at = @At("HEAD"), method = "retain(I)Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void retain_1309945111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1309945111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain()Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void retain_1068817584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068817584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain(I)Lnet/minecraft/network/HiddenByteBuf;", cancellable = true)
    private void retain_42158861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(42158861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain()Lnet/minecraft/network/HiddenByteBuf;", cancellable = true)
    private void retain__1173523692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1173523692L))
            info.setReturnValue(null);
    }


}
