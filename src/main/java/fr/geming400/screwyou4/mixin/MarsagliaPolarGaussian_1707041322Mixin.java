package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.MarsagliaPolarGaussian.class)
public class MarsagliaPolarGaussian_1707041322Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_1745316060(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1745316060L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextGaussian()D", cancellable = true)
    private void nextGaussian_1745298762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745298762L))
            info.setReturnValue(1.7419940003560528E8D);
    }


}
