package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.AccessibilityOnboardingScreen.class)
public class AccessibilityOnboardingScreen1629363527Mixin {
        @Inject(at = @At("HEAD"), method = "init()V", cancellable = true)
    private void init_1667638266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1667638266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1667638266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1667638266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_669676155(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(669676155L))
            info.cancel();
    }


}
