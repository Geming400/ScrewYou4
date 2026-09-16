package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftApi.class)
public class MinecraftApi_86262347Mixin {
        @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/server/notifications/NotificationManager;)Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;", cancellable = true)
    private static void of__1299215758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1299215758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "submit(Ljava/lang/Runnable;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void submit__680033727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-680033727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "submit(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void submit_571134267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(571134267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notificationManager()Lnet/minecraft/server/notifications/NotificationManager;", cancellable = true)
    private void notificationManager__1096265449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096265449L))
            info.setReturnValue(new net.minecraft.server.notifications.NotificationManager());
    }

    @Inject(at = @At("HEAD"), method = "banListService()Lnet/minecraft/server/jsonrpc/internalapi/MinecraftBanListService;", cancellable = true)
    private void banListService__166736313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-166736313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowListService()Lnet/minecraft/server/jsonrpc/internalapi/MinecraftAllowListService;", cancellable = true)
    private void allowListService__1752537209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1752537209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerListService()Lnet/minecraft/server/jsonrpc/internalapi/MinecraftPlayerListService;", cancellable = true)
    private void playerListService__1197201261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1197201261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operatorListService()Lnet/minecraft/server/jsonrpc/internalapi/MinecraftOperatorListService;", cancellable = true)
    private void operatorListService__821770983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821770983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverSettingsService()Lnet/minecraft/server/jsonrpc/internalapi/MinecraftServerSettingsService;", cancellable = true)
    private void serverSettingsService_870681121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870681121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverStateService()Lnet/minecraft/server/jsonrpc/internalapi/MinecraftServerStateService;", cancellable = true)
    private void serverStateService__1648739033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1648739033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameRuleService()Lnet/minecraft/server/jsonrpc/internalapi/MinecraftGameRuleService;", cancellable = true)
    private void gameRuleService_151913201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151913201L))
            info.setReturnValue(null);
    }


}
