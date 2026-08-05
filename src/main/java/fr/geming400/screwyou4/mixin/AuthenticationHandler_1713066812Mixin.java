package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.security.AuthenticationHandler.class)
public class AuthenticationHandler_1713066812Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V", cancellable = true)
    private void write__1269917467(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1269917467L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "channelRead(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V", cancellable = true)
    private void channelRead__390051910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-390051910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isValidApiKey(Ljava/lang/String;)Z", cancellable = true)
    private void isValidApiKey_943449509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943449509L))
            info.setReturnValue(true);
    }


}
