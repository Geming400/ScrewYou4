package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.BookEditScreen.class)
public class BookEditScreen_15908309Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__943779064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-943779064L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__943779064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-943779064L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage_2133966439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2133966439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInGameUi()Z", cancellable = true)
    private void isInGameUi_54186891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(54186891L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__900727406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900727406L))
            info.setReturnValue(true);
    }


}
