package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.biome.EndBiomes.class)
public class EndBiomes_2086991456Mixin {
        @Inject(at = @At("HEAD"), method = "theEnd(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void theEnd_747603302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747603302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endBarrens(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void endBarrens_747603302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747603302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endMidlands(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void endMidlands_747603302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747603302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smallEndIslands(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void smallEndIslands_747603302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747603302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseEndBiome(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void baseEndBiome_279522614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279522614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endHighlands(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void endHighlands_747603302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747603302L))
            info.setReturnValue(null);
    }


}
