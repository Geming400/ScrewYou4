package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.BookEditScreen.class)
public class BookEditScreen_15908309Mixin {
        @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__1655934430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1655934430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1002787950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1002787950L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_1417362841(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1417362841L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__15145323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-15145323L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isInGameUi()Z", cancellable = true)
    private void isInGameUi__496578122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-496578122L))
            info.setReturnValue(true);
    }


}
