package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.MonitoredLocalFrameDecoder.class)
public class MonitoredLocalFrameDecoder_212203681Mixin {
        @Inject(at = @At("HEAD"), method = "channelRead(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V", cancellable = true)
    private void channelRead__1115340424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1115340424L))
            info.cancel();
    }


}
