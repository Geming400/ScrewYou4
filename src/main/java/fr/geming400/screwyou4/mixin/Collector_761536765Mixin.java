package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.Collector.class)
public class Collector_761536765Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1820653136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820653136L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEach_899774076(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(899774076L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "report(Lnet/minecraft/util/ProblemReporter$Problem;)V", cancellable = true)
    private void report__1305057784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1305057784L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forChild(Lnet/minecraft/util/ProblemReporter$PathElement;)Lnet/minecraft/util/ProblemReporter;", cancellable = true)
    private void forChild_488740961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488740961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTreeReport()Ljava/lang/String;", cancellable = true)
    private void getTreeReport__1250369299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250369299L))
            info.setReturnValue("t[\u35F55c}\u42E0zWq\u7C56\u5E0E\uA294");
    }

    @Inject(at = @At("HEAD"), method = "getReport()Ljava/lang/String;", cancellable = true)
    private void getReport_114490671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114490671L))
            info.setReturnValue("UjD7=S{T{DcM{\u42A7x");
    }


}
