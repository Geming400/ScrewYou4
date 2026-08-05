package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.packs.TransferableSelectionList.PackEntry.class)
public class PackEntry2086974796Mixin {
        @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_1546468620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1546468620L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration__1489827893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489827893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldTakeFocusAfterInteraction()Z", cancellable = true)
    private void shouldTakeFocusAfterInteraction_866224303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866224303L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent__1693235016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1693235016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPackId()Ljava/lang/String;", cancellable = true)
    private void getPackId_1724472671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1724472671L))
            info.setReturnValue("P`\u2708\u9AD7?4.b7m\u0E87R\u438B\u84B1=6fT(6B8Rh:2\u384F");
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_2055921165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055921165L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "keyboardSelection()V", cancellable = true)
    private void keyboardSelection_2147369402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2147369402L))
            info.cancel();
    }


}
