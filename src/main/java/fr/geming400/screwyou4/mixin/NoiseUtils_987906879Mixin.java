package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.NoiseUtils.class)
public class NoiseUtils_987906879Mixin {
        @Inject(at = @At("HEAD"), method = "parityNoiseOctaveConfigString(Ljava/lang/StringBuilder;DDD[I)V", cancellable = true)
    private static void parityNoiseOctaveConfigString_509449050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(509449050L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "parityNoiseOctaveConfigString(Ljava/lang/StringBuilder;DDD[B)V", cancellable = true)
    private static void parityNoiseOctaveConfigString_502984403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(502984403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "biasTowardsExtreme(DD)D", cancellable = true)
    private static void biasTowardsExtreme_2084161902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2084161902L))
            info.setReturnValue(6.180920097285163E7D);
    }


}
