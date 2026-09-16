package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.LoomScreen.class)
public class LoomScreen1077436601Mixin {
        @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_536930425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536930425L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseDragged(Lnet/minecraft/client/input/MouseButtonEvent;DD)Z", cancellable = true)
    private void mouseDragged__964945732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964945732L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased_1661572561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661572561L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled_1905152671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905152671L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__1816076162(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1816076162L))
            info.cancel();
    }


}
