package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.parse.JfrStatsParser.MutableCountAndSize.class)
public class MutableCountAndSize_1824910073Mixin {
        @Inject(at = @At("HEAD"), method = "increment(I)V", cancellable = true)
    private void increment_583454291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(583454291L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toCountAndSize()Lnet/minecraft/util/profiling/jfr/stats/IoSummary$CountAndSize;", cancellable = true)
    private void toCountAndSize_1734841952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1734841952L))
            info.setReturnValue(null);
    }


}
