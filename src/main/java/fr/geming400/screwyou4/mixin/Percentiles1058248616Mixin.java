package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.Percentiles.class)
public class Percentiles1058248616Mixin {
        @Inject(at = @At("HEAD"), method = "evaluate([D)Ljava/util/Map;", cancellable = true)
    private static void evaluate__1800947567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1800947567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "evaluate([I)Ljava/util/Map;", cancellable = true)
    private static void evaluate__1728339626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1728339626L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "evaluate([J)Ljava/util/Map;", cancellable = true)
    private static void evaluate_1722155799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1722155799L))
            info.setReturnValue(null);
    }


}
