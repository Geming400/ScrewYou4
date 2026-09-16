package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.ManagementServer.class)
public class ManagementServer_1411902644Mixin {
        @Inject(at = @At("HEAD"), method = "stop(Z)V", cancellable = true)
    private void stop__1194401294(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1194401294L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPort()I", cancellable = true)
    private void getPort__1830239230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1830239230L))
            info.setReturnValue(1255569614);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1282218985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1282218985L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDisconnected(Lnet/minecraft/server/jsonrpc/Connection;)V", cancellable = true)
    private void onDisconnected_580904207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(580904207L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scheduleHeartbeat(Lnet/minecraft/server/notifications/NotificationManager;J)Z", cancellable = true)
    private void scheduleHeartbeat__281641731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-281641731L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "startWithTls(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lio/netty/handler/ssl/SslContext;)V", cancellable = true)
    private void startWithTls__1588013669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1588013669L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startWithoutTls(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)V", cancellable = true)
    private void startWithoutTls__1882663255(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1882663255L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onConnected(Lnet/minecraft/server/jsonrpc/Connection;)V", cancellable = true)
    private void onConnected__1698658497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1698658497L))
            info.cancel();
    }


}
