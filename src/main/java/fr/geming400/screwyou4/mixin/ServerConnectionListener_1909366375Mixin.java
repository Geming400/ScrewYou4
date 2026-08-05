package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.ServerConnectionListener.class)
public class ServerConnectionListener_1909366375Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1947641113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1947641113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1947641113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1947641113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSessionId()Ljava/util/UUID;", cancellable = true)
    private void getSessionId__1974466439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1974466439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptChannel(Lio/netty/channel/Channel;Ljava/util/UUID;)V", cancellable = true)
    private void acceptChannel_1243881211(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1243881211L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getConnections()Ljava/util/List;", cancellable = true)
    private void getConnections__759264106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-759264106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/server/MinecraftServer;", cancellable = true)
    private void getServer_822280796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(822280796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startMemoryChannel()Ljava/net/SocketAddress;", cancellable = true)
    private void startMemoryChannel_2007500498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2007500498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stopTcpServerListener()V", cancellable = true)
    private void stopTcpServerListener_1947641113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1947641113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTcpServerListener(Ljava/net/InetAddress;I)V", cancellable = true)
    private void startTcpServerListener__1901178364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1901178364L))
            info.cancel();
    }


}
