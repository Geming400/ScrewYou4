package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.ToastManager.class)
public class ToastManager1805125556Mixin {
        @Inject(at = @At("HEAD"), method = "update()V", cancellable = true)
    private void update_1178659646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1178659646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1019297850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1019297850L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getToast(Ljava/lang/Class;Ljava/lang/Object;)Lnet/minecraft/client/gui/components/toasts/Toast;", cancellable = true)
    private void getToast__2146490935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146490935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinecraft()Lnet/minecraft/client/Minecraft;", cancellable = true)
    private void getMinecraft__1335170596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1335170596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showNowPlayingToast()V", cancellable = true)
    private void showNowPlayingToast__1544385067(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1544385067L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractRenderState_1668869878(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1668869878L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hideNowPlayingToast()V", cancellable = true)
    private void hideNowPlayingToast_1871887258(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1871887258L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNotificationDisplayTimeMultiplier()D", cancellable = true)
    private void getNotificationDisplayTimeMultiplier_1167917894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1167917894L))
            info.setReturnValue(9.717232005922405E8D);
    }

    @Inject(at = @At("HEAD"), method = "addToast(Lnet/minecraft/client/gui/components/toasts/Toast;)V", cancellable = true)
    private void addToast_1789513655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1789513655L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMusicToastDisplayState(Lnet/minecraft/client/MusicToastDisplayState;)V", cancellable = true)
    private void setMusicToastDisplayState__1866045584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1866045584L))
            info.cancel();
    }


}
