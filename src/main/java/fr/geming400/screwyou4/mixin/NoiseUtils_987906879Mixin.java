package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.NoiseUtils.class)
public class NoiseUtils_987906879Mixin {
        @Inject(at = @At("HEAD"), method = "biasTowardsExtreme(DD)D", cancellable = true)
    private static void biasTowardsExtreme__155753001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155753001L))
            info.setReturnValue(5.1403060087890834E8D);
    }

    @Inject(at = @At("HEAD"), method = "parityNoiseOctaveConfigString(Ljava/lang/StringBuilder;DDD[I)V", cancellable = true)
    private static void parityNoiseOctaveConfigString__992438614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-992438614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "parityNoiseOctaveConfigString(Ljava/lang/StringBuilder;DDD[B)V", cancellable = true)
    private static void parityNoiseOctaveConfigString__998903261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-998903261L))
            info.cancel();
    }


}
