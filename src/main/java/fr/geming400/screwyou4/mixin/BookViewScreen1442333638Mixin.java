package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.BookViewScreen.class)
public class BookViewScreen1442333638Mixin {
        @Inject(at = @At("HEAD"), method = "setPage(I)Z", cancellable = true)
    private void setPage__1638712842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1638712842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_525697924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525697924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_482646266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(482646266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_482646266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(482646266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInGameUi()Z", cancellable = true)
    private void isInGameUi_1480612221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480612221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBookAccess(Lnet/minecraft/client/gui/screens/inventory/BookViewScreen$BookAccess;)V", cancellable = true)
    private void setBookAccess_512928208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(512928208L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__734575527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-734575527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__172325240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-172325240L))
            info.setReturnValue(null);
    }


}
