package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftServerSettingsServiceImpl.class)
public class MinecraftServerSettingsServiceImpl1224913386Mixin {
        @Inject(at = @At("HEAD"), method = "getDifficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void getDifficulty__16025795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-16025795L))
            info.setReturnValue(net.minecraft.world.Difficulty.NORMAL);
    }

    @Inject(at = @At("HEAD"), method = "getEntityBroadcastRangePercentage()I", cancellable = true)
    private void getEntityBroadcastRangePercentage__216319871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216319871L))
            info.setReturnValue(-1977756027);
    }

    @Inject(at = @At("HEAD"), method = "setGameMode(Lnet/minecraft/world/level/GameType;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void setGameMode_1971922633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971922633L))
            info.setReturnValue(net.minecraft.world.level.GameType.SURVIVAL);
    }

    @Inject(at = @At("HEAD"), method = "getGameMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getGameMode_807077627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807077627L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "setEntityBroadcastRangePercentage(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setEntityBroadcastRangePercentage_508450067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508450067L))
            info.setReturnValue(1971148501);
    }

    @Inject(at = @At("HEAD"), method = "setMotd(Ljava/lang/String;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/lang/String;", cancellable = true)
    private void setMotd_686139282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686139282L))
            info.setReturnValue("-5TUxPR>@Lpw<d}Dsm\u9180G(\uD3EC3abdR*n\u210C`,g}u-JLgrjOr]\uC1BF3\u48C5TcH'5Y\uCC57]da.oWC\u0156_c4;\uACDDG");
    }

    @Inject(at = @At("HEAD"), method = "setPlayerIdleTimeout(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setPlayerIdleTimeout__725912604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-725912604L))
            info.setReturnValue(599140371);
    }

    @Inject(at = @At("HEAD"), method = "allowFlight()Z", cancellable = true)
    private void allowFlight__1732323800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732323800L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setMaxPlayers(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setMaxPlayers__1462093698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462093698L))
            info.setReturnValue(37698697);
    }

    @Inject(at = @At("HEAD"), method = "setDifficulty(Lnet/minecraft/world/Difficulty;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void setDifficulty_477322747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(477322747L))
            info.setReturnValue(net.minecraft.world.Difficulty.HARD);
    }

    @Inject(at = @At("HEAD"), method = "hidesOnlinePlayers()Z", cancellable = true)
    private void hidesOnlinePlayers__155428749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155428749L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setForceGameMode(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setForceGameMode__1279136944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1279136944L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setStatusHeartbeatInterval(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setStatusHeartbeatInterval_1038086209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038086209L))
            info.setReturnValue(-1800559777);
    }

    @Inject(at = @At("HEAD"), method = "setAllowFlight(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setAllowFlight_27066199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(27066199L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "forceGameMode()Z", cancellable = true)
    private void forceGameMode__1226687775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1226687775L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setHidesOnlinePlayers(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setHidesOnlinePlayers__1236737378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1236737378L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "repliesToStatus()Z", cancellable = true)
    private void repliesToStatus__839468724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839468724L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setRepliesToStatus(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setRepliesToStatus_1859551355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1859551355L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setSimulationDistance(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setSimulationDistance__230862000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-230862000L))
            info.setReturnValue(-1856642946);
    }

    @Inject(at = @At("HEAD"), method = "setViewDistance(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setViewDistance_1749076338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749076338L))
            info.setReturnValue(-526502819);
    }

    @Inject(at = @At("HEAD"), method = "getViewDistance()I", cancellable = true)
    private void getViewDistance__871834208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-871834208L))
            info.setReturnValue(1150576647);
    }

    @Inject(at = @At("HEAD"), method = "getSimulationDistance()I", cancellable = true)
    private void getSimulationDistance_866640382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866640382L))
            info.setReturnValue(1714442088);
    }

    @Inject(at = @At("HEAD"), method = "getPauseWhenEmptySeconds()I", cancellable = true)
    private void getPauseWhenEmptySeconds_1566645796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1566645796L))
            info.setReturnValue(1292184052);
    }

    @Inject(at = @At("HEAD"), method = "setPauseWhenEmptySeconds(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setPauseWhenEmptySeconds_975860878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(975860878L))
            info.setReturnValue(1607039980);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerIdleTimeout()I", cancellable = true)
    private void getPlayerIdleTimeout_988436730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988436730L))
            info.setReturnValue(783233906);
    }

    @Inject(at = @At("HEAD"), method = "getSpawnProtectionRadius()I", cancellable = true)
    private void getSpawnProtectionRadius_1271371040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1271371040L))
            info.setReturnValue(-1848703433);
    }

    @Inject(at = @At("HEAD"), method = "setSpawnProtectionRadius(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setSpawnProtectionRadius_532198538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532198538L))
            info.setReturnValue(1059469946);
    }

    @Inject(at = @At("HEAD"), method = "acceptsTransfers()Z", cancellable = true)
    private void acceptsTransfers__271444988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271444988L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setAcceptsTransfers(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setAcceptsTransfers__1616441489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616441489L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStatusHeartbeatInterval()I", cancellable = true)
    private void getStatusHeartbeatInterval_747704215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747704215L))
            info.setReturnValue(-1038137745);
    }

    @Inject(at = @At("HEAD"), method = "getOperatorUserPermissions()Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private void getOperatorUserPermissions_1077924054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077924054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAutoSave(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setAutoSave__996120960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-996120960L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isEnforceWhitelist()Z", cancellable = true)
    private void isEnforceWhitelist_904328498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(904328498L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setEnforceWhitelist(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setEnforceWhitelist_1525051815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1525051815L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setUsingWhitelist(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setUsingWhitelist_132920777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(132920777L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isUsingWhitelist()Z", cancellable = true)
    private void isUsingWhitelist__1641966636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1641966636L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMaxPlayers()I", cancellable = true)
    private void getMaxPlayers__11347284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-11347284L))
            info.setReturnValue(344133797);
    }

    @Inject(at = @At("HEAD"), method = "setOperatorUserPermissions(Lnet/minecraft/server/permissions/LevelBasedPermissionSet;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private void setOperatorUserPermissions__835397477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835397477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMotd()Ljava/lang/String;", cancellable = true)
    private void getMotd__1424924805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1424924805L))
            info.setReturnValue("[T\uD38BQmnBtC[1Cq(R\u0EB7={G\uA4686P");
    }

    @Inject(at = @At("HEAD"), method = "isAutoSave()Z", cancellable = true)
    private void isAutoSave__1865156021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1865156021L))
            info.setReturnValue(false);
    }


}
