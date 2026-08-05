package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.TracingExecutor.class)
public class TracingExecutor655977687Mixin {
        @Inject(at = @At("HEAD"), method = "forName(Ljava/lang/String;)Ljava/util/concurrent/Executor;", cancellable = true)
    private void forName_337513690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337513690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2041489946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041489946L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__479482288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-479482288L))
            info.setReturnValue("pq}A$H5lc}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_694240429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(694240429L))
            info.setReturnValue(-1186705930);
    }

    @Inject(at = @At("HEAD"), method = "execute(Ljava/lang/Runnable;)V", cancellable = true)
    private void execute_2112719368(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2112719368L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "service()Ljava/util/concurrent/ExecutorService;", cancellable = true)
    private void service__1265759077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265759077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shutdownAndAwait(JLjava/util/concurrent/TimeUnit;)V", cancellable = true)
    private void shutdownAndAwait_2093154174(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2093154174L))
            info.cancel();
    }


}
