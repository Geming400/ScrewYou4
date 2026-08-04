package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.ToastManager.class)
public class ToastManager1805125556Mixin {
        @Inject(at = @At("HEAD"), method = "update()V", cancellable = true)
    private void update_1843400295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1843400295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1843400295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1843400295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractRenderState_1117210268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1117210268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMusicToastDisplayState(Lnet/minecraft/client/MusicToastDisplayState;)V", cancellable = true)
    private void setMusicToastDisplayState__1507356131(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1507356131L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNotificationDisplayTimeMultiplier()D", cancellable = true)
    private void getNotificationDisplayTimeMultiplier_1843382997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1843382997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToast(Lnet/minecraft/client/gui/components/toasts/Toast;)V", cancellable = true)
    private void addToast_1458342013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1458342013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showNowPlayingToast()V", cancellable = true)
    private void showNowPlayingToast_1843400295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1843400295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hideNowPlayingToast()V", cancellable = true)
    private void hideNowPlayingToast_1843400295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1843400295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMinecraft()Lnet/minecraft/client/Minecraft;", cancellable = true)
    private void getMinecraft_613379685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613379685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getToast(Ljava/lang/Class;Ljava/lang/Object;)Lnet/minecraft/client/gui/components/toasts/Toast;", cancellable = true)
    private void getToast__1374213862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1374213862L))
            info.setReturnValue(null);
    }


}
