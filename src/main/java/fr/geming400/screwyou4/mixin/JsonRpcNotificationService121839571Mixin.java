package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.JsonRpcNotificationService.class)
public class JsonRpcNotificationService121839571Mixin {
        @Inject(at = @At("HEAD"), method = "playerLeft(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void playerLeft_1913303902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1913303902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ipUnbanned(Ljava/lang/String;)V", cancellable = true)
    private void ipUnbanned__844010606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-844010606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ipBanned(Lnet/minecraft/server/players/IpBanListEntry;)V", cancellable = true)
    private void ipBanned_24714689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(24714689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerOped(Lnet/minecraft/server/players/ServerOpListEntry;)V", cancellable = true)
    private void playerOped_1660845337(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1660845337L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerDeoped(Lnet/minecraft/server/players/ServerOpListEntry;)V", cancellable = true)
    private void playerDeoped_473369592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(473369592L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "statusHeartbeat()V", cancellable = true)
    private void statusHeartbeat__559562852(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-559562852L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerBanned(Lnet/minecraft/server/players/UserBanListEntry;)V", cancellable = true)
    private void playerBanned_1953331159(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1953331159L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerAddedToAllowlist(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerAddedToAllowlist__999668362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-999668362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerRemovedFromAllowlist(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerRemovedFromAllowlist_1873364293(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1873364293L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverActivityOccured()V", cancellable = true)
    private void serverActivityOccured__2067612563(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2067612563L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerUnbanned(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void playerUnbanned_726153579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(726153579L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGameRuleChanged(Lnet/minecraft/world/level/gamerules/GameRule;Ljava/lang/Object;)V", cancellable = true)
    private void onGameRuleChanged_669496182(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(669496182L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverShuttingDown()V", cancellable = true)
    private void serverShuttingDown__248596577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-248596577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverStarted()V", cancellable = true)
    private void serverStarted__2095921784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2095921784L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverSaveCompleted()V", cancellable = true)
    private void serverSaveCompleted_119068315(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(119068315L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverSaveStarted()V", cancellable = true)
    private void serverSaveStarted_1747476005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1747476005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerJoined(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void playerJoined__1320367392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1320367392L))
            info.cancel();
    }


}
