package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.TracingExecutor.class)
public class TracingExecutor655977687Mixin {
        @Inject(at = @At("HEAD"), method = "forName(Ljava/lang/String;)Ljava/util/concurrent/Executor;", cancellable = true)
    private void forName_1215991398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1215991398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__252648581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-252648581L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1426401212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426401212L))
            info.setReturnValue("\u5DFBd\uC635wiX,,&mv\uC998(\u28872X\uC1E5-#q]EHBS\u229D%#w+\uFC3Fr0\u19C9o+r]?X1B$B^Xz\u9578qcul<guk");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1213329778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213329778L))
            info.setReturnValue(-1607231912);
    }

    @Inject(at = @At("HEAD"), method = "execute(Ljava/lang/Runnable;)V", cancellable = true)
    private void execute_119238707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(119238707L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "service()Ljava/util/concurrent/ExecutorService;", cancellable = true)
    private void service_1509794064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1509794064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shutdownAndAwait(JLjava/util/concurrent/TimeUnit;)V", cancellable = true)
    private void shutdownAndAwait_2040486505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2040486505L))
            info.cancel();
    }


}
