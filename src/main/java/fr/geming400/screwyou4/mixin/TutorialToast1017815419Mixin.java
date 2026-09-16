package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.TutorialToast.class)
public class TutorialToast1017815419Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/gui/components/toasts/ToastManager;J)V", cancellable = true)
    private void update__1302980516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1302980516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__67533158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67533158L))
            info.setReturnValue(2072276916);
    }

    @Inject(at = @At("HEAD"), method = "hide()V", cancellable = true)
    private void hide_1818477612(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1818477612L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWantedVisibility()Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private void getWantedVisibility_1609993611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609993611L))
            info.setReturnValue(net.minecraft.client.gui.components.toasts.Toast.Visibility.HIDE);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;J)V", cancellable = true)
    private void extractRenderState__499635501(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-499635501L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateProgress(F)V", cancellable = true)
    private void updateProgress_509239226(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(509239226L))
            info.cancel();
    }


}
