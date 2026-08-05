package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.HiddenByteBuf.class)
public class HiddenByteBuf_910724893Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2098624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098624L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1681148417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681148417L))
            info.setReturnValue("[McF}F\u314Ap5/5Kbl&|dB)\"!D\u72D3\u1AB4z.\u77814n:4$8aQ,5D.\u1C4F?r-\u52AExYM.?7.CKDaFRc7@$#\u88FA\u4B32\uC9BF\u14E1GnB8VtxO*\uB073v2k]='+zC\u9A4Ez\"*6h");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1468076983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1468076983L))
            info.setReturnValue(-140428525);
    }

    @Inject(at = @At("HEAD"), method = "release(I)Z", cancellable = true)
    private void release__1502458861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502458861L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "release()Z", cancellable = true)
    private void release__1107662548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1107662548L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void contents_1914460980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1914460980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private static void pack__11571028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-11571028L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "touch()Lnet/minecraft/network/HiddenByteBuf;", cancellable = true)
    private void touch__1889171787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1889171787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch(Ljava/lang/Object;)Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void touch_948215187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948215187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch()Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void touch_987056239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987056239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch(Ljava/lang/Object;)Lnet/minecraft/network/HiddenByteBuf;", cancellable = true)
    private void touch_275892241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(275892241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private static void unpack_872857029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872857029L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "retain()Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void retain_98922293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98922293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain(I)Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void retain_1307962162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1307962162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain(I)Lnet/minecraft/network/HiddenByteBuf;", cancellable = true)
    private void retain_773531090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(773531090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain()Lnet/minecraft/network/HiddenByteBuf;", cancellable = true)
    private void retain_1482468271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1482468271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refCnt()I", cancellable = true)
    private void refCnt__1418447124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1418447124L))
            info.setReturnValue(628731320);
    }


}
