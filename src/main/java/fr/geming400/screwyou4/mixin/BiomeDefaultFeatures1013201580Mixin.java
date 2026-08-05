package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.BiomeDefaultFeatures.class)
public class BiomeDefaultFeatures1013201580Mixin {
        @Inject(at = @At("HEAD"), method = "endSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void endSpawns__972247546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-972247546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "caveSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void caveSpawns__972247546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-972247546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addFerns(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addFerns_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBlueIce(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBlueIce_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBushes(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBushes_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSculk(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSculk_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBadlandExtraVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBadlandExtraVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSparseJungleMelons(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSparseJungleMelons_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addJungleVines(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addJungleVines_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDesertExtraVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDesertExtraVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSwampExtraVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSwampExtraVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDesertVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDesertVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDripstone(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDripstone_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDesertExtraDecoration(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDesertExtraDecoration_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addJungleMelons(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addJungleMelons_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addFossilDecoration(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addFossilDecoration_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLukeWarmKelp(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addLukeWarmKelp_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBirchForestFlowers(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBirchForestFlowers_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMangroveSwampDisks(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMangroveSwampDisks_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMountainTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMountainTrees_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlainVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addPlainVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMangroveSwampVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMangroveSwampVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultFlowers(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultFlowers_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addWaterTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addWaterTrees_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addExtraGold(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addExtraGold_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addCommonBerryBushes(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addCommonBerryBushes_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBirchTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBirchTrees_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMossyStoneBlock(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMossyStoneBlock_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addInfestedStone(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addInfestedStone_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addRareBerryBushes(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addRareBerryBushes_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultMonsterRoom(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultMonsterRoom_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTallBirchTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addTallBirchTrees_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addShatteredSavannaTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addShatteredSavannaTrees_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addJungleTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addJungleTrees_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSnowyTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSnowyTrees_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addJungleGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addJungleGrass_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultSoftDisks(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultSoftDisks_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSavannaGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSavannaGrass_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLightBambooVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addLightBambooVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addGroveTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addGroveTrees_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addOtherBirchTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addOtherBirchTrees_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addShatteredSavannaGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addShatteredSavannaGrass_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSavannaExtraGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSavannaExtraGrass_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBadlandGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBadlandGrass_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addForestGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addForestGrass_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMushroomFieldVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMushroomFieldVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addForestFlowers(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addForestFlowers_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addCherryGroveVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addCherryGroveVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBambooVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBambooVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSavannaTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSavannaTrees_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSparseJungleTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSparseJungleTrees_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSwampVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSwampVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addGiantTaigaVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addGiantTaigaVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMeadowVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMeadowVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLushCavesSpecialOres(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addLushCavesSpecialOres_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addExtraEmeralds(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addExtraEmeralds_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMountainForestTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMountainForestTrees_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultGrass_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTaigaGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addTaigaGrass_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSulfurCavesFeatures(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSulfurCavesFeatures_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultCarversAndLakes(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultCarversAndLakes_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTaigaTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addTaigaTrees_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBadlandsTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBadlandsTrees_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addWarmFlowers(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addWarmFlowers_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlainGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addPlainGrass_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultMushrooms(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultMushrooms_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSwampClayDisk(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSwampClayDisk_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultExtraVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;Z)V", cancellable = true)
    private static void addDefaultExtraVegetation__488433647(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-488433647L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLeafLitterPatch(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addLeafLitterPatch_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mooshroomSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void mooshroomSpawns__972247546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-972247546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addFrozenSprings(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addFrozenSprings_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "oceanSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;III)V", cancellable = true)
    private static void oceanSpawns__76007007(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-76007007L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "plainsSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void plainsSpawns__972247546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-972247546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSurfaceFreezing(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSurfaceFreezing_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "desertSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void desertSpawns__972247546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-972247546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "swampSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;I)V", cancellable = true)
    private static void swampSpawns__378786559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-378786559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addNetherDefaultOres(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addNetherDefaultOres_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultSprings(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultSprings_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dripstoneCavesSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void dripstoneCavesSpawns__972247546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-972247546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "baseJungleSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void baseJungleSpawns__972247546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-972247546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "snowySpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;Z)V", cancellable = true)
    private static void snowySpawns__363086702(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-363086702L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "warmOceanSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;II)V", cancellable = true)
    private static void warmOceanSpawns_838634854(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(838634854L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addIcebergs(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addIcebergs_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLushCavesVegetationFeatures(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addLushCavesVegetationFeatures_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addColdOceanExtraVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addColdOceanExtraVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultUndergroundVariety(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultUndergroundVariety_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMangroveSwampExtraVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMangroveSwampExtraVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultCrystalFormations(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultCrystalFormations_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "monsters(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;IIIIZ)V", cancellable = true)
    private static void monsters__1146933806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1146933806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultOres(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultOres_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultOres(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;Z)V", cancellable = true)
    private static void addDefaultOres__488433647(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-488433647L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addAncientDebris(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addAncientDebris_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "commonSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;I)V", cancellable = true)
    private static void commonSpawns__378786559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-378786559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "commonSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void commonSpawns__972247546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-972247546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "farmAnimals(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void farmAnimals__972247546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-972247546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "commonSpawnWithZombieHorse(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void commonSpawnWithZombieHorse__972247546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-972247546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addNearWaterVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addNearWaterVegetation_2071750311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071750311L))
            info.cancel();
    }


}
