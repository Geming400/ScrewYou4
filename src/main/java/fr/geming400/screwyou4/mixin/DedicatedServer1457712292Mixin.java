package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dedicated.DedicatedServer.class)
public class DedicatedServer1457712292Mixin {
        @Inject(at = @At("HEAD"), method = "getProperties()Lnet/minecraft/server/dedicated/DedicatedServerProperties;", cancellable = true)
    private void getProperties_692221573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692221573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setGameMode(Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void setGameMode_1703988926(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703988926L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDifficulty(Lnet/minecraft/world/Difficulty;)V", cancellable = true)
    private void setDifficulty_1050806138(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1050806138L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "viewDistance()I", cancellable = true)
    private void viewDistance_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "simulationDistance()I", cancellable = true)
    private void simulationDistance_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPublished()Z", cancellable = true)
    private void isPublished_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendLowDiskSpaceWarning()V", cancellable = true)
    private void sendLowDiskSpaceWarning_1495987031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1495987031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useNativeTransport()Z", cancellable = true)
    private void useNativeTransport_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runCommand(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void runCommand__1624513181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1624513181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void gameMode_62265994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62265994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMotd()Ljava/lang/String;", cancellable = true)
    private void getMotd_322251821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322251821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverLinks()Lnet/minecraft/server/ServerLinks;", cancellable = true)
    private void serverLinks_1595959924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595959924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCompressionThreshold()I", cancellable = true)
    private void getCompressionThreshold_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setViewDistance(I)V", cancellable = true)
    private void setViewDistance__1623338032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1623338032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSingleplayerOwner(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void isSingleplayerOwner__2032048328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2032048328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operatorUserPermissions()Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private void operatorUserPermissions__2024148591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2024148591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxPlayers()I", cancellable = true)
    private void getMaxPlayers_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enforceSecureProfile()Z", cancellable = true)
    private void enforceSecureProfile_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSimulationDistance(I)V", cancellable = true)
    private void setSimulationDistance__1623338032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1623338032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isUsingWhitelist()Z", cancellable = true)
    private void isUsingWhitelist_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceSynchronousWrites()Z", cancellable = true)
    private void forceSynchronousWrites_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldInformAdmins()Z", cancellable = true)
    private void shouldInformAdmins_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getScaledTrackingDistance(I)I", cancellable = true)
    private void getScaledTrackingDistance__1623350525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623350525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDedicatedServer()Z", cancellable = true)
    private void isDedicatedServer_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTickTimeLoggingEnabled()Z", cancellable = true)
    private void isTickTimeLoggingEnabled_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getForcedGameType()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getForcedGameType_62265994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62265994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRconBroadcast()Z", cancellable = true)
    private void shouldRconBroadcast_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillServerSystemReport(Lnet/minecraft/SystemReport;)Lnet/minecraft/SystemReport;", cancellable = true)
    private void fillServerSystemReport_887009635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(887009635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerList()Lnet/minecraft/server/dedicated/DedicatedPlayerList;", cancellable = true)
    private void getPlayerList_1147721244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1147721244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerList()Lnet/minecraft/server/players/PlayerList;", cancellable = true)
    private void getPlayerList_309459668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309459668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerIdleTimeout()I", cancellable = true)
    private void playerIdleTimeout_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saveAllChunks(ZZZ)Z", cancellable = true)
    private void saveAllChunks__912287451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-912287451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAbsoluteMaxWorldSize()I", cancellable = true)
    private void getAbsoluteMaxWorldSize_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCodeOfConducts()Ljava/util/Map;", cancellable = true)
    private void getCodeOfConducts__546911348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-546911348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pauseWhenEmptySeconds()I", cancellable = true)
    private void pauseWhenEmptySeconds_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlayerIdleTimeout(I)V", cancellable = true)
    private void setPlayerIdleTimeout__1623338032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1623338032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hidesOnlinePlayers()Z", cancellable = true)
    private void hidesOnlinePlayers_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "repliesToStatus()Z", cancellable = true)
    private void repliesToStatus_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServerResourcePack()Ljava/util/Optional;", cancellable = true)
    private void getServerResourcePack_1703173714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703173714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isUnderSpawnProtection(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void isUnderSpawnProtection__2050755911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2050755911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowFlight()Z", cancellable = true)
    private void allowFlight_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnforceWhitelist()Z", cancellable = true)
    private void isEnforceWhitelist_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEnforceWhitelist(Z)V", cancellable = true)
    private void setEnforceWhitelist__1607638175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1607638175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dumpServerProperties(Ljava/nio/file/Path;)V", cancellable = true)
    private void dumpServerProperties__1229968202(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1229968202L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTextFilterForPlayer(Lnet/minecraft/server/level/ServerPlayer;)Lnet/minecraft/server/network/TextFilter;", cancellable = true)
    private void createTextFilterForPlayer__1364404934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1364404934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setUsingWhitelist(Z)V", cancellable = true)
    private void setUsingWhitelist__1607638175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1607638175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acceptsTransfers()Z", cancellable = true)
    private void acceptsTransfers_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMotd(Ljava/lang/String;)V", cancellable = true)
    private void setMotd__1684893855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1684893855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "logIPs()Z", cancellable = true)
    private void logIPs_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChatSpamThresholdSeconds()I", cancellable = true)
    private void getChatSpamThresholdSeconds_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionCompilationPermissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void getFunctionCompilationPermissions_385152738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(385152738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCommandSpamThresholdSeconds()I", cancellable = true)
    private void getCommandSpamThresholdSeconds_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRateLimitPacketsPerSecond()I", cancellable = true)
    private void getRateLimitPacketsPerSecond_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxChainedNeighborUpdates()I", cancellable = true)
    private void getMaxChainedNeighborUpdates_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showGui()V", cancellable = true)
    private void showGui_1495987031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1495987031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getServerPort()I", cancellable = true)
    private void getServerPort_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServerIp()Ljava/lang/String;", cancellable = true)
    private void getServerIp_322251821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322251821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelIdName()Ljava/lang/String;", cancellable = true)
    private void getLevelIdName_322251821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322251821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServerName()Ljava/lang/String;", cancellable = true)
    private void getServerName_322251821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322251821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPluginNames()Ljava/lang/String;", cancellable = true)
    private void getPluginNames_322251821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322251821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEntityBroadcastRangePercentage(I)V", cancellable = true)
    private void setEntityBroadcastRangePercentage__1623338032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1623338032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityBroadcastRangePercentage()I", cancellable = true)
    private void entityBroadcastRangePercentage_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxTickLength()J", cancellable = true)
    private void getMaxTickLength_1495975499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495975499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnProtectionRadius()I", cancellable = true)
    private void spawnProtectionRadius_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleConsoleInputs()V", cancellable = true)
    private void handleConsoleInputs_1495987031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1495987031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "statusHeartbeatInterval()I", cancellable = true)
    private void statusHeartbeatInterval_1495974538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495974538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceGameMode()Z", cancellable = true)
    private void forceGameMode_1495990875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495990875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRepliesToStatus(Z)V", cancellable = true)
    private void setRepliesToStatus__1607638175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1607638175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAllowFlight(Z)V", cancellable = true)
    private void setAllowFlight__1607638175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1607638175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMaxPlayers(I)V", cancellable = true)
    private void setMaxPlayers__1623338032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1623338032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setForceGameMode(Z)V", cancellable = true)
    private void setForceGameMode__1607638175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1607638175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSpawnProtectionRadius(I)V", cancellable = true)
    private void setSpawnProtectionRadius__1623338032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1623338032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAcceptsTransfers(Z)V", cancellable = true)
    private void setAcceptsTransfers__1607638175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1607638175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPauseWhenEmptySeconds(I)V", cancellable = true)
    private void setPauseWhenEmptySeconds__1623338032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1623338032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStatusHeartbeatInterval(I)Z", cancellable = true)
    private void setStatusHeartbeatInterval__1623334188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623334188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleConsoleInput(Ljava/lang/String;Lnet/minecraft/commands/CommandSourceStack;)V", cancellable = true)
    private void handleConsoleInput_1614617935(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1614617935L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHidesOnlinePlayers(Z)V", cancellable = true)
    private void setHidesOnlinePlayers__1607638175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1607638175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOperatorUserPermissions(Lnet/minecraft/server/permissions/LevelBasedPermissionSet;)V", cancellable = true)
    private void setOperatorUserPermissions__1856808763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1856808763L))
            info.cancel();
    }


}
