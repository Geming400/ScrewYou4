package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.NowPlayingToast.class)
public class NowPlayingToast_1151715679Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/gui/components/toasts/ToastManager;J)V", cancellable = true)
    private void update__1169080257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1169080257L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__488432322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-488432322L))
            info.setReturnValue(126388390);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_66367101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66367101L))
            info.setReturnValue(-1525861795);
    }

    @Inject(at = @At("HEAD"), method = "xPos(IF)F", cancellable = true)
    private void xPos_521783906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521783906L))
            info.setReturnValue(3.477298E8F);
    }

    @Inject(at = @At("HEAD"), method = "yPos(I)F", cancellable = true)
    private void yPos_656977749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(656977749L))
            info.setReturnValue(3.477298E8F);
    }

    @Inject(at = @At("HEAD"), method = "showToast(Lnet/minecraft/client/Options;)V", cancellable = true)
    private void showToast_624063560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(624063560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWantedVisibility()Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private void getWantedVisibility_1743893870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743893870L))
            info.setReturnValue(net.minecraft.client.gui.components.toasts.Toast.Visibility.HIDE);
    }

    @Inject(at = @At("HEAD"), method = "onFinishedRendering()V", cancellable = true)
    private void onFinishedRendering__984123690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-984123690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWantedVisibility(Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;)V", cancellable = true)
    private void setWantedVisibility_1639221646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1639221646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickMusicNotes()V", cancellable = true)
    private static void tickMusicNotes_558762896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(558762896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractToast(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;)V", cancellable = true)
    private static void extractToast_957040818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(957040818L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;J)V", cancellable = true)
    private void extractRenderState__365735242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-365735242L))
            info.cancel();
    }


}
