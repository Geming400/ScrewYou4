package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.biome.NetherBiomes.class)
public class NetherBiomes_1336606603Mixin {
        @Inject(at = @At("HEAD"), method = "soulSandValley(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void soulSandValley_2147467003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2147467003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "netherWastes(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void netherWastes__666285280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-666285280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "warpedForest(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void warpedForest_2052123885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052123885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "crimsonForest(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void crimsonForest__1048653771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1048653771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "basaltDeltas(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void basaltDeltas__570694815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-570694815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseBiome()Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private static void baseBiome__835928971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835928971L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome.BiomeBuilder());
    }


}
