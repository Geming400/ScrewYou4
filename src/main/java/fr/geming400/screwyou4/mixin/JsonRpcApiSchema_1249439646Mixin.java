package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.dataprovider.JsonRpcApiSchema.class)
public class JsonRpcApiSchema_1249439646Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__639407257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-639407257L))
            info.setReturnValue("xyf");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1349165388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349165388L))
            info.setReturnValue(null);
    }


}
