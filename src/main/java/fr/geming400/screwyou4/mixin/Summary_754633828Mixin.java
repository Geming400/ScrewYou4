package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.ThreadAllocationStat.Summary.class)
public class Summary_754633828Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2140146086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140146086L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__380826148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-380826148L))
            info.setReturnValue("'9K<שּׁ3弅樖Qce094'==b}涟av穊x.6달ෙq_GDx普h㖘rP﹄JBE@v*=|/*'3=v汱-s`SyL.Yk6tZL&莙cQg)MRa?cC礸a^9t?虜-%sO");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_792896569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792896569L))
            info.setReturnValue(-1732932735);
    }

    @Inject(at = @At("HEAD"), method = "allocationsPerSecondByThread()Ljava/util/Map;", cancellable = true)
    private void allocationsPerSecondByThread__1249989813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249989813L))
            info.setReturnValue(null);
    }


}
