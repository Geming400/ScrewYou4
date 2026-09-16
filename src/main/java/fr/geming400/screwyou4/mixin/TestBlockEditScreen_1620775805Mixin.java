package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.TestBlockEditScreen.class)
public class TestBlockEditScreen_1620775805Mixin {
        @Inject(at = @At("HEAD"), method = "init()V", cancellable = true)
    private void init_1310088991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1310088991L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1448176010(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1448176010L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1687311850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1687311850L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInGameUi()Z", cancellable = true)
    private void isInGameUi_1108289374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1108289374L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen__1938369093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1938369093L))
            info.setReturnValue(true);
    }


}
