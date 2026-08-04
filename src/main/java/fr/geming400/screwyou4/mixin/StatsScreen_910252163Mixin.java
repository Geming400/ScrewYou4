package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.achievement.StatsScreen.class)
public class StatsScreen_910252163Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_948526901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(948526901L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__49435210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-49435210L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__6383552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-6383552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onStatsUpdated()V", cancellable = true)
    private void onStatsUpdated_948526901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(948526901L))
            info.cancel();
    }


}
