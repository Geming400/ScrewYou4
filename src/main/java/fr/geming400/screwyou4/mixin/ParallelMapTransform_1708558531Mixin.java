package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.thread.ParallelMapTransform.class)
public class ParallelMapTransform_1708558531Mixin {
        @Inject(at = @At("HEAD"), method = "schedule(Ljava/util/Map;Ljava/util/function/BiFunction;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void schedule__1022039622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1022039622L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "schedule(Ljava/util/Map;Ljava/util/function/BiFunction;ILjava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void schedule_2098721653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098721653L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
