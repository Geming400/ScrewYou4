package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.LocalFrameEncoder.class)
public class LocalFrameEncoder846568012Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V", cancellable = true)
    private void write_1050950679(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1050950679L))
            info.cancel();
    }


}
