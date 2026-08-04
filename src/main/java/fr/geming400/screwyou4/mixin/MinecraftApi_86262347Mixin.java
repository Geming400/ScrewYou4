package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftApi.class)
public class MinecraftApi_86262347Mixin {
        @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/server/notifications/NotificationManager;)Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;", cancellable = true)
    private static void of_1715067305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715067305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "submit(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void submit__595085741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595085741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "submit(Ljava/lang/Runnable;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void submit__995622359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-995622359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "banListService()Lnet/minecraft/server/jsonrpc/internalapi/MinecraftBanListService;", cancellable = true)
    private void banListService_1989570463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1989570463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operatorListService()Lnet/minecraft/server/jsonrpc/internalapi/MinecraftOperatorListService;", cancellable = true)
    private void operatorListService__599227412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-599227412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameRuleService()Lnet/minecraft/server/jsonrpc/internalapi/MinecraftGameRuleService;", cancellable = true)
    private void gameRuleService__1342378600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342378600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverStateService()Lnet/minecraft/server/jsonrpc/internalapi/MinecraftServerStateService;", cancellable = true)
    private void serverStateService__1629780448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629780448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverSettingsService()Lnet/minecraft/server/jsonrpc/internalapi/MinecraftServerSettingsService;", cancellable = true)
    private void serverSettingsService_1944058128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944058128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerListService()Lnet/minecraft/server/jsonrpc/internalapi/MinecraftPlayerListService;", cancellable = true)
    private void playerListService_2050094697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2050094697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowListService()Lnet/minecraft/server/jsonrpc/internalapi/MinecraftAllowListService;", cancellable = true)
    private void allowListService__600164263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-600164263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notificationManager()Lnet/minecraft/server/notifications/NotificationManager;", cancellable = true)
    private void notificationManager_1364893653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364893653L))
            info.setReturnValue(null);
    }


}
