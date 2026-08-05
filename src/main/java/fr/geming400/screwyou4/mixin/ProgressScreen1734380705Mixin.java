package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.ProgressScreen.class)
public class ProgressScreen1734380705Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1772655444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1772655444L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "progressStartNoAbort(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void progressStartNoAbort__166798232(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-166798232L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "progressStage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void progressStage__166798232(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-166798232L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1772659288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1772659288L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_774693333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(774693333L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "progressStart(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void progressStart__166798232(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-166798232L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "progressStagePercentage(I)V", cancellable = true)
    private void progressStagePercentage__1346669619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1346669619L))
            info.cancel();
    }


}
