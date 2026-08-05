package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.MarsagliaPolarGaussian.class)
public class MarsagliaPolarGaussian_1707041322Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__22395667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-22395667L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextGaussian()D", cancellable = true)
    private void nextGaussian_1579090940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579090940L))
            info.setReturnValue(8.758984008201203E8D);
    }


}
