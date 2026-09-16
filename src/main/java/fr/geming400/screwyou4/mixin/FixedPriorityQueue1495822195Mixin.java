package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.thread.StrictQueue.FixedPriorityQueue.class)
public class FixedPriorityQueue1495822195Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1939553784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939553784L))
            info.setReturnValue(1303771516);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1740028729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740028729L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "push(Lnet/minecraft/util/thread/StrictQueue$RunnableWithPriority;)Z", cancellable = true)
    private void push_827893648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(827893648L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/lang/Runnable;)Z", cancellable = true)
    private void push_1378825614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378825614L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "pop()Ljava/lang/Runnable;", cancellable = true)
    private void pop_1583944577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1583944577L))
            info.setReturnValue(null);
    }


}
