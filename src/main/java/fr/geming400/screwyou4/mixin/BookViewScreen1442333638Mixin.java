package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.BookViewScreen.class)
public class BookViewScreen1442333638Mixin {
        @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1411280007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411280007L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_901827462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901827462L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setPage(I)Z", cancellable = true)
    private void setPage_1932933959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932933959L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__229509100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-229509100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1865754016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1865754016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__1451179125(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1451179125L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInGameUi()Z", cancellable = true)
    private void isInGameUi_929847208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929847208L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setBookAccess(Lnet/minecraft/client/gui/screens/inventory/BookViewScreen$BookAccess;)V", cancellable = true)
    private void setBookAccess__1093468479(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1093468479L))
            info.cancel();
    }


}
