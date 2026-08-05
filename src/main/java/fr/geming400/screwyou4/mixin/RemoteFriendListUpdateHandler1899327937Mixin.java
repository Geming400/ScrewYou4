package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.RemoteFriendListUpdateHandler.class)
public class RemoteFriendListUpdateHandler1899327937Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1937603668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1937603668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1937603668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1937603668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/client/gui/screens/social/RemoteFriendListUpdateHandler$State;", cancellable = true)
    private void getState_311912431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(311912431L))
            info.setReturnValue(net.minecraft.client.gui.screens.social.RemoteFriendListUpdateHandler.State.CONNECTION_ISSUE);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1937603668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1937603668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeUpdateListener(Ljava/lang/Runnable;)V", cancellable = true)
    private void removeUpdateListener__938897678(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-938897678L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addUpdateListener(Ljava/lang/Runnable;)V", cancellable = true)
    private void addUpdateListener__938897678(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-938897678L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLatestFriendData()Lcom/mojang/authlib/yggdrasil/response/FriendData;", cancellable = true)
    private void getLatestFriendData__1459873715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1459873715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceUpdate()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void forceUpdate__682264098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-682264098L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
