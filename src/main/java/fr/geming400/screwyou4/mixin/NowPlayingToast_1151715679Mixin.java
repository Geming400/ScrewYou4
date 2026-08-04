package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.NowPlayingToast.class)
public class NowPlayingToast_1151715679Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/gui/components/toasts/ToastManager;J)V", cancellable = true)
    private void update__716411352(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-716411352L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_1189977924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1189977924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_1189977924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1189977924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showToast(Lnet/minecraft/client/Options;)V", cancellable = true)
    private void showToast__1065421390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1065421390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;J)V", cancellable = true)
    private void extractRenderState__1139174820(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1139174820L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "yPos(I)F", cancellable = true)
    private void yPos__1929350022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1929350022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xPos(IF)F", cancellable = true)
    private void xPos_153050270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153050270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setWantedVisibility(Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;)V", cancellable = true)
    private void setWantedVisibility_222967467(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(222967467L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onFinishedRendering()V", cancellable = true)
    private void onFinishedRendering_1189990417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1189990417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickMusicNotes()V", cancellable = true)
    private static void tickMusicNotes_1189990665(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1189990665L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWantedVisibility()Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private void getWantedVisibility_814472485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814472485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractToast(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;)V", cancellable = true)
    private static void extractToast_522713240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(522713240L))
            info.cancel();
    }


}
