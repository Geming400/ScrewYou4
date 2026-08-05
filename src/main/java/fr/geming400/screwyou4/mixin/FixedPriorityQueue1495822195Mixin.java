package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.thread.StrictQueue.FixedPriorityQueue.class)
public class FixedPriorityQueue1495822195Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1534084441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534084441L))
            info.setReturnValue(866292886);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1534100778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534100778L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "push(Lnet/minecraft/util/thread/StrictQueue$RunnableWithPriority;)Z", cancellable = true)
    private void push_1143710570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143710570L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/lang/Runnable;)Z", cancellable = true)
    private void push__1342270616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342270616L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "pop()Ljava/lang/Runnable;", cancellable = true)
    private void pop__1466629072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466629072L))
            info.setReturnValue(null);
    }


}
