package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.LoomScreen.class)
public class LoomScreen1077436601Mixin {
        @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_117749229(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(117749229L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased_1301058895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301058895L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__537222277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537222277L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled__2017619088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017619088L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseDragged(Lnet/minecraft/client/input/MouseButtonEvent;DD)Z", cancellable = true)
    private void mouseDragged_1955444751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955444751L))
            info.setReturnValue(false);
    }


}
