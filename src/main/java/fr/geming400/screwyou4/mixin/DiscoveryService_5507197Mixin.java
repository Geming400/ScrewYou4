package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.DiscoveryService.class)
public class DiscoveryService_5507197Mixin {
        @Inject(at = @At("HEAD"), method = "discover(Ljava/util/List;)Lnet/minecraft/server/jsonrpc/methods/DiscoveryService$DiscoverResponse;", cancellable = true)
    private static void discover__648232753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648232753L))
            info.setReturnValue(null);
    }


}
