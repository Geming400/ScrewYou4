package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.info.DatapackStructureReport.class)
public class DatapackStructureReport391858198Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1496988704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1496988704L))
            info.setReturnValue("s\u1A77Z\u44CCM^\u0C2AaUs82@{^n)\u0E88");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_491583941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(491583941L))
            info.setReturnValue(null);
    }


}
