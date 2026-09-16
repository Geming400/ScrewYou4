package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.ServerSettingsService.class)
public class ServerSettingsService1979620577Mixin {
        @Inject(at = @At("HEAD"), method = "gameMode(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void gameMode__1820760580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820760580L))
            info.setReturnValue(net.minecraft.world.level.GameType.ADVENTURE);
    }

    @Inject(at = @At("HEAD"), method = "setGameMode(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/world/level/GameType;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void setGameMode__620235276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620235276L))
            info.setReturnValue(net.minecraft.world.level.GameType.CREATIVE);
    }

    @Inject(at = @At("HEAD"), method = "viewDistance(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void viewDistance_2106867239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106867239L))
            info.setReturnValue(-465746202);
    }

    @Inject(at = @At("HEAD"), method = "setMotd(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/lang/String;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/lang/String;", cancellable = true)
    private static void setMotd__722475049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-722475049L))
            info.setReturnValue("Dcj-Td:.'xclqtW\uB619A\u6113sYaKe&JW\u1E32D1mt\u21E0mBb4Z%QH?\uFDBEuf0\u2395\u9FE8d[V{u@tRbh,o>");
    }

    @Inject(at = @At("HEAD"), method = "autosave(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void autosave_351088874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(351088874L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "maxPlayers(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void maxPlayers_458006043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458006043L))
            info.setReturnValue(-45794243);
    }

    @Inject(at = @At("HEAD"), method = "motd(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Ljava/lang/String;", cancellable = true)
    private static void motd_183150882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183150882L))
            info.setReturnValue("SAm6ds;:64@}b>\u61A6CuoA<\u0776i\u7D57s!2_]I,tj)q\u3189%\u7160Il0@pP\u0CA6\u3949.2\uD68CP");
    }

    @Inject(at = @At("HEAD"), method = "difficulty(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Lnet/minecraft/world/Difficulty;", cancellable = true)
    private static void difficulty_728100338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(728100338L))
            info.setReturnValue(net.minecraft.world.Difficulty.HARD);
    }

    @Inject(at = @At("HEAD"), method = "operatorUserPermissionLevel(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Lnet/minecraft/server/permissions/PermissionLevel;", cancellable = true)
    private static void operatorUserPermissionLevel__1081118879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1081118879L))
            info.setReturnValue(net.minecraft.server.permissions.PermissionLevel.MODERATORS);
    }

    @Inject(at = @At("HEAD"), method = "entityBroadcastRangePercentage(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void entityBroadcastRangePercentage__1232884826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1232884826L))
            info.setReturnValue(1628029524);
    }

    @Inject(at = @At("HEAD"), method = "setEntityBroadcastRangePercentage(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setEntityBroadcastRangePercentage__1495553594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495553594L))
            info.setReturnValue(1990207148);
    }

    @Inject(at = @At("HEAD"), method = "setOperatorUserPermissionLevel(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/server/permissions/PermissionLevel;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/server/permissions/PermissionLevel;", cancellable = true)
    private static void setOperatorUserPermissionLevel__1408531699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1408531699L))
            info.setReturnValue(net.minecraft.server.permissions.PermissionLevel.ALL);
    }

    @Inject(at = @At("HEAD"), method = "enforceAllowlist(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void enforceAllowlist_2071200611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071200611L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setUsingAllowlist(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setUsingAllowlist_1399373872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399373872L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setMaxPlayers(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setMaxPlayers__1994323461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1994323461L))
            info.setReturnValue(915661855);
    }

    @Inject(at = @At("HEAD"), method = "spawnProtection(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void spawnProtection_584405537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(584405537L))
            info.setReturnValue(-1866537850);
    }

    @Inject(at = @At("HEAD"), method = "simulationDistance(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void simulationDistance_466720905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466720905L))
            info.setReturnValue(-311986361);
    }

    @Inject(at = @At("HEAD"), method = "playerIdleTimeout(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void playerIdleTimeout_1935189689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1935189689L))
            info.setReturnValue(-342815402);
    }

    @Inject(at = @At("HEAD"), method = "pauseWhenEmpty(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void pauseWhenEmpty_572139210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572139210L))
            info.setReturnValue(1848531970);
    }

    @Inject(at = @At("HEAD"), method = "forceGameMode(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void forceGameMode_1668714494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1668714494L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSimulationDistance(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setSimulationDistance__1353143575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1353143575L))
            info.setReturnValue(-1015156197);
    }

    @Inject(at = @At("HEAD"), method = "statusHeartbeatInterval(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)I", cancellable = true)
    private static void statusHeartbeatInterval__1834884356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1834884356L))
            info.setReturnValue(779693177);
    }

    @Inject(at = @At("HEAD"), method = "setHidesOnlinePlayers(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setHidesOnlinePlayers_537573531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(537573531L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setPlayerIdleTimeout(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setPlayerIdleTimeout__723618859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-723618859L))
            info.setReturnValue(-331486827);
    }

    @Inject(at = @At("HEAD"), method = "acceptTransfers(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void acceptTransfers__753703682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-753703682L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "repliesToStatus(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void repliesToStatus_610334003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610334003L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setDifficulty(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/world/Difficulty;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/world/Difficulty;", cancellable = true)
    private static void setDifficulty__414401166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-414401166L))
            info.setReturnValue(net.minecraft.world.Difficulty.HARD);
    }

    @Inject(at = @At("HEAD"), method = "hidesOnlinePlayers(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void hidesOnlinePlayers__1363470804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1363470804L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setAutosave(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setAutosave__816397735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816397735L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setSpawnProtection(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setSpawnProtection__769446723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-769446723L))
            info.setReturnValue(-1257765288);
    }

    @Inject(at = @At("HEAD"), method = "setPauseWhenEmpty(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setPauseWhenEmpty__284370966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-284370966L))
            info.setReturnValue(1009315152);
    }

    @Inject(at = @At("HEAD"), method = "setViewDistance(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setViewDistance__1520470393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520470393L))
            info.setReturnValue(-1222701754);
    }

    @Inject(at = @At("HEAD"), method = "setRepliesToStatus(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setRepliesToStatus_1771439646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771439646L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setAllowFlight(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setAllowFlight_2005467074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2005467074L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "usingAllowlist(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void usingAllowlist_2085096449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085096449L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setAcceptTransfers(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setAcceptTransfers_687820073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(687820073L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setForceGameMode(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setForceGameMode_953044905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(953044905L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "allowFlight(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Z", cancellable = true)
    private static void allowFlight__732393257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-732393257L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setEnforceAllowlist(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void setEnforceAllowlist_1097073298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097073298L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setStatusHeartbeatInterval(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ILnet/minecraft/server/jsonrpc/methods/ClientInfo;)I", cancellable = true)
    private static void setStatusHeartbeatInterval__1273326888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1273326888L))
            info.setReturnValue(-1371992434);
    }


}
