package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.FpsStat.class)
public class FpsStat_2005535265Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1096908996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096908996L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1519008507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519008507L))
            info.setReturnValue("2T0e|%#@.!xNpxm\u52D6/ \uB413c!BKmBj\uD060|\u535AyVQmwra,P-^N>D*LH^;[\u563B\u50D4$VR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1732079941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732079941L))
            info.setReturnValue(-537794034);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;Ljava/lang/String;)Lnet/minecraft/util/profiling/jfr/stats/FpsStat;", cancellable = true)
    private static void from_1437249389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437249389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fps()I", cancellable = true)
    private void fps__964625219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964625219L))
            info.setReturnValue(-2116371790);
    }


}
