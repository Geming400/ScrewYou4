package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.texture.TextureMetadataSection.class)
public class TextureMetadataSection1135161133Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1774293904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1774293904L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__298842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-298842L))
            info.setReturnValue("\u52ECioCpylbbgODX;_:QJ,Um@n^\u5015\u4B2B\u3D94eY#\u15AB\u531A(\u126B%/^k. b:J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1173423875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173423875L))
            info.setReturnValue(-1776306567);
    }

    @Inject(at = @At("HEAD"), method = "clamp()Z", cancellable = true)
    private void clamp_1173439716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173439716L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mipmapStrategy()Lnet/minecraft/client/renderer/texture/MipmapStrategy;", cancellable = true)
    private void mipmapStrategy_1756885616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756885616L))
            info.setReturnValue(net.minecraft.client.renderer.texture.MipmapStrategy.AUTO);
    }

    @Inject(at = @At("HEAD"), method = "alphaCutoffBias()F", cancellable = true)
    private void alphaCutoffBias_1173420496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173420496L))
            info.setReturnValue(9.762644E8F);
    }

    @Inject(at = @At("HEAD"), method = "blur()Z", cancellable = true)
    private void blur_1173439716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173439716L))
            info.setReturnValue(true);
    }


}
