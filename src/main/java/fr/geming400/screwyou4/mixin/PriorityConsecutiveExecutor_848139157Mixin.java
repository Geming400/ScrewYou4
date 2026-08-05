package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.thread.PriorityConsecutiveExecutor.class)
public class PriorityConsecutiveExecutor_848139157Mixin {
        @Inject(at = @At("HEAD"), method = "wrapRunnable(Ljava/lang/Runnable;)Lnet/minecraft/util/thread/StrictQueue$RunnableWithPriority;", cancellable = true)
    private void wrapRunnable_536915541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536915541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrapRunnable(Ljava/lang/Runnable;)Ljava/lang/Runnable;", cancellable = true)
    private void wrapRunnable__737948461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-737948461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scheduleWithResult(ILjava/util/function/Consumer;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void scheduleWithResult_1520840384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1520840384L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
