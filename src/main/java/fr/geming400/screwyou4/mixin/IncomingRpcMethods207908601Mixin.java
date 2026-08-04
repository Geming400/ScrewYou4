package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.IncomingRpcMethods.class)
public class IncomingRpcMethods207908601Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/server/jsonrpc/IncomingRpcMethod;", cancellable = true)
    private static void bootstrap_792102027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792102027L))
            info.setReturnValue(null);
    }


}
