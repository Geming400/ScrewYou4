package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.notifications.EmptyNotificationService.class)
public class EmptyNotificationService1804571149Mixin {
        @Inject(at = @At("HEAD"), method = "playerLeft(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void playerLeft_1035009296(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1035009296L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGameRuleChanged(Lnet/minecraft/world/level/gamerules/GameRule;Ljava/lang/Object;)V", cancellable = true)
    private void onGameRuleChanged_506127927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(506127927L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerJoined(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void playerJoined_1035009296(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1035009296L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ipUnbanned(Ljava/lang/String;)V", cancellable = true)
    private void ipUnbanned__1338034998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1338034998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ipBanned(Lnet/minecraft/server/players/IpBanListEntry;)V", cancellable = true)
    private void ipBanned__822590442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-822590442L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerOped(Lnet/minecraft/server/players/ServerOpListEntry;)V", cancellable = true)
    private void playerOped_889771380(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(889771380L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverSaveStarted()V", cancellable = true)
    private void serverSaveStarted_1842845888(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1842845888L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverSaveCompleted()V", cancellable = true)
    private void serverSaveCompleted_1842845888(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1842845888L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverStarted()V", cancellable = true)
    private void serverStarted_1842845888(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1842845888L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverShuttingDown()V", cancellable = true)
    private void serverShuttingDown_1842845888(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1842845888L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerUnbanned(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerUnbanned__1685193315(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1685193315L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerRemovedFromAllowlist(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerRemovedFromAllowlist__1685193315(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1685193315L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerBanned(Lnet/minecraft/server/players/UserBanListEntry;)V", cancellable = true)
    private void playerBanned_1584722482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1584722482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "statusHeartbeat()V", cancellable = true)
    private void statusHeartbeat_1842845888(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1842845888L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverActivityOccured()V", cancellable = true)
    private void serverActivityOccured_1842845888(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1842845888L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerAddedToAllowlist(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerAddedToAllowlist__1685193315(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1685193315L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerDeoped(Lnet/minecraft/server/players/ServerOpListEntry;)V", cancellable = true)
    private void playerDeoped_889771380(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(889771380L))
            info.cancel();
    }


}
