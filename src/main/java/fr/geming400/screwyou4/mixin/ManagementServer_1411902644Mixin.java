package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.ManagementServer.class)
public class ManagementServer_1411902644Mixin {
        @Inject(at = @At("HEAD"), method = "stop(Z)V", cancellable = true)
    private void stop__1653447824(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1653447824L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPort()I", cancellable = true)
    private void getPort_1450164889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1450164889L))
            info.setReturnValue(-2116572295);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1450177382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1450177382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDisconnected(Lnet/minecraft/server/jsonrpc/Connection;)V", cancellable = true)
    private void onDisconnected__1351638827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1351638827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scheduleHeartbeat(Lnet/minecraft/server/notifications/NotificationManager;J)Z", cancellable = true)
    private void scheduleHeartbeat_1799317400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1799317400L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onConnected(Lnet/minecraft/server/jsonrpc/Connection;)V", cancellable = true)
    private void onConnected__1351638827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1351638827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startWithoutTls(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)V", cancellable = true)
    private void startWithoutTls_1984424724(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1984424724L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startWithTls(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lio/netty/handler/ssl/SslContext;)V", cancellable = true)
    private void startWithTls_973827150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(973827150L))
            info.cancel();
    }


}
