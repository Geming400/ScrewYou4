package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.JsonRpcLogger.class)
public class JsonRpcLogger_1898523809Mixin {
        @Inject(at = @At("HEAD"), method = "log(Lnet/minecraft/server/jsonrpc/methods/ClientInfo;Ljava/lang/String;[Ljava/lang/Object;)V", cancellable = true)
    private void log__1624892459(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1624892459L))
            info.cancel();
    }


}
