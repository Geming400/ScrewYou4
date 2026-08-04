package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.server.IntegratedServer.class)
public class IntegratedServer946501180Mixin {
        @Inject(at = @At("HEAD"), method = "getPort()I", cancellable = true)
    private void getPort_984763426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984763426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "halt(Z)V", cancellable = true)
    private void halt__2118849287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2118849287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWorldGameType(Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void setWorldGameType_1192777814(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1192777814L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWorldAllowCommands(Z)V", cancellable = true)
    private void setWorldAllowCommands__2118849287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2118849287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPublished()Z", cancellable = true)
    private void isPublished_984779763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984779763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendLowDiskSpaceWarning()V", cancellable = true)
    private void sendLowDiskSpaceWarning_984775919(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(984775919L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPerTickGizmos()Ljava/util/Collection;", cancellable = true)
    private void getPerTickGizmos__867147092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-867147092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useNativeTransport()Z", cancellable = true)
    private void useNativeTransport_984779763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984779763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setUUID(Ljava/util/UUID;)V", cancellable = true)
    private void setUUID_588945091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(588945091L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMultiplayerScope()Lnet/minecraft/server/MinecraftServer$MultiplayerScope;", cancellable = true)
    private void getMultiplayerScope__1053902406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1053902406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "publishServer(Lnet/minecraft/server/MinecraftServer$MultiplayerScope;I)Z", cancellable = true)
    private void publishServer__759016645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-759016645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "publishServer(Lnet/minecraft/server/MinecraftServer$MultiplayerScope;Lnet/minecraft/world/level/GameType;ZI)Z", cancellable = true)
    private void publishServer_175446490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(175446490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpublishServer()Z", cancellable = true)
    private void unpublishServer_984779763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984779763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setGameTypeForOtherPlayers(Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void setGameTypeForOtherPlayers_1192777814(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1192777814L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGameTypeForOtherPlayers()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getGameTypeForOtherPlayers__448945118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-448945118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPaused()Z", cancellable = true)
    private void isPaused_984779763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984779763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCommandsAllowedForOtherPlayers(Z)V", cancellable = true)
    private void setCommandsAllowedForOtherPlayers__2118849287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2118849287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "commandsAllowedForOtherPlayers()Z", cancellable = true)
    private void commandsAllowedForOtherPlayers_984779763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984779763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSingleplayerOwner(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void isSingleplayerOwner_1751707856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1751707856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operatorUserPermissions()Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private void operatorUserPermissions_1759607593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1759607593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxPlayers()I", cancellable = true)
    private void getMaxPlayers_984763426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984763426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceSynchronousWrites()Z", cancellable = true)
    private void forceSynchronousWrites_984779763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984779763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldInformAdmins()Z", cancellable = true)
    private void shouldInformAdmins_984779763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984779763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getScaledTrackingDistance(I)I", cancellable = true)
    private void getScaledTrackingDistance__2134561637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134561637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDedicatedServer()Z", cancellable = true)
    private void isDedicatedServer_984779763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984779763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTickTimeLoggingEnabled()Z", cancellable = true)
    private void isTickTimeLoggingEnabled_984779763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984779763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getForcedGameType()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getForcedGameType__448945118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-448945118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reportChunkLoadFailure(Ljava/lang/Throwable;Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void reportChunkLoadFailure__2140389916(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2140389916L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRconBroadcast()Z", cancellable = true)
    private void shouldRconBroadcast_984779763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984779763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reportChunkSaveFailure(Ljava/lang/Throwable;Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void reportChunkSaveFailure__2140389916(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2140389916L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillServerSystemReport(Lnet/minecraft/SystemReport;)Lnet/minecraft/SystemReport;", cancellable = true)
    private void fillServerSystemReport_375798523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(375798523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServerDirectory()Ljava/nio/file/Path;", cancellable = true)
    private void getServerDirectory__187862502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-187862502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModdedStatus()Lnet/minecraft/util/ModCheck;", cancellable = true)
    private void getModdedStatus_1710450337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710450337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stopServer()V", cancellable = true)
    private void stopServer_984775919(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(984775919L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChatSpamThresholdSeconds()I", cancellable = true)
    private void getChatSpamThresholdSeconds_984763426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984763426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionCompilationPermissions()Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private void getFunctionCompilationPermissions_1759607593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1759607593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionCompilationPermissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void getFunctionCompilationPermissions__125929414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125929414L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCommandSpamThresholdSeconds()I", cancellable = true)
    private void getCommandSpamThresholdSeconds_984763426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984763426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRateLimitPacketsPerSecond()I", cancellable = true)
    private void getRateLimitPacketsPerSecond_984763426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984763426L))
            info.setReturnValue(null);
    }


}
