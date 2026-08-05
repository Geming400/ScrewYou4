package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.JsonRpcNotificationService.class)
public class JsonRpcNotificationService121839571Mixin {
        @Inject(at = @At("HEAD"), method = "playerLeft(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void playerLeft__647722282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-647722282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerJoined(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void playerJoined__647722282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-647722282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGameRuleChanged(Lnet/minecraft/world/level/gamerules/GameRule;Ljava/lang/Object;)V", cancellable = true)
    private void onGameRuleChanged__1176603651(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1176603651L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerOped(Lnet/minecraft/server/players/ServerOpListEntry;)V", cancellable = true)
    private void playerOped__792960198(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-792960198L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ipUnbanned(Ljava/lang/String;)V", cancellable = true)
    private void ipUnbanned_1274200720(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1274200720L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ipBanned(Lnet/minecraft/server/players/IpBanListEntry;)V", cancellable = true)
    private void ipBanned_1789645276(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1789645276L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverSaveCompleted()V", cancellable = true)
    private void serverSaveCompleted_160114310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(160114310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverStarted()V", cancellable = true)
    private void serverStarted_160114310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(160114310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverShuttingDown()V", cancellable = true)
    private void serverShuttingDown_160114310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(160114310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverSaveStarted()V", cancellable = true)
    private void serverSaveStarted_160114310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(160114310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerUnbanned(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerUnbanned_927042403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(927042403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "statusHeartbeat()V", cancellable = true)
    private void statusHeartbeat_160114310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(160114310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerBanned(Lnet/minecraft/server/players/UserBanListEntry;)V", cancellable = true)
    private void playerBanned__98009096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-98009096L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerDeoped(Lnet/minecraft/server/players/ServerOpListEntry;)V", cancellable = true)
    private void playerDeoped__792960198(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-792960198L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerAddedToAllowlist(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerAddedToAllowlist_927042403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(927042403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerRemovedFromAllowlist(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerRemovedFromAllowlist_927042403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(927042403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverActivityOccured()V", cancellable = true)
    private void serverActivityOccured_160114310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(160114310L))
            info.cancel();
    }


}
