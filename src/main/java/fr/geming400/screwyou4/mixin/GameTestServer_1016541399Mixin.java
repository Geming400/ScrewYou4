package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestServer.class)
public class GameTestServer_1016541399Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/lang/Thread;Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lnet/minecraft/server/packs/repository/PackRepository;Ljava/util/Optional;ZI)Lnet/minecraft/gametest/framework/GameTestServer;", cancellable = true)
    private static void create_813024538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813024538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTestsForSelection(Lnet/minecraft/core/RegistryAccess;Ljava/lang/String;)Ljava/util/stream/Stream;", cancellable = true)
    private static void getTestsForSelection__1375448651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1375448651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useNativeTransport()Z", cancellable = true)
    private void useNativeTransport__718997214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-718997214L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getChatSpamThresholdSeconds()I", cancellable = true)
    private void getChatSpamThresholdSeconds_85588913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85588913L))
            info.setReturnValue(1609634501);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionCompilationPermissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void getFunctionCompilationPermissions_1105909571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1105909571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCommandSpamThresholdSeconds()I", cancellable = true)
    private void getCommandSpamThresholdSeconds_740018762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740018762L))
            info.setReturnValue(-1167593824);
    }

    @Inject(at = @At("HEAD"), method = "getRateLimitPacketsPerSecond()I", cancellable = true)
    private void getRateLimitPacketsPerSecond_2046230577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2046230577L))
            info.setReturnValue(75448427);
    }

    @Inject(at = @At("HEAD"), method = "isPublished()Z", cancellable = true)
    private void isPublished_79900969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(79900969L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMaxPlayers()I", cancellable = true)
    private void getMaxPlayers__219719272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-219719272L))
            info.setReturnValue(2061954018);
    }

    @Inject(at = @At("HEAD"), method = "operatorUserPermissions()Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private void operatorUserPermissions_1985990008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1985990008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSingleplayerOwner(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void isSingleplayerOwner__1253862294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1253862294L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isDedicatedServer()Z", cancellable = true)
    private void isDedicatedServer__1976557563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1976557563L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isTickTimeLoggingEnabled()Z", cancellable = true)
    private void isTickTimeLoggingEnabled__1036223753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1036223753L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fillServerSystemReport(Lnet/minecraft/SystemReport;)Lnet/minecraft/SystemReport;", cancellable = true)
    private void fillServerSystemReport_289791006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289791006L))
            info.setReturnValue(new net.minecraft.SystemReport());
    }

    @Inject(at = @At("HEAD"), method = "shouldRconBroadcast()Z", cancellable = true)
    private void shouldRconBroadcast_712035695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712035695L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldInformAdmins()Z", cancellable = true)
    private void shouldInformAdmins__1229085331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1229085331L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isHardcore()Z", cancellable = true)
    private void isHardcore__433459015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-433459015L))
            info.setReturnValue(false);
    }


}
