package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.AccessibilityOnboardingScreen.class)
public class AccessibilityOnboardingScreen1629363527Mixin {
        @Inject(at = @At("HEAD"), method = "init()V", cancellable = true)
    private void init_1318676714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1318676714L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1439588287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1439588287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1678724127(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1678724127L))
            info.cancel();
    }


}
