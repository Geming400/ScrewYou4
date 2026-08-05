package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.NormalNoise.class)
public class NormalNoise_1870895291Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(DDD)D", cancellable = true)
    private void getValue_800471119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(800471119L))
            info.setReturnValue(7.752716009860789E8D);
    }

    @Inject(at = @At("HEAD"), method = "parameters()Lnet/minecraft/world/level/levelgen/synth/NormalNoise$NoiseParameters;", cancellable = true)
    private void parameters__1003772593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1003772593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/synth/NormalNoise$NoiseParameters;)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;", cancellable = true)
    private static void create_1705570737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705570737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/RandomSource;I[D)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;", cancellable = true)
    private static void create__1951084155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1951084155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()D", cancellable = true)
    private void maxValue_1909152731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909152731L))
            info.setReturnValue(7.752716007558289E8D);
    }

    @Inject(at = @At("HEAD"), method = "parityConfigString(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void parityConfigString__1356289522(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1356289522L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLegacyNetherBiome(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/synth/NormalNoise$NoiseParameters;)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;", cancellable = true)
    private static void createLegacyNetherBiome_1705570737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705570737L))
            info.setReturnValue(null);
    }


}
