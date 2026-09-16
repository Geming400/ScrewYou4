package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.Hud.class)
public class Hud_1810169399Mixin {
        @Inject(at = @At("HEAD"), method = "isHidden()Z", cancellable = true)
    private void isHidden__496694023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-496694023L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setTimes(III)V", cancellable = true)
    private void setTimes_703544902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(703544902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Z)V", cancellable = true)
    private void tick_2128043216(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2128043216L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearCache()V", cancellable = true)
    private void clearCache_1015909588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1015909588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSpectatorGui()Lnet/minecraft/client/gui/components/spectator/SpectatorGui;", cancellable = true)
    private void getSpectatorGui__1710253979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710253979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onDisconnected()V", cancellable = true)
    private void onDisconnected__1067331729(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1067331729L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBossOverlay()Lnet/minecraft/client/gui/components/BossHealthOverlay;", cancellable = true)
    private void getBossOverlay_1563706747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563706747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTitle(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setTitle__952854233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-952854233L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void extractRenderState_1219690689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1219690689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerReloadListeners(Lnet/minecraft/server/packs/resources/ReloadableResourceManager;)V", cancellable = true)
    private void registerReloadListeners_2011126816(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2011126816L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDebugOverlay()Lnet/minecraft/client/gui/components/DebugScreenOverlay;", cancellable = true)
    private void getDebugOverlay__1524621135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524621135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFont()Lnet/minecraft/client/gui/Font;", cancellable = true)
    private void getFont__307257438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-307257438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractSavingIndicator(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void extractSavingIndicator_883378023(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(883378023L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractDebugOverlay(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractDebugOverlay__1174481988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1174481988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractDeferredSubtitles()V", cancellable = true)
    private void extractDeferredSubtitles__1096740338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1096740338L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetTitleTimes()V", cancellable = true)
    private void resetTitleTimes_364641420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(364641420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMobEffectSprite(Lnet/minecraft/core/Holder;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getMobEffectSprite__875618394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875618394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearTitles()V", cancellable = true)
    private void clearTitles_765871137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(765871137L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGuiTicks()I", cancellable = true)
    private void getGuiTicks__1124522165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1124522165L))
            info.setReturnValue(372539779);
    }

    @Inject(at = @At("HEAD"), method = "setSubtitle(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setSubtitle__356874461(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-356874461L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOverlayMessage(Lnet/minecraft/network/chat/Component;Z)V", cancellable = true)
    private void setOverlayMessage__615474312(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-615474312L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWaypointStyles()Lnet/minecraft/client/resources/WaypointStyleManager;", cancellable = true)
    private void getWaypointStyles__709455286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-709455286L))
            info.setReturnValue(new net.minecraft.client.resources.WaypointStyleManager());
    }

    @Inject(at = @At("HEAD"), method = "setNowPlaying(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setNowPlaying__1493385405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1493385405L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toggle()V", cancellable = true)
    private void toggle_1111637525(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1111637525L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChat()Lnet/minecraft/client/gui/components/ChatComponent;", cancellable = true)
    private void getChat_101241756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(101241756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTabList()Lnet/minecraft/client/gui/components/PlayerTabOverlay;", cancellable = true)
    private void getTabList__1527124048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1527124048L))
            info.setReturnValue(null);
    }


}
