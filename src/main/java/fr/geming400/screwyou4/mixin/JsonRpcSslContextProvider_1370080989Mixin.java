package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.security.JsonRpcSslContextProvider.class)
public class JsonRpcSslContextProvider_1370080989Mixin {
        @Inject(at = @At("HEAD"), method = "createFrom(Ljava/lang/String;Ljava/lang/String;)Lio/netty/handler/ssl/SslContext;", cancellable = true)
    private static void createFrom_780128491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(780128491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "printInstructions()V", cancellable = true)
    private static void printInstructions_1408355975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1408355975L))
            info.cancel();
    }


}
