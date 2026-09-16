package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SingleQuadParticle.Layer.class)
public class Layer1388627066Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_480000798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480000798L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2135916705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2135916705L))
            info.setReturnValue("\u11CEPYgXq;\u2784\u25B5ci@}7/0|!^\u31CB\u8C96pLyf<E\uD5FDd/EcO\u74563JJUTp2e\u4A13!/\u5DD26\u5436c8\u186CkC,;`d3#\u749B9_\uFEFAUge)m.m2j");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1945979157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945979157L))
            info.setReturnValue(-1602807643);
    }

    @Inject(at = @At("HEAD"), method = "bySprite(Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;)Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private static void bySprite_1074040823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1074040823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline__513662736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-513662736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translucent()Z", cancellable = true)
    private void translucent_1580698232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580698232L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "textureAtlasLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void textureAtlasLocation_1288612550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288612550L))
            info.setReturnValue(null);
    }


}
