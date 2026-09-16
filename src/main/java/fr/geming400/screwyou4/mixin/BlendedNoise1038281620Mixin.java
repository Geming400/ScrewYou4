package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.BlendedNoise.class)
public class BlendedNoise1038281620Mixin {
        @Inject(at = @At("HEAD"), method = "compute(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)D", cancellable = true)
    private void compute_1970071233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1970071233L))
            info.setReturnValue(4.126209002204712E8D);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()D", cancellable = true)
    private void maxValue_1856204904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1856204904L))
            info.setReturnValue(4.126209006030763E8D);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lnet/minecraft/util/KeyDispatchDataCodec;", cancellable = true)
    private void codec__925983210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-925983210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minValue()D", cancellable = true)
    private void minValue__616456234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-616456234L))
            info.setReturnValue(4.126209006667734E8D);
    }

    @Inject(at = @At("HEAD"), method = "parityConfigString(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void parityConfigString_1275380712(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1275380712L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createUnseeded(DDDDD)Lnet/minecraft/world/level/levelgen/synth/BlendedNoise;", cancellable = true)
    private static void createUnseeded_1537088709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1537088709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withNewRandom(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/levelgen/synth/BlendedNoise;", cancellable = true)
    private void withNewRandom__960568943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-960568943L))
            info.setReturnValue(null);
    }


}
