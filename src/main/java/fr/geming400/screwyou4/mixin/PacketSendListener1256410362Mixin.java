package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.PacketSendListener.class)
public class PacketSendListener1256410362Mixin {
        @Inject(at = @At("HEAD"), method = "thenRun(Ljava/lang/Runnable;)Lio/netty/channel/ChannelFutureListener;", cancellable = true)
    private static void thenRun__1563419862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1563419862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exceptionallySend(Ljava/util/function/Supplier;)Lio/netty/channel/ChannelFutureListener;", cancellable = true)
    private static void exceptionallySend__1162883244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162883244L))
            info.setReturnValue(null);
    }


}
