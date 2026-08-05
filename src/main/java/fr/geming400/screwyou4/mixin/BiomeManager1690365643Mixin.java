package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.BiomeManager.class)
public class BiomeManager1690365643Mixin {
        @Inject(at = @At("HEAD"), method = "getNoiseBiomeAtPosition(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiomeAtPosition_1017621403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1017621403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiomeAtPosition(DDD)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiomeAtPosition_832461371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(832461371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiomeAtQuart(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiomeAtQuart__1202573600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1202573600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBiome(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getBiome_1017621403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1017621403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withDifferentSource(Lnet/minecraft/world/level/biome/BiomeManager$NoiseBiomeSource;)Lnet/minecraft/world/level/biome/BiomeManager;", cancellable = true)
    private void withDifferentSource_1345258135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345258135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "obfuscateSeed(J)J", cancellable = true)
    private static void obfuscateSeed__1389772444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1389772444L))
            info.setReturnValue(8533536583466597785L);
    }


}
