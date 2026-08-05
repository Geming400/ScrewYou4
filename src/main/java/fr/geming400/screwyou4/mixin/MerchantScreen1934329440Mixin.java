package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.MerchantScreen.class)
public class MerchantScreen1934329440Mixin {
        @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled__1160726249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1160726249L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased__2137015562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137015562L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_319670562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(319670562L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseDragged(Lnet/minecraft/client/input/MouseButtonEvent;DD)Z", cancellable = true)
    private void mouseDragged__1482629706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482629706L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_974642068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(974642068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractContents_974642068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(974642068L))
            info.cancel();
    }


}
