package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.SystemToast.class)
public class SystemToast_289676790Mixin {
        @Inject(at = @At("HEAD"), method = "reset(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void reset__1435678768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1435678768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/gui/components/toasts/ToastManager;J)V", cancellable = true)
    private void update__1578450241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1578450241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/gui/components/toasts/ToastManager;Lnet/minecraft/client/gui/components/toasts/SystemToast$SystemToastId;Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private static void add_352065697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(352065697L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_327939035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(327939035L))
            info.setReturnValue(2060437753);
    }

    @Inject(at = @At("HEAD"), method = "getToken()Ljava/lang/Object;", cancellable = true)
    private void getToken__2145969328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2145969328L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getToken()Lnet/minecraft/client/gui/components/toasts/SystemToast$SystemToastId;", cancellable = true)
    private void getToken_1972740938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972740938L))
            info.setReturnValue(new net.minecraft.client.gui.components.toasts.SystemToast$SystemToastId());
    }

    @Inject(at = @At("HEAD"), method = "addOrUpdate(Lnet/minecraft/client/gui/components/toasts/ToastManager;Lnet/minecraft/client/gui/components/toasts/SystemToast$SystemToastId;Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private static void addOrUpdate_352065697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(352065697L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_327939035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(327939035L))
            info.setReturnValue(2060437753);
    }

    @Inject(at = @At("HEAD"), method = "getWantedVisibility()Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private void getWantedVisibility__47566404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-47566404L))
            info.setReturnValue(net.minecraft.client.gui.components.toasts.Toast.Visibility.SHOW);
    }

    @Inject(at = @At("HEAD"), method = "recalculateWidth()V", cancellable = true)
    private void recalculateWidth_327951528(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(327951528L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onChunkSaveFailure(Lnet/minecraft/client/Minecraft;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private static void onChunkSaveFailure__818377858(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-818377858L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onWorldAccessFailure(Lnet/minecraft/client/Minecraft;Ljava/lang/String;)V", cancellable = true)
    private static void onWorldAccessFailure_551903772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(551903772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onWorldDeleteFailure(Lnet/minecraft/client/Minecraft;Ljava/lang/String;)V", cancellable = true)
    private static void onWorldDeleteFailure_551903772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(551903772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPackCopyFailure(Lnet/minecraft/client/Minecraft;Ljava/lang/String;)V", cancellable = true)
    private static void onPackCopyFailure_551903772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(551903772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onChunkLoadFailure(Lnet/minecraft/client/Minecraft;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private static void onChunkLoadFailure__818377858(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-818377858L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;J)V", cancellable = true)
    private void extractRenderState__2001213709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2001213709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onLowDiskSpace(Lnet/minecraft/client/Minecraft;)V", cancellable = true)
    private static void onLowDiskSpace_533421714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(533421714L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onFileDropFailure(Lnet/minecraft/client/Minecraft;I)V", cancellable = true)
    private static void onFileDropFailure__716772505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-716772505L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forceHide()V", cancellable = true)
    private void forceHide_327951528(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(327951528L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forceHide(Lnet/minecraft/client/gui/components/toasts/ToastManager;Lnet/minecraft/client/gui/components/toasts/SystemToast$SystemToastId;)V", cancellable = true)
    private static void forceHide__867140871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-867140871L))
            info.cancel();
    }


}
