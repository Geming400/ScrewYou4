package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.ProgressScreen.class)
public class ProgressScreen1734380705Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__983483246(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-983483246L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "progressStart(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void progressStart__514423021(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-514423021L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "progressStagePercentage(I)V", cancellable = true)
    private void progressStagePercentage__694390312(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-694390312L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "progressStartNoAbort(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void progressStartNoAbort__1254501842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1254501842L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "progressStage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void progressStage__795607305(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-795607305L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1145284327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145284327L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1573706949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1573706949L))
            info.cancel();
    }


}
