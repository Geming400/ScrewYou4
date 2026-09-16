package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.StonecutterScreen.class)
public class StonecutterScreen1131735490Mixin {
        @Inject(at = @At("HEAD"), method = "mouseDragged(Lnet/minecraft/client/input/MouseButtonEvent;DD)Z", cancellable = true)
    private void mouseDragged__910646843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910646843L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased_1715871450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715871450L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled_1959451560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1959451560L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_591229314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(591229314L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__1761777273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1761777273L))
            info.cancel();
    }


}
