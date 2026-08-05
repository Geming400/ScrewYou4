package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.TutorialToast.class)
public class TutorialToast1017815419Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/gui/components/toasts/ToastManager;J)V", cancellable = true)
    private void update__850311611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-850311611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;J)V", cancellable = true)
    private void extractRenderState__1273075079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1273075079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hide()V", cancellable = true)
    private void hide_1056090158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1056090158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_1056077665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1056077665L))
            info.setReturnValue(1200453892);
    }

    @Inject(at = @At("HEAD"), method = "getWantedVisibility()Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private void getWantedVisibility_680572226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(680572226L))
            info.setReturnValue(net.minecraft.client.gui.components.toasts.Toast.Visibility.SHOW);
    }

    @Inject(at = @At("HEAD"), method = "updateProgress(F)V", cancellable = true)
    private void updateProgress__2066005468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2066005468L))
            info.cancel();
    }


}
