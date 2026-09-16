package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.server.IntegratedServer.class)
public class IntegratedServer946501180Mixin {
        @Inject(at = @At("HEAD"), method = "getPort()I", cancellable = true)
    private void getPort_1999326603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999326603L))
            info.setReturnValue(736153772);
    }

    @Inject(at = @At("HEAD"), method = "halt(Z)V", cancellable = true)
    private void halt__1194674054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1194674054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setUUID(Ljava/util/UUID;)V", cancellable = true)
    private void setUUID_950956998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(950956998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopServer()V", cancellable = true)
    private void stopServer__368293334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-368293334L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPaused()Z", cancellable = true)
    private void isPaused__1854858245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1854858245L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getForcedGameType()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getForcedGameType__668881315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-668881315L))
            info.setReturnValue(net.minecraft.world.level.GameType.CREATIVE);
    }

    @Inject(at = @At("HEAD"), method = "useNativeTransport()Z", cancellable = true)
    private void useNativeTransport__789037432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-789037432L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sendLowDiskSpaceWarning()V", cancellable = true)
    private void sendLowDiskSpaceWarning__1071104112(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1071104112L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPerTickGizmos()Ljava/util/Collection;", cancellable = true)
    private void getPerTickGizmos__1380166167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1380166167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceSynchronousWrites()Z", cancellable = true)
    private void forceSynchronousWrites__1763661375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1763661375L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPublished()Z", cancellable = true)
    private void isPublished_9860751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(9860751L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRateLimitPacketsPerSecond()I", cancellable = true)
    private void getRateLimitPacketsPerSecond_1976190359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976190359L))
            info.setReturnValue(-1540439186);
    }

    @Inject(at = @At("HEAD"), method = "getCommandSpamThresholdSeconds()I", cancellable = true)
    private void getCommandSpamThresholdSeconds_669978544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669978544L))
            info.setReturnValue(-229966157);
    }

    @Inject(at = @At("HEAD"), method = "getChatSpamThresholdSeconds()I", cancellable = true)
    private void getChatSpamThresholdSeconds_15548695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(15548695L))
            info.setReturnValue(-1301976621);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionCompilationPermissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void getFunctionCompilationPermissions_1035998313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1035998313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionCompilationPermissions()Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private void getFunctionCompilationPermissions__2083723112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083723112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxPlayers()I", cancellable = true)
    private void getMaxPlayers__289759490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289759490L))
            info.setReturnValue(-1199757595);
    }

    @Inject(at = @At("HEAD"), method = "setGameTypeForOtherPlayers(Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void setGameTypeForOtherPlayers__1715191879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1715191879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGameTypeForOtherPlayers()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getGameTypeForOtherPlayers__1554291989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1554291989L))
            info.setReturnValue(net.minecraft.world.level.GameType.ADVENTURE);
    }

    @Inject(at = @At("HEAD"), method = "publishServer(Lnet/minecraft/server/MinecraftServer$MultiplayerScope;I)Z", cancellable = true)
    private void publishServer_2078691145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2078691145L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "publishServer(Lnet/minecraft/server/MinecraftServer$MultiplayerScope;Lnet/minecraft/world/level/GameType;ZI)Z", cancellable = true)
    private void publishServer_266546828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(266546828L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "unpublishServer()Z", cancellable = true)
    private void unpublishServer__1333984166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1333984166L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMultiplayerScope()Lnet/minecraft/server/MinecraftServer$MultiplayerScope;", cancellable = true)
    private void getMultiplayerScope__1573715158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1573715158L))
            info.setReturnValue(net.minecraft.server.MinecraftServer.MultiplayerScope.LAN);
    }

    @Inject(at = @At("HEAD"), method = "isSingleplayerOwner(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void isSingleplayerOwner__1323902512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1323902512L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "operatorUserPermissions()Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private void operatorUserPermissions_1915949790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915949790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldInformAdmins()Z", cancellable = true)
    private void shouldInformAdmins__1299125549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1299125549L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "reportChunkSaveFailure(Ljava/lang/Throwable;Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void reportChunkSaveFailure__1426401680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1426401680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRconBroadcast()Z", cancellable = true)
    private void shouldRconBroadcast_641995477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641995477L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isTickTimeLoggingEnabled()Z", cancellable = true)
    private void isTickTimeLoggingEnabled__1106263971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1106263971L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fillServerSystemReport(Lnet/minecraft/SystemReport;)Lnet/minecraft/SystemReport;", cancellable = true)
    private void fillServerSystemReport_219750788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(219750788L))
            info.setReturnValue(new net.minecraft.SystemReport());
    }

    @Inject(at = @At("HEAD"), method = "getModdedStatus()Lnet/minecraft/util/ModCheck;", cancellable = true)
    private void getModdedStatus__553673672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-553673672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServerDirectory()Ljava/nio/file/Path;", cancellable = true)
    private void getServerDirectory__1292340658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292340658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getScaledTrackingDistance(I)I", cancellable = true)
    private void getScaledTrackingDistance_1939873495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939873495L))
            info.setReturnValue(-2033596175);
    }

    @Inject(at = @At("HEAD"), method = "reportChunkLoadFailure(Ljava/lang/Throwable;Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void reportChunkLoadFailure__2129114663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2129114663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDedicatedServer()Z", cancellable = true)
    private void isDedicatedServer__2046597781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2046597781L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setCommandsAllowedForOtherPlayers(Z)V", cancellable = true)
    private void setCommandsAllowedForOtherPlayers_204105222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(204105222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "commandsAllowedForOtherPlayers()Z", cancellable = true)
    private void commandsAllowedForOtherPlayers__1720525560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1720525560L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setWorldGameType(Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void setWorldGameType__727898854(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-727898854L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWorldAllowCommands(Z)V", cancellable = true)
    private void setWorldAllowCommands__163064134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-163064134L))
            info.cancel();
    }


}
