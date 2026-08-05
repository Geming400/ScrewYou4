package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.FriendToast.class)
public class FriendToast175750843Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/gui/components/toasts/ToastManager;J)V", cancellable = true)
    private void update__1692376187(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1692376187L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/gui/components/toasts/ToastManager;Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/component/ResolvableProfile;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private static void add__264688879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-264688879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hide()V", cancellable = true)
    private void hide_214025582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(214025582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_214013089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(214013089L))
            info.setReturnValue(-565570875);
    }

    @Inject(at = @At("HEAD"), method = "getWantedVisibility()Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private void getWantedVisibility__161492350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-161492350L))
            info.setReturnValue(net.minecraft.client.gui.components.toasts.Toast.Visibility.HIDE);
    }

    @Inject(at = @At("HEAD"), method = "showFriendRequestReceived(Lnet/minecraft/client/Minecraft;Ljava/lang/String;Ljava/util/UUID;)V", cancellable = true)
    private static void showFriendRequestReceived_315794614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(315794614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showFriendAdded(Lnet/minecraft/client/Minecraft;Ljava/lang/String;Ljava/util/UUID;)V", cancellable = true)
    private static void showFriendAdded_315794614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(315794614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showFriendRequestAccepted(Lnet/minecraft/client/Minecraft;Ljava/lang/String;Ljava/util/UUID;)V", cancellable = true)
    private static void showFriendRequestAccepted_315794614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(315794614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showFriendRequestSent(Lnet/minecraft/client/Minecraft;Ljava/lang/String;)V", cancellable = true)
    private static void showFriendRequestSent_437977826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(437977826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;J)V", cancellable = true)
    private void extractRenderState__2115139655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2115139655L))
            info.cancel();
    }


}
