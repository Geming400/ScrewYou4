package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.random.Weighted.class)
public class Weighted1003718235Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__1432056842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1432056842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1905736802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905736802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__131741740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131741740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1041980977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1041980977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/util/random/Weighted;", cancellable = true)
    private void map_414672055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(414672055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weight()I", cancellable = true)
    private void weight_1041980481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1041980481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/MapCodec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__493191094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-493191094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1487396210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487396210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec__1267009570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1267009570L))
            info.setReturnValue(null);
    }


}
