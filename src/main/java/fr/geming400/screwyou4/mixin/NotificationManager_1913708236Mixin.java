package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.notifications.NotificationManager.class)
public class NotificationManager_1913708236Mixin {
        @Inject(at = @At("HEAD"), method = "server()Lnet/minecraft/server/dedicated/DedicatedServer;", cancellable = true)
    private void server_228560031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(228560031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerLeft(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void playerLeft_1144146382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1144146382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerService(Lnet/minecraft/server/notifications/NotificationService;)V", cancellable = true)
    private void registerService_1888776130(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1888776130L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGameRuleChanged(Lnet/minecraft/world/level/gamerules/GameRule;Ljava/lang/Object;)V", cancellable = true)
    private void onGameRuleChanged_615265013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(615265013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setServer(Lnet/minecraft/server/dedicated/DedicatedServer;)V", cancellable = true)
    private void setServer__1048315181(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1048315181L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerOped(Lnet/minecraft/server/players/ServerOpListEntry;)V", cancellable = true)
    private void playerOped_998908466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(998908466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ipBanned(Lnet/minecraft/server/players/IpBanListEntry;)V", cancellable = true)
    private void ipBanned__713453356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-713453356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ipUnbanned(Ljava/lang/String;)V", cancellable = true)
    private void ipUnbanned__1228897912(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1228897912L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerJoined(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void playerJoined_1144146382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1144146382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverSaveStarted()V", cancellable = true)
    private void serverSaveStarted_1951982974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1951982974L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverSaveCompleted()V", cancellable = true)
    private void serverSaveCompleted_1951982974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1951982974L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverStarted()V", cancellable = true)
    private void serverStarted_1951982974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1951982974L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverShuttingDown()V", cancellable = true)
    private void serverShuttingDown_1951982974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1951982974L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerDeoped(Lnet/minecraft/server/players/ServerOpListEntry;)V", cancellable = true)
    private void playerDeoped_998908466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(998908466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "statusHeartbeat()V", cancellable = true)
    private void statusHeartbeat_1951982974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1951982974L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerUnbanned(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerUnbanned__1576056229(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1576056229L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverActivityOccured()V", cancellable = true)
    private void serverActivityOccured_1951982974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1951982974L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerRemovedFromAllowlist(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerRemovedFromAllowlist__1576056229(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1576056229L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerBanned(Lnet/minecraft/server/players/UserBanListEntry;)V", cancellable = true)
    private void playerBanned_1693859568(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1693859568L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerAddedToAllowlist(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerAddedToAllowlist__1576056229(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1576056229L))
            info.cancel();
    }


}
