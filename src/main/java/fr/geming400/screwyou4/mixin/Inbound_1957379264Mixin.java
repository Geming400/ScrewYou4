package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.UnconfiguredPipelineHandler.Inbound.class)
public class Inbound_1957379264Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V", cancellable = true)
    private void write__1025605015(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1025605015L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "channelRead(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V", cancellable = true)
    private void channelRead__145739458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-145739458L))
            info.cancel();
    }


}
