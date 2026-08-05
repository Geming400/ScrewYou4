package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.ShulkerBoxSpecialRenderer.Unbaked.class)
public class Unbaked_1809494123Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_414243468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(414243468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_900867854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900867854L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1715049649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1715049649L))
            info.setReturnValue("\u8502FT\uD5C4)RMO-Hz[Fxjr \u2E94\u168EZjs{\u5F1B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1928121083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1928121083L))
            info.setReturnValue(1974974056);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__1312670793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1312670793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/ShulkerBoxSpecialRenderer;", cancellable = true)
    private void bake__1403252545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1403252545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texture__1654271540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654271540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openness()F", cancellable = true)
    private void openness_626793484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(626793484L))
            info.setReturnValue(6.453347E8F);
    }


}
