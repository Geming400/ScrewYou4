package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.MerchantScreen.class)
public class MerchantScreen1934329440Mixin {
        @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled__1532921786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1532921786L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased__1776501896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1776501896L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseDragged(Lnet/minecraft/client/input/MouseButtonEvent;DD)Z", cancellable = true)
    private void mouseDragged__108052893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-108052893L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_1393823264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1393823264L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__959183323(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-959183323L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractContents__1378444679(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1378444679L))
            info.cancel();
    }


}
