package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.NormalNoise.class)
public class NormalNoise_1870895291Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(DDD)D", cancellable = true)
    private void getValue__1126791926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126791926L))
            info.setReturnValue(1.1491470007382566E8D);
    }

    @Inject(at = @At("HEAD"), method = "parameters()Lnet/minecraft/world/level/levelgen/synth/NormalNoise$NoiseParameters;", cancellable = true)
    private void parameters_842087097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(842087097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/synth/NormalNoise$NoiseParameters;)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;", cancellable = true)
    private static void create_1179656245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179656245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/RandomSource;I[D)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;", cancellable = true)
    private static void create__508972671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508972671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()D", cancellable = true)
    private void maxValue__1606148722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1606148722L))
            info.setReturnValue(1.1491470026992509E8D);
    }

    @Inject(at = @At("HEAD"), method = "parityConfigString(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void parityConfigString_2107994382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2107994382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLegacyNetherBiome(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/synth/NormalNoise$NoiseParameters;)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;", cancellable = true)
    private static void createLegacyNetherBiome_832930830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(832930830L))
            info.setReturnValue(null);
    }


}
