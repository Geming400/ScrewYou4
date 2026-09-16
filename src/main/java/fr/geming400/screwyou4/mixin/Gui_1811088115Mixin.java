package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.Gui.class)
public class Gui_1811088115Mixin {
        @Inject(at = @At("HEAD"), method = "update()V", cancellable = true)
    private void update_1184622204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1184622204L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1681404456(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1681404456L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "screen()Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void screen_1221642706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1221642706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatListener()Lnet/minecraft/client/multiplayer/chat/ChatListener;", cancellable = true)
    private void chatListener__1664469234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1664469234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlay()Lnet/minecraft/client/gui/screens/Overlay;", cancellable = true)
    private void overlay_1043579148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1043579148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setScreen(Lnet/minecraft/client/gui/screens/Screen;)V", cancellable = true)
    private void setScreen__1031023502(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1031023502L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canInterruptScreen()Z", cancellable = true)
    private void canInterruptScreen__1249241782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249241782L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setClientLevelTeardownInProgress(Z)V", cancellable = true)
    private void setClientLevelTeardownInProgress_1281950876(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1281950876L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerReloadListeners(Lnet/minecraft/server/packs/resources/ReloadableResourceManager;)V", cancellable = true)
    private void registerReloadListeners_2012045532(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2012045532L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "buildInitialScreens(Lnet/minecraft/client/GameLoadCookie;)Ljava/lang/Runnable;", cancellable = true)
    private void buildInitialScreens_906362003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(906362003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addSocialInteractionsToast()V", cancellable = true)
    private void addSocialInteractionsToast__364743571(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-364743571L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleKeybinds()V", cancellable = true)
    private void handleKeybinds__261025306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-261025306L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPauseScreen(ZZ)V", cancellable = true)
    private void setPauseScreen_968689317(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(968689317L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/DeltaTracker;ZZ)V", cancellable = true)
    private void extractRenderState__1407957818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1407957818L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toastManager()Lnet/minecraft/client/gui/components/toasts/ToastManager;", cancellable = true)
    private void toastManager__1231754660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1231754660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOverlay(Lnet/minecraft/client/gui/screens/Overlay;)V", cancellable = true)
    private void setOverlay__1024510110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1024510110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPausing()Z", cancellable = true)
    private void isPausing_1335145888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335145888L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "openChatAndAddText(Lnet/minecraft/client/gui/components/ChatComponent$ChatMethod;Ljava/lang/String;)V", cancellable = true)
    private void openChatAndAddText_1496182328(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1496182328L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "splashManager()Lnet/minecraft/client/resources/SplashManager;", cancellable = true)
    private void splashManager__150519526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-150519526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openChatScreen(Lnet/minecraft/client/gui/components/ChatComponent$ChatMethod;)V", cancellable = true)
    private void openChatScreen_423580793(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(423580793L))
            info.cancel();
    }


}
