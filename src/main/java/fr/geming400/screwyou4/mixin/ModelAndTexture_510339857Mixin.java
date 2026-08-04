package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.ModelAndTexture.class)
public class ModelAndTexture_510339857Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1895852115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1895852115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__625120119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625120119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_548602598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548602598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "model()Ljava/lang/Object;", cancellable = true)
    private void model__1925435221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1925435221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;Ljava/lang/Object;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec__2098757369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2098757369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asset()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void asset__741841364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-741841364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec__1760387949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1760387949L))
            info.setReturnValue(null);
    }


}
