package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.TestBlockEditScreen.class)
public class TestBlockEditScreen_1620775805Mixin {
        @Inject(at = @At("HEAD"), method = "init()V", cancellable = true)
    private void init_1659050543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1659050543L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1659050543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1659050543L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_661088432(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(661088432L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInGameUi()Z", cancellable = true)
    private void isInGameUi_1659054387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659054387L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_1659054387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659054387L))
            info.setReturnValue(false);
    }


}
