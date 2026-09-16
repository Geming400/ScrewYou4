package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.biome.EndBiomes.class)
public class EndBiomes_2086991456Mixin {
        @Inject(at = @At("HEAD"), method = "smallEndIslands(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void smallEndIslands__1770943076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1770943076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endHighlands(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void endHighlands_1562967643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1562967643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endMidlands(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void endMidlands__389773141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-389773141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseEndBiome(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void baseEndBiome_124939948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(124939948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "theEnd(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void theEnd_627307260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627307260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endBarrens(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void endBarrens_367129334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(367129334L))
            info.setReturnValue(null);
    }


}
