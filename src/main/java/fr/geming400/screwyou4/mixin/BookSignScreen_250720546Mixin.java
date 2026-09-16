package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.BookSignScreen.class)
public class BookSignScreen_250720546Mixin {
        @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_219666914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(219666914L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1237600187(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1237600187L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_1652175078(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1652175078L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInGameUi()Z", cancellable = true)
    private void isInGameUi__261765885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-261765885L))
            info.setReturnValue(false);
    }


}
