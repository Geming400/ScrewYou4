package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.parse.JfrStatsParser.MutableCountAndSize.class)
public class MutableCountAndSize_1824910073Mixin {
        @Inject(at = @At("HEAD"), method = "increment(I)V", cancellable = true)
    private void increment__1256140252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1256140252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toCountAndSize()Lnet/minecraft/util/profiling/jfr/stats/IoSummary$CountAndSize;", cancellable = true)
    private void toCountAndSize__1226028700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1226028700L))
            info.setReturnValue(null);
    }


}
