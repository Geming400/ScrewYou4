package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.biome.OverworldBiomes.class)
public class OverworldBiomes1868673539Mixin {
        @Inject(at = @At("HEAD"), method = "swamp(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void swamp_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "savanna(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;ZZ)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void savanna__949931446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949931446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jungle(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void jungle_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "taiga(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void taiga__188028780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188028780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "desert(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void desert_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plains(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;ZZZ)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void plains_1200889684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200889684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "darkForest(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void darkForest__188028780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188028780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseOcean()Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private static void baseOcean__995452001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-995452001L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome$BiomeBuilder());
    }

    @Inject(at = @At("HEAD"), method = "lushCaves(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void lushCaves_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseBiome(FF)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private static void baseBiome_881747167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881747167L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome$BiomeBuilder());
    }

    @Inject(at = @At("HEAD"), method = "theVoid(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void theVoid_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deepDark(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void deepDark_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "coldOcean(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void coldOcean__188028780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188028780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseJungle(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;FZZZ)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private static void baseJungle_1354377611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1354377611L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome$BiomeBuilder());
    }

    @Inject(at = @At("HEAD"), method = "warmOcean(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void warmOcean_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stonyPeaks(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void stonyPeaks_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "badlands(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void badlands__188028780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188028780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forest(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;ZZZ)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void forest_1200889684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200889684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grove(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void grove_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "river(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void river__188028780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188028780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ocean(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void ocean__188028780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188028780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "beach(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;ZZ)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void beach__949931446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949931446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculateSkyColor(F)I", cancellable = true)
    private static void calculateSkyColor__1215159593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1215159593L))
            info.setReturnValue(744953168);
    }

    @Inject(at = @At("HEAD"), method = "frozenOcean(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void frozenOcean__188028780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188028780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "globalOverworldGeneration(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void globalOverworldGeneration__1367745026(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1367745026L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mangroveSwamp(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void mangroveSwamp_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "oldGrowthTaiga(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void oldGrowthTaiga__188028780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188028780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sparseJungle(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void sparseJungle_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "meadowOrCherryGrove(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void meadowOrCherryGrove__188028780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188028780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mushroomFields(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void mushroomFields_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dripstoneCaves(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void dripstoneCaves_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lukeWarmOcean(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void lukeWarmOcean__188028780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188028780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "snowySlopes(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void snowySlopes_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "windsweptHills(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void windsweptHills__188028780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188028780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bambooJungle(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void bambooJungle_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jaggedPeaks(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void jaggedPeaks_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sulfurCaves(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void sulfurCaves_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "frozenPeaks(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void frozenPeaks_529285386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529285386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseOceanGeneration(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;", cancellable = true)
    private static void baseOceanGeneration_1335705336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335705336L))
            info.setReturnValue(null);
    }


}
