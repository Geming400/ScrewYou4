package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.achievement.StatsScreen.class)
public class StatsScreen_910252163Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_2136267644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2136267644L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onStatsUpdated()V", cancellable = true)
    private void onStatsUpdated__1427265158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1427265158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1897131804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1897131804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_879198531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(879198531L))
            info.setReturnValue(false);
    }


}
