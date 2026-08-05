package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.PlayerSocialManager.class)
public class PlayerSocialManager_871322575Mixin {
        @Inject(at = @At("HEAD"), method = "isHidden(Ljava/util/UUID;)Z", cancellable = true)
    private void isHidden_513770329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513770329L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBlocked(Ljava/util/UUID;)Z", cancellable = true)
    private void isBlocked_513770329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513770329L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "removePlayer(Ljava/util/UUID;)V", cancellable = true)
    private void removePlayer_513766485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(513766485L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlayer(Lnet/minecraft/client/multiplayer/PlayerInfo;)V", cancellable = true)
    private void addPlayer__179639260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-179639260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIncomingRequests()Ljava/util/List;", cancellable = true)
    private void getIncomingRequests__1797307906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797307906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFriend(Ljava/util/UUID;)Z", cancellable = true)
    private void isFriend_513770329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513770329L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getHiddenPlayers()Ljava/util/Set;", cancellable = true)
    private void getHiddenPlayers__957712912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-957712912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendFriendRequest(Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void sendFriendRequest__1480873823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1480873823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDiscoveredUUID(Ljava/lang/String;)Ljava/util/UUID;", cancellable = true)
    private void getDiscoveredUUID__1039119209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1039119209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showPlayer(Ljava/util/UUID;)V", cancellable = true)
    private void showPlayer_513766485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(513766485L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hidePlayer(Ljava/util/UUID;)V", cancellable = true)
    private void hidePlayer_513766485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(513766485L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFriends()Ljava/util/List;", cancellable = true)
    private void getFriends__1797307906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797307906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFriendListState()Lnet/minecraft/client/gui/screens/social/RemoteFriendListUpdateHandler$State;", cancellable = true)
    private void getFriendListState__716092932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-716092932L))
            info.setReturnValue(net.minecraft.client.gui.screens.social.RemoteFriendListUpdateHandler.State.USER_MAY_LACK_ACTIVE_PROFILE);
    }

    @Inject(at = @At("HEAD"), method = "getOutgoingRequests()Ljava/util/List;", cancellable = true)
    private void getOutgoingRequests__1797307906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797307906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stopOnlineMode()V", cancellable = true)
    private void stopOnlineMode_909597313(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(909597313L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldHideMessageFrom(Ljava/util/UUID;)Z", cancellable = true)
    private void shouldHideMessageFrom_513770329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513770329L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "startOnlineMode()V", cancellable = true)
    private void startOnlineMode_909597313(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(909597313L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addFriendListUpdateListener(Ljava/lang/Runnable;)V", cancellable = true)
    private void addFriendListUpdateListener__1966903041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1966903041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeFriendListUpdateListener(Ljava/lang/Runnable;)V", cancellable = true)
    private void removeFriendListUpdateListener__1966903041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1966903041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "declineIncomingFriendRequest(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void declineIncomingFriendRequest__1644651625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644651625L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "revokeOutgoingFriendRequest(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void revokeOutgoingFriendRequest__1644651625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644651625L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "acceptIncomingFriendRequest(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void acceptIncomingFriendRequest__1644651625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644651625L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "isFriendListEnabled()Z", cancellable = true)
    private void isFriendListEnabled_909601157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(909601157L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPresenceHandler()Lnet/minecraft/client/gui/screens/social/PresenceHandler;", cancellable = true)
    private void getPresenceHandler_1471622009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471622009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeFriend(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void removeFriend__1644651625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644651625L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "updateFriendSettings(ZZ)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void updateFriendSettings_57569963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57569963L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "isAllowFriendRequests()Z", cancellable = true)
    private void isAllowFriendRequests_909601157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(909601157L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setFriendListEnabled(Z)V", cancellable = true)
    private void setFriendListEnabled_2100939403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2100939403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAllowFriendRequests(Z)V", cancellable = true)
    private void setAllowFriendRequests_2100939403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2100939403L))
            info.cancel();
    }


}
