package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.Gui.class)
public class Gui_1811088115Mixin {
        @Inject(at = @At("HEAD"), method = "update()V", cancellable = true)
    private void update_1849362853(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1849362853L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1849362853(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1849362853L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "screen()Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void screen__638661954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-638661954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatListener()Lnet/minecraft/client/multiplayer/chat/ChatListener;", cancellable = true)
    private void chatListener__36976926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-36976926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setClientLevelTeardownInProgress(Z)V", cancellable = true)
    private void setClientLevelTeardownInProgress__1254262353(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1254262353L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "buildInitialScreens(Lnet/minecraft/client/GameLoadCookie;)Ljava/lang/Runnable;", cancellable = true)
    private void buildInitialScreens_2063286948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063286948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerReloadListeners(Lnet/minecraft/server/packs/resources/ReloadableResourceManager;)V", cancellable = true)
    private void registerReloadListeners__273331585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-273331585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toastManager()Lnet/minecraft/client/gui/components/toasts/ToastManager;", cancellable = true)
    private void toastManager__1314307038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1314307038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canInterruptScreen()Z", cancellable = true)
    private void canInterruptScreen_1849366697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1849366697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPausing()Z", cancellable = true)
    private void isPausing_1849366697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1849366697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOverlay(Lnet/minecraft/client/gui/screens/Overlay;)V", cancellable = true)
    private void setOverlay_1130093232(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1130093232L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setScreen(Lnet/minecraft/client/gui/screens/Screen;)V", cancellable = true)
    private void setScreen_871206276(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(871206276L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "overlay()Lnet/minecraft/client/gui/screens/Overlay;", cancellable = true)
    private void overlay_1642760380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1642760380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/DeltaTracker;ZZ)V", cancellable = true)
    private void extractRenderState__806956052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-806956052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openChatScreen(Lnet/minecraft/client/gui/components/ChatComponent$ChatMethod;)V", cancellable = true)
    private void openChatScreen__2036094201(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2036094201L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "splashManager()Lnet/minecraft/client/resources/SplashManager;", cancellable = true)
    private void splashManager__1737977004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1737977004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openChatAndAddText(Lnet/minecraft/client/gui/components/ChatComponent$ChatMethod;Ljava/lang/String;)V", cancellable = true)
    private void openChatAndAddText_1639871121(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1639871121L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSocialInteractionsToast()V", cancellable = true)
    private void addSocialInteractionsToast_1849362853(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1849362853L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleKeybinds()V", cancellable = true)
    private void handleKeybinds_1849362853(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1849362853L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPauseScreen(ZZ)V", cancellable = true)
    private void setPauseScreen_1317604069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1317604069L))
            info.cancel();
    }


}
