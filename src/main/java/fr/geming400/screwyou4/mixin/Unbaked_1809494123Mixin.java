package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.ShulkerBoxSpecialRenderer.Unbaked.class)
public class Unbaked_1809494123Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__749619450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-749619450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1099960915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099960915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_674034147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674034147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1847756864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1847756864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texture__633572431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-633572431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/ShulkerBoxSpecialRenderer;", cancellable = true)
    private void bake__102296648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-102296648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake_121471262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(121471262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openness()F", cancellable = true)
    private void openness_1847753485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1847753485L))
            info.setReturnValue(null);
    }


}
