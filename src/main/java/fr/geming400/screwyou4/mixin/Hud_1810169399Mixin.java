package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.Hud.class)
public class Hud_1810169399Mixin {
        @Inject(at = @At("HEAD"), method = "isHidden()Z", cancellable = true)
    private void isHidden_1848447981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848447981L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setTimes(III)V", cancellable = true)
    private void setTimes_1030076994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1030076994L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Z)V", cancellable = true)
    private void tick__1255181069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1255181069L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearCache()V", cancellable = true)
    private void clearCache_1848444137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1848444137L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerReloadListeners(Lnet/minecraft/server/packs/resources/ReloadableResourceManager;)V", cancellable = true)
    private void registerReloadListeners__274250301(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-274250301L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void extractRenderState__2114201765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2114201765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDebugOverlay()Lnet/minecraft/client/gui/components/DebugScreenOverlay;", cancellable = true)
    private void getDebugOverlay_963322430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(963322430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractSavingIndicator(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void extractSavingIndicator__2114201765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2114201765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractDeferredSubtitles()V", cancellable = true)
    private void extractDeferredSubtitles_1848444137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1848444137L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractDebugOverlay(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractDebugOverlay_1122254110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1122254110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetTitleTimes()V", cancellable = true)
    private void resetTitleTimes_1848444137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1848444137L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMobEffectSprite(Lnet/minecraft/core/Holder;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getMobEffectSprite__809129914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809129914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSubtitle(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setSubtitle__91009539(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-91009539L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWaypointStyles()Lnet/minecraft/client/resources/WaypointStyleManager;", cancellable = true)
    private void getWaypointStyles_676159843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676159843L))
            info.setReturnValue(new net.minecraft.client.resources.WaypointStyleManager());
    }

    @Inject(at = @At("HEAD"), method = "getGuiTicks()I", cancellable = true)
    private void getGuiTicks_1848431644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848431644L))
            info.setReturnValue(-356425525);
    }

    @Inject(at = @At("HEAD"), method = "setOverlayMessage(Lnet/minecraft/network/chat/Component;Z)V", cancellable = true)
    private void setOverlayMessage__1248702881(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1248702881L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearTitles()V", cancellable = true)
    private void clearTitles_1848444137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1848444137L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setNowPlaying(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setNowPlaying__91009539(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-91009539L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFont()Lnet/minecraft/client/gui/Font;", cancellable = true)
    private void getFont__1218628985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218628985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBossOverlay()Lnet/minecraft/client/gui/components/BossHealthOverlay;", cancellable = true)
    private void getBossOverlay__1328881528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1328881528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggle()V", cancellable = true)
    private void toggle_1848444137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1848444137L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTabList()Lnet/minecraft/client/gui/components/PlayerTabOverlay;", cancellable = true)
    private void getTabList_2121683027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2121683027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpectatorGui()Lnet/minecraft/client/gui/components/spectator/SpectatorGui;", cancellable = true)
    private void getSpectatorGui_2135686179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2135686179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onDisconnected()V", cancellable = true)
    private void onDisconnected_1848444137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1848444137L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChat()Lnet/minecraft/client/gui/components/ChatComponent;", cancellable = true)
    private void getChat__1389461718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1389461718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTitle(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setTitle__91009539(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-91009539L))
            info.cancel();
    }


}
