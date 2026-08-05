package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.KeyDispatchDataCodec.class)
public class KeyDispatchDataCodec_712683543Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2098195801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098195801L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__422776433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-422776433L))
            info.setReturnValue("v_u3xF8oE3Qwmno8P\uA990sQwjDIn:lW-cF\uD588+WD ?75.2Ms{CxK-%1|loN#/Z\u37FBjQdovID3/Hev\uAFFDM{`3TW=\uD462ZJF!>j}\u4EF5m\u5099");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_750946284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750946284L))
            info.setReturnValue(-810682179);
    }

    @Inject(at = @At("HEAD"), method = "of(Lcom/mojang/serialization/MapCodec;)Lnet/minecraft/util/KeyDispatchDataCodec;", cancellable = true)
    private static void of__1756292523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1756292523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1846430030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846430030L))
            info.setReturnValue(null);
    }


}
