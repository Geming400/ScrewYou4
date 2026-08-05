package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.BlendedNoise.class)
public class BlendedNoise1038281620Mixin {
        @Inject(at = @At("HEAD"), method = "compute(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)D", cancellable = true)
    private void compute_2006313240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006313240L))
            info.setReturnValue(8.964263006131383E8D);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()D", cancellable = true)
    private void maxValue_1076539061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076539061L))
            info.setReturnValue(8.964263008016542E8D);
    }

    @Inject(at = @At("HEAD"), method = "minValue()D", cancellable = true)
    private void minValue_1076539061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076539061L))
            info.setReturnValue(8.964263008016542E8D);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lnet/minecraft/util/KeyDispatchDataCodec;", cancellable = true)
    private void codec__504003988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-504003988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createUnseeded(DDDDD)Lnet/minecraft/world/level/levelgen/synth/BlendedNoise;", cancellable = true)
    private static void createUnseeded__1257340672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1257340672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withNewRandom(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/levelgen/synth/BlendedNoise;", cancellable = true)
    private void withNewRandom_167548596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(167548596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parityConfigString(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void parityConfigString_2106064104(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2106064104L))
            info.cancel();
    }


}
