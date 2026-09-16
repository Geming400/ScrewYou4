package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.debug.GameModeSwitcherScreen.class)
public class GameModeSwitcherScreen_651375584Mixin {
        @Inject(at = @At("HEAD"), method = "keyReleased(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyReleased_546690393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(546690393L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased_1235511543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1235511543L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1638255225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1638255225L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_620321952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(620321952L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_1387197982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387197982L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_2052830116(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2052830116L))
            info.cancel();
    }


}
