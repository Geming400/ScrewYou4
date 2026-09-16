package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.ModelAndTexture.class)
public class ModelAndTexture_510339857Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__398286412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-398286412L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1280763381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1280763381L))
            info.setReturnValue("s,JNYJr(KzWPVQl\u2714fo\uA454f:]jj%d");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1067691947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067691947L))
            info.setReturnValue(1236231402);
    }

    @Inject(at = @At("HEAD"), method = "model()Ljava/lang/Object;", cancellable = true)
    private void model_509835028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509835028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;Ljava/lang/Object;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec__343587407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-343587407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_40439945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(40439945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asset()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void asset_2023405852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023405852L))
            info.setReturnValue(null);
    }


}
