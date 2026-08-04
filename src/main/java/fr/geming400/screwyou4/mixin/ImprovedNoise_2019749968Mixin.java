package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.ImprovedNoise.class)
public class ImprovedNoise_2019749968Mixin {
        @Inject(at = @At("HEAD"), method = "noise(DDDDD)D", cancellable = true)
    private void noise_584950116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(584950116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noise(DDD)D", cancellable = true)
    private void noise_949325796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949325796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noiseWithDerivative(DDD[D)D", cancellable = true)
    private void noiseWithDerivative_1243420589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243420589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parityConfigString(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void parityConfigString__1207434845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1207434845L))
            info.cancel();
    }


}
