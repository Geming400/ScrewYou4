package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.ImprovedNoise.class)
public class ImprovedNoise_2019749968Mixin {
        @Inject(at = @At("HEAD"), method = "noise(DDD)D", cancellable = true)
    private void noise_1488190718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1488190718L))
            info.setReturnValue(8.493109008385412E8D);
    }

    @Inject(at = @At("HEAD"), method = "noise(DDDDD)D", cancellable = true)
    private void noise__1256902658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1256902658L))
            info.setReturnValue(8.493109000686752E8D);
    }

    @Inject(at = @At("HEAD"), method = "parityConfigString(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void parityConfigString__2038118237(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2038118237L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "noiseWithDerivative(DDD[D)D", cancellable = true)
    private void noiseWithDerivative__567322732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567322732L))
            info.setReturnValue(8.49310900487261E8D);
    }


}
