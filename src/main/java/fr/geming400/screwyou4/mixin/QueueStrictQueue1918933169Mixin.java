package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.thread.StrictQueue.QueueStrictQueue.class)
public class QueueStrictQueue1918933169Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size__1932302538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1932302538L))
            info.setReturnValue(1410765865);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1316917755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1316917755L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/lang/Runnable;)Z", cancellable = true)
    private void push_1801807628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1801807628L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "pop()Ljava/lang/Runnable;", cancellable = true)
    private void pop_2007055551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2007055551L))
            info.setReturnValue(null);
    }


}
