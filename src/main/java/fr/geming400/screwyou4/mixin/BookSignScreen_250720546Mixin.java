package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.BookSignScreen.class)
public class BookSignScreen_250720546Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__708966827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-708966827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__708966827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-708966827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInGameUi()Z", cancellable = true)
    private void isInGameUi_288999128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(288999128L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__665915169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-665915169L))
            info.setReturnValue(true);
    }


}
