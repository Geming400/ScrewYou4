package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.security.AuthenticationHandler.class)
public class AuthenticationHandler_1713066812Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V", cancellable = true)
    private void write_1917449478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1917449478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "channelRead(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V", cancellable = true)
    private void channelRead_385522707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(385522707L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isValidApiKey(Ljava/lang/String;)Z", cancellable = true)
    private void isValidApiKey__1429535492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1429535492L))
            info.setReturnValue(false);
    }


}
