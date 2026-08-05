package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftServerSettingsServiceImpl.class)
public class MinecraftServerSettingsServiceImpl1224913386Mixin {
        @Inject(at = @At("HEAD"), method = "getEntityBroadcastRangePercentage()I", cancellable = true)
    private void getEntityBroadcastRangePercentage_1263175632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263175632L))
            info.setReturnValue(1190149487);
    }

    @Inject(at = @At("HEAD"), method = "getGameMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getGameMode__170532912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-170532912L))
            info.setReturnValue(net.minecraft.world.level.GameType.CREATIVE);
    }

    @Inject(at = @At("HEAD"), method = "getSimulationDistance()I", cancellable = true)
    private void getSimulationDistance_1263175632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263175632L))
            info.setReturnValue(1190149487);
    }

    @Inject(at = @At("HEAD"), method = "getViewDistance()I", cancellable = true)
    private void getViewDistance_1263175632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263175632L))
            info.setReturnValue(1190149487);
    }

    @Inject(at = @At("HEAD"), method = "setEntityBroadcastRangePercentage(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setEntityBroadcastRangePercentage_378863662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378863662L))
            info.setReturnValue(1396197911);
    }

    @Inject(at = @At("HEAD"), method = "setDifficulty(Lnet/minecraft/world/Difficulty;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void setDifficulty_1750620056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750620056L))
            info.setReturnValue(net.minecraft.world.Difficulty.NORMAL);
    }

    @Inject(at = @At("HEAD"), method = "setMaxPlayers(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setMaxPlayers_378863662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378863662L))
            info.setReturnValue(1396197911);
    }

    @Inject(at = @At("HEAD"), method = "setPlayerIdleTimeout(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setPlayerIdleTimeout_378863662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378863662L))
            info.setReturnValue(1396197911);
    }

    @Inject(at = @At("HEAD"), method = "setAllowFlight(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setAllowFlight__764893042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764893042L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "forceGameMode()Z", cancellable = true)
    private void forceGameMode_1263191969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263191969L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "allowFlight()Z", cancellable = true)
    private void allowFlight_1263191969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263191969L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setForceGameMode(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setForceGameMode__764893042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764893042L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setViewDistance(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setViewDistance_378863662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378863662L))
            info.setReturnValue(1396197911);
    }

    @Inject(at = @At("HEAD"), method = "setGameMode(Lnet/minecraft/world/level/GameType;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void setGameMode__1577131360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577131360L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "setSimulationDistance(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setSimulationDistance_378863662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378863662L))
            info.setReturnValue(1396197911);
    }

    @Inject(at = @At("HEAD"), method = "setStatusHeartbeatInterval(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setStatusHeartbeatInterval_378863662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378863662L))
            info.setReturnValue(1396197911);
    }

    @Inject(at = @At("HEAD"), method = "hidesOnlinePlayers()Z", cancellable = true)
    private void hidesOnlinePlayers_1263191969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263191969L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setRepliesToStatus(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setRepliesToStatus__764893042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764893042L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setHidesOnlinePlayers(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setHidesOnlinePlayers__764893042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764893042L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "repliesToStatus()Z", cancellable = true)
    private void repliesToStatus_1263191969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263191969L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDifficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void getDifficulty_153160716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153160716L))
            info.setReturnValue(net.minecraft.world.Difficulty.EASY);
    }

    @Inject(at = @At("HEAD"), method = "setMotd(Ljava/lang/String;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/lang/String;", cancellable = true)
    private void setMotd__332688346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-332688346L))
            info.setReturnValue("l-bf(eCZﱢvGpz9{k2&欳c.r|?D>4P02rx");
    }

    @Inject(at = @At("HEAD"), method = "getMotd()Ljava/lang/String;", cancellable = true)
    private void getMotd_89452915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(89452915L))
            info.setReturnValue("홿{;[wꛈ뻆.71flrXQ;xr9slFp %YvD哵xji]䙌SM!]Y0{츈マ`xK7jj:r`[RnAbL:ꘀ}");
    }

    @Inject(at = @At("HEAD"), method = "isAutoSave()Z", cancellable = true)
    private void isAutoSave_1263191969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263191969L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isEnforceWhitelist()Z", cancellable = true)
    private void isEnforceWhitelist_1263191969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263191969L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setEnforceWhitelist(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setEnforceWhitelist__764893042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764893042L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setUsingWhitelist(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setUsingWhitelist__764893042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764893042L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPauseWhenEmptySeconds()I", cancellable = true)
    private void getPauseWhenEmptySeconds_1263175632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263175632L))
            info.setReturnValue(1190149487);
    }

    @Inject(at = @At("HEAD"), method = "setPauseWhenEmptySeconds(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setPauseWhenEmptySeconds_378863662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378863662L))
            info.setReturnValue(1396197911);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerIdleTimeout()I", cancellable = true)
    private void getPlayerIdleTimeout_1263175632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263175632L))
            info.setReturnValue(1190149487);
    }

    @Inject(at = @At("HEAD"), method = "isUsingWhitelist()Z", cancellable = true)
    private void isUsingWhitelist_1263191969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263191969L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMaxPlayers()I", cancellable = true)
    private void getMaxPlayers_1263175632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263175632L))
            info.setReturnValue(1190149487);
    }

    @Inject(at = @At("HEAD"), method = "setAutoSave(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setAutoSave__764893042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764893042L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "acceptsTransfers()Z", cancellable = true)
    private void acceptsTransfers_1263191969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263191969L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSpawnProtectionRadius()I", cancellable = true)
    private void getSpawnProtectionRadius_1263175632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263175632L))
            info.setReturnValue(1190149487);
    }

    @Inject(at = @At("HEAD"), method = "setOperatorUserPermissions(Lnet/minecraft/server/permissions/LevelBasedPermissionSet;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private void setOperatorUserPermissions__2026629394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2026629394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSpawnProtectionRadius(ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private void setSpawnProtectionRadius_378863662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378863662L))
            info.setReturnValue(1396197911);
    }

    @Inject(at = @At("HEAD"), method = "getStatusHeartbeatInterval()I", cancellable = true)
    private void getStatusHeartbeatInterval_1263175632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263175632L))
            info.setReturnValue(1190149487);
    }

    @Inject(at = @At("HEAD"), method = "setAcceptsTransfers(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void setAcceptsTransfers__764893042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764893042L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOperatorUserPermissions()Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private void getOperatorUserPermissions_2038019799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2038019799L))
            info.setReturnValue(null);
    }


}
