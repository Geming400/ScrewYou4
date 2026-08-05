package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.KeyframeTrackSampler.class)
public class KeyframeTrackSampler_741367535Mixin {
        @Inject(at = @At("HEAD"), method = "sample(J)Ljava/lang/Object;", cancellable = true)
    private void sample_1177676517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1177676517L))
            info.setReturnValue(new java.lang.Object());
    }


}
