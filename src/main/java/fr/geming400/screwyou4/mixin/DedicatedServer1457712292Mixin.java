package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dedicated.DedicatedServer.class)
public class DedicatedServer1457712292Mixin {
        @Inject(at = @At("HEAD"), method = "getProperties()Lnet/minecraft/server/dedicated/DedicatedServerProperties;", cancellable = true)
    private void getProperties__1938675218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1938675218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMotd()Ljava/lang/String;", cancellable = true)
    private void getMotd__1192125899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192125899L))
            info.setReturnValue("g63)\uC6EAg}RUM\u6E3D<zW8\uCEDFF*[L|1osWJ0lQW&Xxp*aE'8_pbh$\u6FF9U^JlR\u3F3El \uFEFBN'HB7");
    }

    @Inject(at = @At("HEAD"), method = "enforceSecureProfile()Z", cancellable = true)
    private void enforceSecureProfile__682387733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-682387733L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "operatorUserPermissions()Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private void operatorUserPermissions__1867806394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1867806394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSingleplayerOwner(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void isSingleplayerOwner__812691400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-812691400L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldInformAdmins()Z", cancellable = true)
    private void shouldInformAdmins__787914437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-787914437L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isTickTimeLoggingEnabled()Z", cancellable = true)
    private void isTickTimeLoggingEnabled__595052859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595052859L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getScaledTrackingDistance(I)I", cancellable = true)
    private void getScaledTrackingDistance__1843882689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843882689L))
            info.setReturnValue(327452612);
    }

    @Inject(at = @At("HEAD"), method = "shouldRconBroadcast()Z", cancellable = true)
    private void shouldRconBroadcast_1153206589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1153206589L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isDedicatedServer()Z", cancellable = true)
    private void isDedicatedServer__1535386669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1535386669L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fillServerSystemReport(Lnet/minecraft/SystemReport;)Lnet/minecraft/SystemReport;", cancellable = true)
    private void fillServerSystemReport_730961900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730961900L))
            info.setReturnValue(new net.minecraft.SystemReport());
    }

    @Inject(at = @At("HEAD"), method = "getAbsoluteMaxWorldSize()I", cancellable = true)
    private void getAbsoluteMaxWorldSize__1889180978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1889180978L))
            info.setReturnValue(-324428425);
    }

    @Inject(at = @At("HEAD"), method = "pauseWhenEmptySeconds()I", cancellable = true)
    private void pauseWhenEmptySeconds_202591464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202591464L))
            info.setReturnValue(-754005209);
    }

    @Inject(at = @At("HEAD"), method = "saveAllChunks(ZZZ)Z", cancellable = true)
    private void saveAllChunks_1411849935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411849935L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getServerResourcePack()Ljava/util/Optional;", cancellable = true)
    private void getServerResourcePack__1055589774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055589774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCodeOfConducts()Ljava/util/Map;", cancellable = true)
    private void getCodeOfConducts__984392829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-984392829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dumpServerProperties(Ljava/nio/file/Path;)V", cancellable = true)
    private void dumpServerProperties__451399412(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-451399412L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverLinks()Lnet/minecraft/server/ServerLinks;", cancellable = true)
    private void serverLinks__859089878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-859089878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useNativeTransport()Z", cancellable = true)
    private void useNativeTransport__277826320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-277826320L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sendLowDiskSpaceWarning()V", cancellable = true)
    private void sendLowDiskSpaceWarning__559893000(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-559893000L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxPlayers()I", cancellable = true)
    private void getMaxPlayers_221451622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(221451622L))
            info.setReturnValue(-1944208554);
    }

    @Inject(at = @At("HEAD"), method = "setSpawnProtectionRadius(I)V", cancellable = true)
    private void setSpawnProtectionRadius__1233486860(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1233486860L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPauseWhenEmptySeconds(I)V", cancellable = true)
    private void setPauseWhenEmptySeconds__669904016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-669904016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEnforceWhitelist()Z", cancellable = true)
    private void isEnforceWhitelist_1137127404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137127404L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "acceptsTransfers()Z", cancellable = true)
    private void acceptsTransfers__38646082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-38646082L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setAcceptsTransfers(Z)V", cancellable = true)
    private void setAcceptsTransfers_681686624(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(681686624L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOperatorUserPermissions(Lnet/minecraft/server/permissions/LevelBasedPermissionSet;)V", cancellable = true)
    private void setOperatorUserPermissions__1884439886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1884439886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isUsingWhitelist()Z", cancellable = true)
    private void isUsingWhitelist__1409167730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1409167730L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setEnforceWhitelist(Z)V", cancellable = true)
    private void setEnforceWhitelist__990585560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-990585560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setUsingWhitelist(Z)V", cancellable = true)
    private void setUsingWhitelist__285605690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-285605690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCompressionThreshold()I", cancellable = true)
    private void getCompressionThreshold_1550926159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1550926159L))
            info.setReturnValue(1618643228);
    }

    @Inject(at = @At("HEAD"), method = "setEntityBroadcastRangePercentage(I)V", cancellable = true)
    private void setEntityBroadcastRangePercentage_1569640523(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1569640523L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityBroadcastRangePercentage()I", cancellable = true)
    private void entityBroadcastRangePercentage_1174039153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174039153L))
            info.setReturnValue(1432843462);
    }

    @Inject(at = @At("HEAD"), method = "forceSynchronousWrites()Z", cancellable = true)
    private void forceSynchronousWrites__1252450263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1252450263L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerList()Lnet/minecraft/server/dedicated/DedicatedPlayerList;", cancellable = true)
    private void getPlayerList_583905841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583905841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerList()Lnet/minecraft/server/players/PlayerList;", cancellable = true)
    private void getPlayerList__421668385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-421668385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPublished()Z", cancellable = true)
    private void isPublished_521071863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521071863L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isUnderSpawnProtection(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void isUnderSpawnProtection_284551871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(284551871L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "gameMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void gameMode_672019007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672019007L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "getRateLimitPacketsPerSecond()I", cancellable = true)
    private void getRateLimitPacketsPerSecond__1807565825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807565825L))
            info.setReturnValue(-985658525);
    }

    @Inject(at = @At("HEAD"), method = "getChatSpamThresholdSeconds()I", cancellable = true)
    private void getChatSpamThresholdSeconds_526759807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(526759807L))
            info.setReturnValue(1231804257);
    }

    @Inject(at = @At("HEAD"), method = "getCommandSpamThresholdSeconds()I", cancellable = true)
    private void getCommandSpamThresholdSeconds_1181189656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1181189656L))
            info.setReturnValue(1890797145);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionCompilationPermissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void getFunctionCompilationPermissions_1547080465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1547080465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAllowFlight(Z)V", cancellable = true)
    private void setAllowFlight_805681528(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(805681528L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "repliesToStatus()Z", cancellable = true)
    private void repliesToStatus__606669818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606669818L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setGameMode(Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void setGameMode__1709717145(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1709717145L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMaxPlayers(I)V", cancellable = true)
    private void setMaxPlayers_272396672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(272396672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "simulationDistance()I", cancellable = true)
    private void simulationDistance_1904719086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904719086L))
            info.setReturnValue(-1981054957);
    }

    @Inject(at = @At("HEAD"), method = "setSimulationDistance(I)V", cancellable = true)
    private void setSimulationDistance_1918404718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1918404718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "viewDistance()I", cancellable = true)
    private void viewDistance__2034986736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2034986736L))
            info.setReturnValue(1852661437);
    }

    @Inject(at = @At("HEAD"), method = "setViewDistance(I)V", cancellable = true)
    private void setViewDistance__847922676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-847922676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDifficulty(Lnet/minecraft/world/Difficulty;)V", cancellable = true)
    private void setDifficulty_1509477341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1509477341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStatusHeartbeatInterval(I)Z", cancellable = true)
    private void setStatusHeartbeatInterval_1225478753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1225478753L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setForceGameMode(Z)V", cancellable = true)
    private void setForceGameMode_1308161119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1308161119L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHidesOnlinePlayers(Z)V", cancellable = true)
    private void setHidesOnlinePlayers_1120356177(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1120356177L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRepliesToStatus(Z)V", cancellable = true)
    private void setRepliesToStatus_1321085908(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1321085908L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forceGameMode()Z", cancellable = true)
    private void forceGameMode__993888869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-993888869L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setPlayerIdleTimeout(I)V", cancellable = true)
    private void setPlayerIdleTimeout__1178071718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1178071718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerIdleTimeout()I", cancellable = true)
    private void playerIdleTimeout__553902914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-553902914L))
            info.setReturnValue(1336096148);
    }

    @Inject(at = @At("HEAD"), method = "allowFlight()Z", cancellable = true)
    private void allowFlight__1499524894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1499524894L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "statusHeartbeatInterval()I", cancellable = true)
    private void statusHeartbeatInterval__292133925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-292133925L))
            info.setReturnValue(1499629712);
    }

    @Inject(at = @At("HEAD"), method = "hidesOnlinePlayers()Z", cancellable = true)
    private void hidesOnlinePlayers_77370157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(77370157L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setMotd(Ljava/lang/String;)V", cancellable = true)
    private void setMotd__1250169395(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1250169395L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxChainedNeighborUpdates()I", cancellable = true)
    private void getMaxChainedNeighborUpdates__64109500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-64109500L))
            info.setReturnValue(-267709132);
    }

    @Inject(at = @At("HEAD"), method = "getPluginNames()Ljava/lang/String;", cancellable = true)
    private void getPluginNames_1497833868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497833868L))
            info.setReturnValue("Pl,*\uD3F4O\u60E9i0k^hJj>'[\uA295XK7\u47D6");
    }

    @Inject(at = @At("HEAD"), method = "getLevelIdName()Ljava/lang/String;", cancellable = true)
    private void getLevelIdName__758628639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-758628639L))
            info.setReturnValue("3N/d7;-0\u4AFDy");
    }

    @Inject(at = @At("HEAD"), method = "getServerPort()I", cancellable = true)
    private void getServerPort__1253732240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1253732240L))
            info.setReturnValue(-2073438083);
    }

    @Inject(at = @At("HEAD"), method = "getServerName()Ljava/lang/String;", cancellable = true)
    private void getServerName_406357393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406357393L))
            info.setReturnValue("`0-v`gL=nk+&82?\uA7D7.`h\u5CA1sdUq\u9784>^#&|V=F\uA8E8ARfzd`Z\"*\uAA93FxfY\uD013{]gduc\u19B8bE1}T)t:@|z5AoI);h#2;lEsi-\u38A6xF^\u164C')");
    }

    @Inject(at = @At("HEAD"), method = "getServerIp()Ljava/lang/String;", cancellable = true)
    private void getServerIp_14577005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(14577005L))
            info.setReturnValue("w`\uFEE0m>\uA9EA\u77C3-F8eQX!$/TwP13['<\u2DF6\"_fyMnPjXr$]Z'9q\u69D8\u3AACZhz;!FCA;K4707rZ\u15B9\"\u1A22?CQ=9[*JqSMOX&D\u87A46\uB622N+E\u9E0Ae[");
    }

    @Inject(at = @At("HEAD"), method = "createTextFilterForPlayer(Lnet/minecraft/server/level/ServerPlayer;)Lnet/minecraft/server/network/TextFilter;", cancellable = true)
    private void createTextFilterForPlayer_736550243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736550243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getForcedGameType()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getForcedGameType__157670203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-157670203L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "handleConsoleInput(Ljava/lang/String;Lnet/minecraft/commands/CommandSourceStack;)V", cancellable = true)
    private void handleConsoleInput__2107115126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2107115126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnProtectionRadius()I", cancellable = true)
    private void spawnProtectionRadius__92683292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-92683292L))
            info.setReturnValue(-1930382334);
    }

    @Inject(at = @At("HEAD"), method = "getMaxTickLength()J", cancellable = true)
    private void getMaxTickLength__1091695302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1091695302L))
            info.setReturnValue(-7829817044555253843L);
    }

    @Inject(at = @At("HEAD"), method = "handleConsoleInputs()V", cancellable = true)
    private void handleConsoleInputs_991420799(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(991420799L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showGui()V", cancellable = true)
    private void showGui__765337319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-765337319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runCommand(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void runCommand__730890333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-730890333L))
            info.setReturnValue("\u71E2$1 p\u1C085_j)Mo^!m: 2\u38CD@\u8056d^Rg`[2)>=k\u154DWf#(Bh,\u87E1W\uFDB9TVu\u58A8 \u63A3;P\"\u2262/q\uA77FZndSe'yJ`\uD7B1 3\u17951a\"ZCA$`#6A{7\u6829)AOD\u6F1B\"\u0FC8wRO;Fv\u52DA");
    }

    @Inject(at = @At("HEAD"), method = "logIPs()Z", cancellable = true)
    private void logIPs__1469267725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1469267725L))
            info.setReturnValue(false);
    }


}
