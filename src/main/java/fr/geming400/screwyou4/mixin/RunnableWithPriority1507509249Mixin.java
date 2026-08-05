package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.thread.StrictQueue.RunnableWithPriority.class)
public class RunnableWithPriority1507509249Mixin {
        @Inject(at = @At("HEAD"), method = "priority()I", cancellable = true)
    private void priority_1545771495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1545771495L))
            info.setReturnValue(902888858);
    }

    @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_1545783988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1545783988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1401945788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1401945788L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_372049274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(372049274L))
            info.setReturnValue("o\u8028(\u5C857]\uD0E7C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1545771991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1545771991L))
            info.setReturnValue(724365368);
    }

    @Inject(at = @At("HEAD"), method = "task()Ljava/lang/Runnable;", cancellable = true)
    private void task__1454942018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1454942018L))
            info.setReturnValue(null);
    }


}
