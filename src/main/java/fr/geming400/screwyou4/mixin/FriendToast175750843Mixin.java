package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.FriendToast.class)
public class FriendToast175750843Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/gui/components/toasts/ToastManager;J)V", cancellable = true)
    private void update__2145045092(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2145045092L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/gui/components/toasts/ToastManager;Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/component/ResolvableProfile;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private static void add_602099088(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(602099088L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__909597734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-909597734L))
            info.setReturnValue(-717752096);
    }

    @Inject(at = @At("HEAD"), method = "hide()V", cancellable = true)
    private void hide_976413036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(976413036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWantedVisibility()Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private void getWantedVisibility_767929035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(767929035L))
            info.setReturnValue(net.minecraft.client.gui.components.toasts.Toast.Visibility.HIDE);
    }

    @Inject(at = @At("HEAD"), method = "showFriendRequestSent(Lnet/minecraft/client/Minecraft;Ljava/lang/String;)V", cancellable = true)
    private static void showFriendRequestSent__1580349034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1580349034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showFriendRequestReceived(Lnet/minecraft/client/Minecraft;Ljava/lang/String;Ljava/util/UUID;)V", cancellable = true)
    private static void showFriendRequestReceived__688769279(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-688769279L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showFriendRequestAccepted(Lnet/minecraft/client/Minecraft;Ljava/lang/String;Ljava/util/UUID;)V", cancellable = true)
    private static void showFriendRequestAccepted_1612301947(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1612301947L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showFriendAdded(Lnet/minecraft/client/Minecraft;Ljava/lang/String;Ljava/util/UUID;)V", cancellable = true)
    private static void showFriendAdded__2092605615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2092605615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;J)V", cancellable = true)
    private void extractRenderState__1341700077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1341700077L))
            info.cancel();
    }


}
