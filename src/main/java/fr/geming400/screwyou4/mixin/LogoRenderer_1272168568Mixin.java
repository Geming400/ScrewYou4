package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.LogoRenderer.class)
public class LogoRenderer_1272168568Mixin {
        @Inject(at = @At("HEAD"), method = "keepLogoThroughFade()Z", cancellable = true)
    private void keepLogoThroughFade__348762403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-348762403L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IF)V", cancellable = true)
    private void extractRenderState_53512342(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(53512342L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IFI)V", cancellable = true)
    private void extractRenderState__2119035977(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2119035977L))
            info.cancel();
    }


}
