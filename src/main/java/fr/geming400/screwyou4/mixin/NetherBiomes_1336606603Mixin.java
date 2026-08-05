package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.biome.NetherBiomes.class)
public class NetherBiomes_1336606603Mixin {
        @Inject(at = @At("HEAD"), method = "baseBiome()Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private static void baseBiome__1527518938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1527518938L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome.BiomeBuilder());
    }

    @Inject(at = @At("HEAD"), method = "soulSandValley(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void soulSandValley__2781551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2781551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "netherWastes(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void netherWastes__2781551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2781551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "warpedForest(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void warpedForest__2781551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2781551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "basaltDeltas(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void basaltDeltas__2781551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2781551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "crimsonForest(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void crimsonForest__2781551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2781551L))
            info.setReturnValue(null);
    }


}
