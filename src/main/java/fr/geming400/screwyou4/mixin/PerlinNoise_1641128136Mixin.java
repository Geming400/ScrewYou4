package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.PerlinNoise.class)
public class PerlinNoise_1641128136Mixin {
        @Inject(at = @At("HEAD"), method = "wrap(D)D", cancellable = true)
    private static void wrap__1444556844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1444556844L))
            info.setReturnValue(4.6334280051496595E8D);
    }

    @Inject(at = @At("HEAD"), method = "getValue(DDDDD)D", cancellable = true)
    private void getValue_206328284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(206328284L))
            info.setReturnValue(4.6334280037354904E8D);
    }

    @Inject(at = @At("HEAD"), method = "getValue(DDD)D", cancellable = true)
    private void getValue_570703964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(570703964L))
            info.setReturnValue(4.6334280053641367E8D);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/RandomSource;ILit/unimi/dsi/fastutil/doubles/DoubleList;)Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;", cancellable = true)
    private static void create__1076074614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076074614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/RandomSource;Ljava/util/stream/IntStream;)Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;", cancellable = true)
    private static void create__566167534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-566167534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/RandomSource;Ljava/util/List;)Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;", cancellable = true)
    private static void create__665315088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-665315088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/RandomSource;ID[D)Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;", cancellable = true)
    private static void create_890536285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(890536285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parityConfigString(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void parityConfigString__1586056677(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1586056677L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLegacyForLegacyNetherBiome(Lnet/minecraft/util/RandomSource;ILit/unimi/dsi/fastutil/doubles/DoubleList;)Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;", cancellable = true)
    private static void createLegacyForLegacyNetherBiome__1076074614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076074614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLegacyForBlendedNoise(Lnet/minecraft/util/RandomSource;Ljava/util/stream/IntStream;)Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;", cancellable = true)
    private static void createLegacyForBlendedNoise__566167534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-566167534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxBrokenValue(D)D", cancellable = true)
    private void maxBrokenValue__1444557092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1444557092L))
            info.setReturnValue(4.633428004913165E8D);
    }

    @Inject(at = @At("HEAD"), method = "getOctaveNoise(I)Lnet/minecraft/world/level/levelgen/synth/ImprovedNoise;", cancellable = true)
    private void getOctaveNoise_1701603048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701603048L))
            info.setReturnValue(null);
    }


}
