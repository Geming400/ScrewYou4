package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.SystemToast.class)
public class SystemToast_289676790Mixin {
        @Inject(at = @At("HEAD"), method = "reset(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void reset__797144479(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-797144479L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/gui/components/toasts/ToastManager;J)V", cancellable = true)
    private void update__2031119146(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2031119146L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/gui/components/toasts/ToastManager;Lnet/minecraft/client/gui/components/toasts/SystemToast$SystemToastId;Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private static void add__1680763070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1680763070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__1350471211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1350471211L))
            info.setReturnValue(-1279073440);
    }

    @Inject(at = @At("HEAD"), method = "getToken()Ljava/lang/Object;", cancellable = true)
    private void getToken_1522440019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1522440019L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getToken()Lnet/minecraft/client/gui/components/toasts/SystemToast$SystemToastId;", cancellable = true)
    private void getToken_812069837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(812069837L))
            info.setReturnValue(new net.minecraft.client.gui.components.toasts.SystemToast.SystemToastId());
    }

    @Inject(at = @At("HEAD"), method = "onLowDiskSpace(Lnet/minecraft/client/Minecraft;)V", cancellable = true)
    private static void onLowDiskSpace__386854114(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-386854114L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onFileDropFailure(Lnet/minecraft/client/Minecraft;I)V", cancellable = true)
    private static void onFileDropFailure__1808453625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1808453625L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWantedVisibility()Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private void getWantedVisibility_881854981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881854981L))
            info.setReturnValue(net.minecraft.client.gui.components.toasts.Toast.Visibility.SHOW);
    }

    @Inject(at = @At("HEAD"), method = "recalculateWidth()V", cancellable = true)
    private void recalculateWidth_1639899541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1639899541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onChunkSaveFailure(Lnet/minecraft/client/Minecraft;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private static void onChunkSaveFailure__1881894465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1881894465L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onWorldAccessFailure(Lnet/minecraft/client/Minecraft;Ljava/lang/String;)V", cancellable = true)
    private static void onWorldAccessFailure_1739850601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1739850601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPackCopyFailure(Lnet/minecraft/client/Minecraft;Ljava/lang/String;)V", cancellable = true)
    private static void onPackCopyFailure_114687199(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(114687199L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onWorldDeleteFailure(Lnet/minecraft/client/Minecraft;Ljava/lang/String;)V", cancellable = true)
    private static void onWorldDeleteFailure__592150160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-592150160L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onChunkLoadFailure(Lnet/minecraft/client/Minecraft;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private static void onChunkLoadFailure_194501416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(194501416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addOrUpdate(Lnet/minecraft/client/gui/components/toasts/ToastManager;Lnet/minecraft/client/gui/components/toasts/SystemToast$SystemToastId;Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private static void addOrUpdate_1416941294(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1416941294L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;J)V", cancellable = true)
    private void extractRenderState__1227774131(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1227774131L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__795671788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-795671788L))
            info.setReturnValue(-1949744653);
    }

    @Inject(at = @At("HEAD"), method = "forceHide()V", cancellable = true)
    private void forceHide__2078020101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2078020101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forceHide(Lnet/minecraft/client/gui/components/toasts/ToastManager;Lnet/minecraft/client/gui/components/toasts/SystemToast$SystemToastId;)V", cancellable = true)
    private static void forceHide_1177480006(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1177480006L))
            info.cancel();
    }


}
