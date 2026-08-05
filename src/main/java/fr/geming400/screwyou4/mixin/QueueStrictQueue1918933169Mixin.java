package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.thread.StrictQueue.QueueStrictQueue.class)
public class QueueStrictQueue1918933169Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1957195415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957195415L))
            info.setReturnValue(1574548562);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1957211752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957211752L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/lang/Runnable;)Z", cancellable = true)
    private void push__919288602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-919288602L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "pop()Ljava/lang/Runnable;", cancellable = true)
    private void pop__1043518098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1043518098L))
            info.setReturnValue(null);
    }


}
