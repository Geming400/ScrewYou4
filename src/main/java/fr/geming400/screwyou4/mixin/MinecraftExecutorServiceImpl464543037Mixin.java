package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftExecutorServiceImpl.class)
public class MinecraftExecutorServiceImpl464543037Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Ljava/lang/Runnable;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void submit__301753036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301753036L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "submit(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void submit_949414958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949414958L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
