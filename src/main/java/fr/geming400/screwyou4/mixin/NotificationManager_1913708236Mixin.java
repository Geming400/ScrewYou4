package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.notifications.NotificationManager.class)
public class NotificationManager_1913708236Mixin {
        @Inject(at = @At("HEAD"), method = "server()Lnet/minecraft/server/dedicated/DedicatedServer;", cancellable = true)
    private void server__141250462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-141250462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setServer(Lnet/minecraft/server/dedicated/DedicatedServer;)V", cancellable = true)
    private void setServer__509192786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-509192786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerService(Lnet/minecraft/server/notifications/NotificationService;)V", cancellable = true)
    private void registerService__176204176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-176204176L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerLeft(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void playerLeft__589794730(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-589794730L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGameRuleChanged(Lnet/minecraft/world/level/gamerules/GameRule;Ljava/lang/Object;)V", cancellable = true)
    private void onGameRuleChanged__1833602450(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1833602450L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerJoined(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void playerJoined_471501272(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(471501272L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverSaveCompleted()V", cancellable = true)
    private void serverSaveCompleted_1910936979(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1910936979L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverSaveStarted()V", cancellable = true)
    private void serverSaveStarted__755622627(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-755622627L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverShuttingDown()V", cancellable = true)
    private void serverShuttingDown_1543272087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1543272087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverStarted()V", cancellable = true)
    private void serverStarted__304053120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-304053120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerDeoped(Lnet/minecraft/server/players/ServerOpListEntry;)V", cancellable = true)
    private void playerDeoped__2029729040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2029729040L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "statusHeartbeat()V", cancellable = true)
    private void statusHeartbeat_1232305812(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1232305812L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerRemovedFromAllowlist(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerRemovedFromAllowlist__629734339(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-629734339L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverActivityOccured()V", cancellable = true)
    private void serverActivityOccured__275743899(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-275743899L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerBanned(Lnet/minecraft/server/players/UserBanListEntry;)V", cancellable = true)
    private void playerBanned__549767473(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-549767473L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerAddedToAllowlist(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerAddedToAllowlist_792200302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(792200302L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerUnbanned(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerUnbanned__1776945053(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1776945053L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerOped(Lnet/minecraft/server/players/ServerOpListEntry;)V", cancellable = true)
    private void playerOped__842253295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-842253295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ipBanned(Lnet/minecraft/server/players/IpBanListEntry;)V", cancellable = true)
    private void ipBanned_1816583353(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1816583353L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ipUnbanned(Ljava/lang/String;)V", cancellable = true)
    private void ipUnbanned_947858058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(947858058L))
            info.cancel();
    }


}
