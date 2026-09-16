package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.texture.TextureMetadataSection.class)
public class TextureMetadataSection1135161133Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_226534865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226534865L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1905584658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905584658L))
            info.setReturnValue("+k>b,C\uAB9F!z|XV-Py6k/5: :\u0ED7-8v40\"/\u9D8BFPWt3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1692513224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692513224L))
            info.setReturnValue(-26347745);
    }

    @Inject(at = @At("HEAD"), method = "clamp()Z", cancellable = true)
    private void clamp__324085495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-324085495L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "blur()Z", cancellable = true)
    private void blur__891011875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-891011875L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mipmapStrategy()Lnet/minecraft/client/renderer/texture/MipmapStrategy;", cancellable = true)
    private void mipmapStrategy_1653766347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1653766347L))
            info.setReturnValue(net.minecraft.client.renderer.texture.MipmapStrategy.CUTOUT);
    }

    @Inject(at = @At("HEAD"), method = "alphaCutoffBias()F", cancellable = true)
    private void alphaCutoffBias__2142613492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142613492L))
            info.setReturnValue(3.699329E8F);
    }


}
