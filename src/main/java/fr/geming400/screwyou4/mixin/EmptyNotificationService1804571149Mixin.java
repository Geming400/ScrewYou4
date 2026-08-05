package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.notifications.EmptyNotificationService.class)
public class EmptyNotificationService1804571149Mixin {
        @Inject(at = @At("HEAD"), method = "playerJoined(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void playerJoined_362364186(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(362364186L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ipUnbanned(Ljava/lang/String;)V", cancellable = true)
    private void ipUnbanned_838720972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(838720972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerOped(Lnet/minecraft/server/players/ServerOpListEntry;)V", cancellable = true)
    private void playerOped__951390381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-951390381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ipBanned(Lnet/minecraft/server/players/IpBanListEntry;)V", cancellable = true)
    private void ipBanned_1707446267(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1707446267L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGameRuleChanged(Lnet/minecraft/world/level/gamerules/GameRule;Ljava/lang/Object;)V", cancellable = true)
    private void onGameRuleChanged__1942739536(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1942739536L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverSaveStarted()V", cancellable = true)
    private void serverSaveStarted__864759713(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-864759713L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverShuttingDown()V", cancellable = true)
    private void serverShuttingDown_1434135001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1434135001L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverStarted()V", cancellable = true)
    private void serverStarted__413190206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-413190206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverSaveCompleted()V", cancellable = true)
    private void serverSaveCompleted_1801799893(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1801799893L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerDeoped(Lnet/minecraft/server/players/ServerOpListEntry;)V", cancellable = true)
    private void playerDeoped__2138866126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2138866126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerAddedToAllowlist(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerAddedToAllowlist_683063216(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(683063216L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerRemovedFromAllowlist(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerRemovedFromAllowlist__738871425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-738871425L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerBanned(Lnet/minecraft/server/players/UserBanListEntry;)V", cancellable = true)
    private void playerBanned__658904559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-658904559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverActivityOccured()V", cancellable = true)
    private void serverActivityOccured__384880985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-384880985L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerUnbanned(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerUnbanned__1886082139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1886082139L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "statusHeartbeat()V", cancellable = true)
    private void statusHeartbeat_1123168726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1123168726L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerLeft(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void playerLeft__698931816(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-698931816L))
            info.cancel();
    }


}
