package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.RemoteFriendListUpdateHandler.class)
public class RemoteFriendListUpdateHandler1899327937Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_273163570(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(273163570L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__818535022(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-818535022L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/client/gui/screens/social/RemoteFriendListUpdateHandler$State;", cancellable = true)
    private void getState_975570548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(975570548L))
            info.setReturnValue(net.minecraft.client.gui.screens.social.RemoteFriendListUpdateHandler.State.UNAUTHORIZED);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__215246500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-215246500L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addUpdateListener(Ljava/lang/Runnable;)V", cancellable = true)
    private void addUpdateListener_1864178964(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1864178964L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forceUpdate()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void forceUpdate_288685938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(288685938L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "removeUpdateListener(Ljava/lang/Runnable;)V", cancellable = true)
    private void removeUpdateListener_1891587025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1891587025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLatestFriendData()Lcom/mojang/authlib/yggdrasil/response/FriendData;", cancellable = true)
    private void getLatestFriendData_1284913234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1284913234L))
            info.setReturnValue(null);
    }


}
