package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.profiling.ProfilerSamplerAdapter.class)
public class ProfilerSamplerAdapter767278636Mixin {
        @Inject(at = @At("HEAD"), method = "newSamplersFoundInProfiler(Ljava/util/function/Supplier;)Ljava/util/Set;", cancellable = true)
    private void newSamplersFoundInProfiler_582599394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582599394L))
            info.setReturnValue(null);
    }


}
