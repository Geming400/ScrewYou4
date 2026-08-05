package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.ServerSettingsService.class)
public class ServerSettingsService1979620577Mixin {
        @Inject(at = @At("HEAD"), method = "gameMode(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void gameMode__34159279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-34159279L))
            info.setReturnValue(net.minecraft.world.level.GameType.CREATIVE);
    }

    @Inject(at = @At("HEAD"), method = "operatorUserPermissionLevel(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Lnet/minecraft/server/permissions/PermissionLevel;", cancellable = true)
    private static void operatorUserPermissionLevel__597339641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-597339641L))
            info.setReturnValue(net.minecraft.server.permissions.PermissionLevel.ALL);
    }

    @Inject(at = @At("HEAD"), method = "entityBroadcastRangePercentage(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void entityBroadcastRangePercentage__1742836883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742836883L))
            info.setReturnValue(-1883758976);
    }

    @Inject(at = @At("HEAD"), method = "setEntityBroadcastRangePercentage(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setEntityBroadcastRangePercentage__1041540021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041540021L))
            info.setReturnValue(-566970084);
    }

    @Inject(at = @At("HEAD"), method = "setOperatorUserPermissionLevel(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/server/permissions/PermissionLevel;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/server/permissions/PermissionLevel;", cancellable = true)
    private static void setOperatorUserPermissionLevel__995185559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-995185559L))
            info.setReturnValue(net.minecraft.server.permissions.PermissionLevel.GAMEMASTERS);
    }

    @Inject(at = @At("HEAD"), method = "setDifficulty(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/world/Difficulty;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/world/Difficulty;", cancellable = true)
    private static void setDifficulty__1613465803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1613465803L))
            info.setReturnValue(net.minecraft.world.Difficulty.HARD);
    }

    @Inject(at = @At("HEAD"), method = "enforceAllowlist(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void enforceAllowlist__1742820546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742820546L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "usingAllowlist(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void usingAllowlist__1742820546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742820546L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setEnforceAllowlist(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setEnforceAllowlist_2109670571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109670571L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setMaxPlayers(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setMaxPlayers__1041540021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041540021L))
            info.setReturnValue(-566970084);
    }

    @Inject(at = @At("HEAD"), method = "pauseWhenEmpty(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void pauseWhenEmpty__1742836883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742836883L))
            info.setReturnValue(-1883758976);
    }

    @Inject(at = @At("HEAD"), method = "playerIdleTimeout(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void playerIdleTimeout__1742836883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742836883L))
            info.setReturnValue(-1883758976);
    }

    @Inject(at = @At("HEAD"), method = "setPlayerIdleTimeout(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setPlayerIdleTimeout__1041540021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041540021L))
            info.setReturnValue(-566970084);
    }

    @Inject(at = @At("HEAD"), method = "setPauseWhenEmpty(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setPauseWhenEmpty__1041540021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041540021L))
            info.setReturnValue(-566970084);
    }

    @Inject(at = @At("HEAD"), method = "setAllowFlight(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setAllowFlight_2109670571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109670571L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "spawnProtection(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void spawnProtection__1742836883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742836883L))
            info.setReturnValue(-1883758976);
    }

    @Inject(at = @At("HEAD"), method = "setSpawnProtection(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setSpawnProtection__1041540021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041540021L))
            info.setReturnValue(-566970084);
    }

    @Inject(at = @At("HEAD"), method = "forceGameMode(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void forceGameMode__1742820546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742820546L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setUsingAllowlist(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setUsingAllowlist_2109670571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109670571L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "allowFlight(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void allowFlight__1742820546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742820546L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setForceGameMode(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setForceGameMode_2109670571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109670571L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setViewDistance(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setViewDistance__1041540021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041540021L))
            info.setReturnValue(-566970084);
    }

    @Inject(at = @At("HEAD"), method = "setGameMode(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/world/level/GameType;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void setGameMode__1038388163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1038388163L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "setAutosave(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setAutosave_2109670571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109670571L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "viewDistance(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void viewDistance__1742836883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742836883L))
            info.setReturnValue(-1883758976);
    }

    @Inject(at = @At("HEAD"), method = "simulationDistance(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void simulationDistance__1742836883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742836883L))
            info.setReturnValue(-1883758976);
    }

    @Inject(at = @At("HEAD"), method = "setSimulationDistance(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setSimulationDistance__1041540021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041540021L))
            info.setReturnValue(-566970084);
    }

    @Inject(at = @At("HEAD"), method = "acceptTransfers(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void acceptTransfers__1742820546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742820546L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setStatusHeartbeatInterval(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setStatusHeartbeatInterval__1041540021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041540021L))
            info.setReturnValue(-566970084);
    }

    @Inject(at = @At("HEAD"), method = "hidesOnlinePlayers(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void hidesOnlinePlayers__1742820546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742820546L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setRepliesToStatus(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setRepliesToStatus_2109670571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109670571L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "statusHeartbeatInterval(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void statusHeartbeatInterval__1742836883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742836883L))
            info.setReturnValue(-1883758976);
    }

    @Inject(at = @At("HEAD"), method = "setHidesOnlinePlayers(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setHidesOnlinePlayers_2109670571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109670571L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "repliesToStatus(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void repliesToStatus__1742820546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742820546L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setAcceptTransfers(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setAcceptTransfers_2109670571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109670571L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "autosave(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void autosave__1742820546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742820546L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "maxPlayers(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void maxPlayers__1742836883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742836883L))
            info.setReturnValue(-1883758976);
    }

    @Inject(at = @At("HEAD"), method = "motd(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Ljava/lang/String;", cancellable = true)
    private static void motd_934115188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934115188L))
            info.setReturnValue("/TL?z페/ꗦ(");
    }

    @Inject(at = @At("HEAD"), method = "setMotd(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/lang/String;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/lang/String;", cancellable = true)
    private static void setMotd__807902013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-807902013L))
            info.setReturnValue("IJqk$块}3_%JBכⶹB|YN͓36b6uZo?S鿬-}=_*⻧KCeYd.X1JPIFZb憉I iH86MIXLuꚝ\"#1⩹v&!_1@M");
    }

    @Inject(at = @At("HEAD"), method = "difficulty(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Lnet/minecraft/world/Difficulty;", cancellable = true)
    private static void difficulty__103708019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-103708019L))
            info.setReturnValue(net.minecraft.world.Difficulty.EASY);
    }


}
