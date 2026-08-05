package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.Percentiles.class)
public class Percentiles1058248616Mixin {
        @Inject(at = @At("HEAD"), method = "evaluate([D)Ljava/util/Map;", cancellable = true)
    private static void evaluate__120384104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-120384104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "evaluate([I)Ljava/util/Map;", cancellable = true)
    private static void evaluate__47776163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-47776163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "evaluate([J)Ljava/util/Map;", cancellable = true)
    private static void evaluate__892248034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-892248034L))
            info.setReturnValue(null);
    }


}
