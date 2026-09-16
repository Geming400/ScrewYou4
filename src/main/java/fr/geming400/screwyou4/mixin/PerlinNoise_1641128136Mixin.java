package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.PerlinNoise.class)
public class PerlinNoise_1641128136Mixin {
        @Inject(at = @At("HEAD"), method = "wrap(D)D", cancellable = true)
    private static void wrap__1081163618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1081163618L))
            info.setReturnValue(4.672981005941663E8D);
    }

    @Inject(at = @At("HEAD"), method = "getValue(DDDDD)D", cancellable = true)
    private void getValue__762553385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762553385L))
            info.setReturnValue(4.67298100652075E8D);
    }

    @Inject(at = @At("HEAD"), method = "getValue(DDD)D", cancellable = true)
    private void getValue__1356559081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1356559081L))
            info.setReturnValue(4.6729810079378337E8D);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/RandomSource;ILit/unimi/dsi/fastutil/doubles/DoubleList;)Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;", cancellable = true)
    private static void create_82877318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(82877318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/RandomSource;Ljava/util/stream/IntStream;)Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;", cancellable = true)
    private static void create__2078094442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2078094442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/RandomSource;Ljava/util/List;)Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;", cancellable = true)
    private static void create_1473778292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1473778292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/RandomSource;ID[D)Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;", cancellable = true)
    private static void create__1648647967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1648647967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parityConfigString(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void parityConfigString_1878227227(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1878227227L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "maxBrokenValue(D)D", cancellable = true)
    private void maxBrokenValue__626933900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-626933900L))
            info.setReturnValue(4.6729810039599824E8D);
    }

    @Inject(at = @At("HEAD"), method = "getOctaveNoise(I)Lnet/minecraft/world/level/levelgen/synth/ImprovedNoise;", cancellable = true)
    private void getOctaveNoise__1351905964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1351905964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLegacyForLegacyNetherBiome(Lnet/minecraft/util/RandomSource;ILit/unimi/dsi/fastutil/doubles/DoubleList;)Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;", cancellable = true)
    private static void createLegacyForLegacyNetherBiome_156949669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(156949669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLegacyForBlendedNoise(Lnet/minecraft/util/RandomSource;Ljava/util/stream/IntStream;)Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;", cancellable = true)
    private static void createLegacyForBlendedNoise_1307316036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1307316036L))
            info.setReturnValue(null);
    }


}
