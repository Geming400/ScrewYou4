package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftExecutorServiceImpl.class)
public class MinecraftExecutorServiceImpl464543037Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Ljava/lang/Runnable;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void submit__617341668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-617341668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "submit(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void submit__216805050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216805050L))
            info.setReturnValue(null);
    }


}
