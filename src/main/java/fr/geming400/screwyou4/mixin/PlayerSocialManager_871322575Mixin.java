package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.PlayerSocialManager.class)
public class PlayerSocialManager_871322575Mixin {
        @Inject(at = @At("HEAD"), method = "isHidden(Ljava/util/UUID;)Z", cancellable = true)
    private void isHidden_1169941605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169941605L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFriend(Ljava/util/UUID;)Z", cancellable = true)
    private void isFriend__818554895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818554895L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addPlayer(Lnet/minecraft/client/multiplayer/PlayerInfo;)V", cancellable = true)
    private void addPlayer__1531121018(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1531121018L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removePlayer(Ljava/util/UUID;)V", cancellable = true)
    private void removePlayer_875420912(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(875420912L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFriends()Ljava/util/List;", cancellable = true)
    private void getFriends_2134270429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134270429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPresenceHandler()Lnet/minecraft/client/gui/screens/social/PresenceHandler;", cancellable = true)
    private void getPresenceHandler__553836928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-553836928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldHideMessageFrom(Ljava/util/UUID;)Z", cancellable = true)
    private void shouldHideMessageFrom_1172841821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1172841821L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "stopOnlineMode()V", cancellable = true)
    private void stopOnlineMode_960033097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(960033097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startOnlineMode()V", cancellable = true)
    private void startOnlineMode__167253783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-167253783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBlocked(Ljava/util/UUID;)Z", cancellable = true)
    private void isBlocked_1254779703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254779703L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getIncomingRequests()Ljava/util/List;", cancellable = true)
    private void getIncomingRequests_526655358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(526655358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hidePlayer(Ljava/util/UUID;)V", cancellable = true)
    private void hidePlayer_450687346(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(450687346L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showPlayer(Ljava/util/UUID;)V", cancellable = true)
    private void showPlayer__1252903209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1252903209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFriendListEnabled()Z", cancellable = true)
    private void isFriendListEnabled__2107164886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2107164886L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addFriendListUpdateListener(Ljava/lang/Runnable;)V", cancellable = true)
    private void addFriendListUpdateListener__538207131(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-538207131L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeFriendListUpdateListener(Ljava/lang/Runnable;)V", cancellable = true)
    private void removeFriendListUpdateListener__375764254(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-375764254L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "declineIncomingFriendRequest(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void declineIncomingFriendRequest__1011388340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1011388340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptIncomingFriendRequest(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void acceptIncomingFriendRequest_303420538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(303420538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "revokeOutgoingFriendRequest(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void revokeOutgoingFriendRequest_1892620854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1892620854L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getDiscoveredUUID(Ljava/lang/String;)Ljava/util/UUID;", cancellable = true)
    private void getDiscoveredUUID_80268496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80268496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendFriendRequest(Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void sendFriendRequest_149517898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149517898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHiddenPlayers()Ljava/util/Set;", cancellable = true)
    private void getHiddenPlayers__649005122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-649005122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOutgoingRequests()Ljava/util/List;", cancellable = true)
    private void getOutgoingRequests__645179964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645179964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFriendListState()Lnet/minecraft/client/gui/screens/social/RemoteFriendListUpdateHandler$State;", cancellable = true)
    private void getFriendListState__1922450307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1922450307L))
            info.setReturnValue(net.minecraft.client.gui.screens.social.RemoteFriendListUpdateHandler.State.CONNECTION_ISSUE);
    }

    @Inject(at = @At("HEAD"), method = "removeFriend(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void removeFriend_165443801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165443801L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "isAllowFriendRequests()Z", cancellable = true)
    private void isAllowFriendRequests__363834492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-363834492L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "updateFriendSettings(ZZ)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void updateFriendSettings__701460683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-701460683L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "setFriendListEnabled(Z)V", cancellable = true)
    private void setFriendListEnabled_1994679118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1994679118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAllowFriendRequests(Z)V", cancellable = true)
    private void setAllowFriendRequests__1766227916(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1766227916L))
            info.cancel();
    }


}
