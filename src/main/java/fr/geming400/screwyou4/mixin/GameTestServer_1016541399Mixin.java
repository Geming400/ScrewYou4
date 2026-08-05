package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestServer.class)
public class GameTestServer_1016541399Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/lang/Thread;Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lnet/minecraft/server/packs/repository/PackRepository;Ljava/util/Optional;ZI)Lnet/minecraft/gametest/framework/GameTestServer;", cancellable = true)
    private static void create__1661151714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1661151714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPublished()Z", cancellable = true)
    private void isPublished_1054819981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054819981L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMaxPlayers()I", cancellable = true)
    private void getMaxPlayers_1054803644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054803644L))
            info.setReturnValue(1979944638);
    }

    @Inject(at = @At("HEAD"), method = "isSingleplayerOwner(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void isSingleplayerOwner_1821748074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1821748074L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "operatorUserPermissions()Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private void operatorUserPermissions_1829647811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829647811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTickTimeLoggingEnabled()Z", cancellable = true)
    private void isTickTimeLoggingEnabled_1054819981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054819981L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldRconBroadcast()Z", cancellable = true)
    private void shouldRconBroadcast_1054819981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054819981L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldInformAdmins()Z", cancellable = true)
    private void shouldInformAdmins_1054819981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054819981L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isDedicatedServer()Z", cancellable = true)
    private void isDedicatedServer_1054819981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054819981L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fillServerSystemReport(Lnet/minecraft/SystemReport;)Lnet/minecraft/SystemReport;", cancellable = true)
    private void fillServerSystemReport_445838741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(445838741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTestsForSelection(Lnet/minecraft/core/RegistryAccess;Ljava/lang/String;)Ljava/util/stream/Stream;", cancellable = true)
    private static void getTestsForSelection_104022631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104022631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isHardcore()Z", cancellable = true)
    private void isHardcore_1054819981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054819981L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "useNativeTransport()Z", cancellable = true)
    private void useNativeTransport_1054819981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054819981L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionCompilationPermissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void getFunctionCompilationPermissions__56018156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56018156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCommandSpamThresholdSeconds()I", cancellable = true)
    private void getCommandSpamThresholdSeconds_1054803644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054803644L))
            info.setReturnValue(1979944638);
    }

    @Inject(at = @At("HEAD"), method = "getRateLimitPacketsPerSecond()I", cancellable = true)
    private void getRateLimitPacketsPerSecond_1054803644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054803644L))
            info.setReturnValue(1979944638);
    }

    @Inject(at = @At("HEAD"), method = "getChatSpamThresholdSeconds()I", cancellable = true)
    private void getChatSpamThresholdSeconds_1054803644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054803644L))
            info.setReturnValue(1979944638);
    }


}
