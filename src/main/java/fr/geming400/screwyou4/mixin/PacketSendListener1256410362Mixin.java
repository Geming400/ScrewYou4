package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.PacketSendListener.class)
public class PacketSendListener1256410362Mixin {
        @Inject(at = @At("HEAD"), method = "thenRun(Ljava/lang/Runnable;)Lio/netty/channel/ChannelFutureListener;", cancellable = true)
    private static void thenRun_1848446552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848446552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exceptionallySend(Ljava/util/function/Supplier;)Lio/netty/channel/ChannelFutureListener;", cancellable = true)
    private static void exceptionallySend_399568965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399568965L))
            info.setReturnValue(null);
    }


}
