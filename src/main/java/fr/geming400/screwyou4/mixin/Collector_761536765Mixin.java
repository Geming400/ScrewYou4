package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.Collector.class)
public class Collector_761536765Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_799815347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(799815347L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEach__976614126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-976614126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "report(Lnet/minecraft/util/ProblemReporter$Problem;)V", cancellable = true)
    private void report__1100718916(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1100718916L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTreeReport()Ljava/lang/String;", cancellable = true)
    private void getTreeReport__373923707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-373923707L))
            info.setReturnValue("R OP \uC915FGfJ");
    }

    @Inject(at = @At("HEAD"), method = "getReport()Ljava/lang/String;", cancellable = true)
    private void getReport__373923707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-373923707L))
            info.setReturnValue("R OP \uC915FGfJ");
    }

    @Inject(at = @At("HEAD"), method = "forChild(Lnet/minecraft/util/ProblemReporter$PathElement;)Lnet/minecraft/util/ProblemReporter;", cancellable = true)
    private void forChild_63187854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63187854L))
            info.setReturnValue(null);
    }


}
