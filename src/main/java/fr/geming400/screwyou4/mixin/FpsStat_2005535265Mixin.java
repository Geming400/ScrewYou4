package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.FpsStat.class)
public class FpsStat_2005535265Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__903919773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-903919773L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_870075289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870075289L))
            info.setReturnValue("(z\u51B7YA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2043798006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2043798006L))
            info.setReturnValue(-1993763243);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;Ljava/lang/String;)Lnet/minecraft/util/profiling/jfr/stats/FpsStat;", cancellable = true)
    private static void from__2089420989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089420989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fps()I", cancellable = true)
    private void fps_2043797510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2043797510L))
            info.setReturnValue(-2110726909);
    }


}
