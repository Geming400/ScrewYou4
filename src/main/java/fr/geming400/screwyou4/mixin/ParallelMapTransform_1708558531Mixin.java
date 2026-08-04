package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.thread.ParallelMapTransform.class)
public class ParallelMapTransform_1708558531Mixin {
        @Inject(at = @At("HEAD"), method = "schedule(Ljava/util/Map;Ljava/util/function/BiFunction;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void schedule__1692311439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692311439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "schedule(Ljava/util/Map;Ljava/util/function/BiFunction;ILjava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void schedule__1499835490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1499835490L))
            info.setReturnValue(null);
    }


}
