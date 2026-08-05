package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.StonecutterScreen.class)
public class StonecutterScreen1131735490Mixin {
        @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_172048118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(172048118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased_1355357784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355357784L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__482923388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-482923388L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled__1963320199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1963320199L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseDragged(Lnet/minecraft/client/input/MouseButtonEvent;DD)Z", cancellable = true)
    private void mouseDragged_2009743640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2009743640L))
            info.setReturnValue(true);
    }


}
