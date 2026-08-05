package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.debug.GameModeSwitcherScreen.class)
public class GameModeSwitcherScreen_651375584Mixin {
        @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__265260131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-265260131L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__308311789(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-308311789L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_689654166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(689654166L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__308311789(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-308311789L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyReleased(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyReleased__265260131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-265260131L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased_874997877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874997877L))
            info.setReturnValue(false);
    }


}
