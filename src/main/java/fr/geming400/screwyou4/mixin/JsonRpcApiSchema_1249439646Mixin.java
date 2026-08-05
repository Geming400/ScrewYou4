package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.dataprovider.JsonRpcApiSchema.class)
public class JsonRpcApiSchema_1249439646Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_113979174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(113979174L))
            info.setReturnValue("W]u^T&YTWS\u34517Q5PMb|}?L-\u6B69X0y$XC");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1975962103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1975962103L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
