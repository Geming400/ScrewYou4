package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.LegacyServerPinger.class)
public class LegacyServerPinger_1447493561Mixin {
        @Inject(at = @At("HEAD"), method = "channelActive(Lio/netty/channel/ChannelHandlerContext;)V", cancellable = true)
    private void channelActive_1682771947(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1682771947L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "exceptionCaught(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Throwable;)V", cancellable = true)
    private void exceptionCaught__88599144(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-88599144L))
            info.cancel();
    }


}
