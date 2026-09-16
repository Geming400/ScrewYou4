package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.BiomeManager.class)
public class BiomeManager1690365643Mixin {
        @Inject(at = @At("HEAD"), method = "withDifferentSource(Lnet/minecraft/world/level/biome/BiomeManager$NoiseBiomeSource;)Lnet/minecraft/world/level/biome/BiomeManager;", cancellable = true)
    private void withDifferentSource__2053762999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2053762999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "obfuscateSeed(J)J", cancellable = true)
    private static void obfuscateSeed__24805163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-24805163L))
            info.setReturnValue(32863072902331632L);
    }

    @Inject(at = @At("HEAD"), method = "getBiome(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getBiome_690450309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(690450309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiomeAtPosition(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiomeAtPosition__574463789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-574463789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiomeAtPosition(DDD)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiomeAtPosition__1338694285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338694285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiomeAtQuart(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiomeAtQuart__1885780240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1885780240L))
            info.setReturnValue(null);
    }


}
