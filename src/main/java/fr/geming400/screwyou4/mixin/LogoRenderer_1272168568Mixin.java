package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.LogoRenderer.class)
public class LogoRenderer_1272168568Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IF)V", cancellable = true)
    private void extractRenderState__1810395460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1810395460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IFI)V", cancellable = true)
    private void extractRenderState_229364305(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(229364305L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keepLogoThroughFade()Z", cancellable = true)
    private void keepLogoThroughFade_1310447150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1310447150L))
            info.setReturnValue(true);
    }


}
