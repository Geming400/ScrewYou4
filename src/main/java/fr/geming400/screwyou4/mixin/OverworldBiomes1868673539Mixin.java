package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.biome.OverworldBiomes.class)
public class OverworldBiomes1868673539Mixin {
        @Inject(at = @At("HEAD"), method = "desert(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void desert_588239637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(588239637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jungle(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void jungle_816133997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816133997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "savanna(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;ZZ)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void savanna_1953687234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1953687234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "taiga(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void taiga__978751606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978751606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "swamp(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void swamp_2061962282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2061962282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plains(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;ZZZ)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void plains__1347296963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1347296963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "coldOcean(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void coldOcean_833952654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(833952654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "darkForest(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void darkForest__2104035705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104035705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lushCaves(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void lushCaves__1747410302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747410302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseJungle(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;FZZZ)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private static void baseJungle__500432903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-500432903L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome.BiomeBuilder());
    }

    @Inject(at = @At("HEAD"), method = "warmOcean(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void warmOcean__1382082511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382082511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deepDark(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void deepDark_131494344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(131494344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseBiome(FF)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private static void baseBiome__220225426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-220225426L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome.BiomeBuilder());
    }

    @Inject(at = @At("HEAD"), method = "stonyPeaks(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void stonyPeaks__186368401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-186368401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "theVoid(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void theVoid_1962306437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1962306437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseOcean()Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private static void baseOcean_1371737420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1371737420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forest(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;ZZZ)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void forest_170067313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(170067313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "badlands(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void badlands_112881239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112881239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grove(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void grove_1931507031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931507031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "river(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void river__295121504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-295121504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "beach(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;ZZ)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void beach_1641996935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1641996935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ocean(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void ocean__48061166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-48061166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculateSkyColor(F)I", cancellable = true)
    private static void calculateSkyColor_72875295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(72875295L))
            info.setReturnValue(-509510029);
    }

    @Inject(at = @At("HEAD"), method = "frozenOcean(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void frozenOcean_1520899666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1520899666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dripstoneCaves(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void dripstoneCaves_2041317300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041317300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "frozenPeaks(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void frozenPeaks__527259434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527259434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sulfurCaves(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void sulfurCaves__1389858019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1389858019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mangroveSwamp(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void mangroveSwamp__1906939517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1906939517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "snowySlopes(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void snowySlopes__1742047572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742047572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "oldGrowthTaiga(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void oldGrowthTaiga__221372964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221372964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "windsweptHills(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void windsweptHills__1021634839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1021634839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sparseJungle(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void sparseJungle__446881491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-446881491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bambooJungle(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void bambooJungle__457858087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-457858087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "meadowOrCherryGrove(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void meadowOrCherryGrove_1252261384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252261384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jaggedPeaks(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void jaggedPeaks__1352118292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1352118292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lukeWarmOcean(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Z)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void lukeWarmOcean__1816703446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1816703446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mushroomFields(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private static void mushroomFields__642896007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-642896007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "globalOverworldGeneration(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void globalOverworldGeneration_861516305(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(861516305L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "baseOceanGeneration(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;", cancellable = true)
    private static void baseOceanGeneration__523948621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-523948621L))
            info.setReturnValue(null);
    }


}
