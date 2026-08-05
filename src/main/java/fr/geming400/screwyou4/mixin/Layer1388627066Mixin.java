package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SingleQuadParticle.Layer.class)
public class Layer1388627066Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1520827971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520827971L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_253167091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253167091L))
            info.setReturnValue("더]}_쨝[;6z'RT쓧HkCS2U");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1426889808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426889808L))
            info.setReturnValue(392674102);
    }

    @Inject(at = @At("HEAD"), method = "translucent()Z", cancellable = true)
    private void translucent_1426905649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426905649L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "textureAtlasLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void textureAtlasLocation__1054439487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1054439487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bySprite(Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;)Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private static void bySprite__883480837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-883480837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline__1908932018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1908932018L))
            info.setReturnValue(null);
    }


}
