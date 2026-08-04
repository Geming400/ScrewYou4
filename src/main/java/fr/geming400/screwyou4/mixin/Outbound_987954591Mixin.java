package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.UnconfiguredPipelineHandler.Outbound.class)
public class Outbound_987954591Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V", cancellable = true)
    private void write_1192337257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1192337257L))
            info.cancel();
    }


}
