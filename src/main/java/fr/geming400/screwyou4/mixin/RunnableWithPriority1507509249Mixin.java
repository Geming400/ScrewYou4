package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.thread.StrictQueue.RunnableWithPriority.class)
public class RunnableWithPriority1507509249Mixin {
        @Inject(at = @At("HEAD"), method = "priority()I", cancellable = true)
    private void priority__1999075645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1999075645L))
            info.setReturnValue(-562059875);
    }

    @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run__2024345847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2024345847L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_598882981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(598882981L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2017034522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017034522L))
            info.setReturnValue("Nul1/(88\u016D{hw\"\uCC70|mW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2064861340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064861340L))
            info.setReturnValue(1905952578);
    }

    @Inject(at = @At("HEAD"), method = "task()Ljava/lang/Runnable;", cancellable = true)
    private void task__1803120829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803120829L))
            info.setReturnValue(null);
    }


}
