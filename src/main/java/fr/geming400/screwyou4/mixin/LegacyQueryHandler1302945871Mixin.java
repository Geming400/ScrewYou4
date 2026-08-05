package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.LegacyQueryHandler.class)
public class LegacyQueryHandler1302945871Mixin {
        @Inject(at = @At("HEAD"), method = "channelRead(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V", cancellable = true)
    private void channelRead__800172850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-800172850L))
            info.cancel();
    }


}
