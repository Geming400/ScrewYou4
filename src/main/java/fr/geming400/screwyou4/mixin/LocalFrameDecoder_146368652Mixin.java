package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.LocalFrameDecoder.class)
public class LocalFrameDecoder_146368652Mixin {
        @Inject(at = @At("HEAD"), method = "channelRead(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V", cancellable = true)
    private void channelRead__1181175453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1181175453L))
            info.cancel();
    }


}
