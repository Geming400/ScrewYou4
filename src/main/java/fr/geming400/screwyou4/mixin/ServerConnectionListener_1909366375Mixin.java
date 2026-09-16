package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.ServerConnectionListener.class)
public class ServerConnectionListener_1909366375Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__808497577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-808497577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1779682716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1779682716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSessionId()Ljava/util/UUID;", cancellable = true)
    private void getSessionId__2065245036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2065245036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/server/MinecraftServer;", cancellable = true)
    private void getServer_1910996309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1910996309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getConnections()Ljava/util/List;", cancellable = true)
    private void getConnections__55841995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-55841995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startTcpServerListener(Ljava/net/InetAddress;I)V", cancellable = true)
    private void startTcpServerListener__1712057318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1712057318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopTcpServerListener()V", cancellable = true)
    private void stopTcpServerListener__1179201693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1179201693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startMemoryChannel()Ljava/net/SocketAddress;", cancellable = true)
    private void startMemoryChannel__325859758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-325859758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptChannel(Lio/netty/channel/Channel;Ljava/util/UUID;)V", cancellable = true)
    private void acceptChannel_1082372800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1082372800L))
            info.cancel();
    }


}
