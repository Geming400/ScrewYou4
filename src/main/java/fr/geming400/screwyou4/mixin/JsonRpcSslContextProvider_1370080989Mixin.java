package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.security.JsonRpcSslContextProvider.class)
public class JsonRpcSslContextProvider_1370080989Mixin {
        @Inject(at = @At("HEAD"), method = "printInstructions()V", cancellable = true)
    private static void printInstructions_982549717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(982549717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFrom(Ljava/lang/String;Ljava/lang/String;)Lio/netty/handler/ssl/SslContext;", cancellable = true)
    private static void createFrom__722341659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-722341659L))
            info.setReturnValue(null);
    }


}
