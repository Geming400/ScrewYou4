package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.BiomeDefaultFeatures.class)
public class BiomeDefaultFeatures1013201580Mixin {
        @Inject(at = @At("HEAD"), method = "addDefaultOres(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;Z)V", cancellable = true)
    private static void addDefaultOres__1147555168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1147555168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultOres(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultOres__581910984(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-581910984L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addNearWaterVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addNearWaterVegetation_838524803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(838524803L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addAncientDebris(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addAncientDebris_1695923289(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1695923289L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBadlandsTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBadlandsTrees_877775384(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(877775384L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addWarmFlowers(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addWarmFlowers_201738489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(201738489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addExtraEmeralds(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addExtraEmeralds_1018731525(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1018731525L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTaigaGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addTaigaGrass_590333768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(590333768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addJungleVines(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addJungleVines_2108299858(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2108299858L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDesertExtraVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDesertExtraVegetation__1586390289(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1586390289L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSwampExtraVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSwampExtraVegetation__360186394(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-360186394L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBambooVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBambooVegetation_1648250442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1648250442L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addWaterTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addWaterTrees__839424858(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-839424858L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBirchTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBirchTrees_163558765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(163558765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultSoftDisks(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultSoftDisks_512216979(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(512216979L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSulfurCavesFeatures(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSulfurCavesFeatures__59045904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-59045904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLushCavesSpecialOres(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addLushCavesSpecialOres__1146140630(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1146140630L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTaigaTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addTaigaTrees__1088312601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1088312601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addExtraGold(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addExtraGold__288846762(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-288846762L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMossyStoneBlock(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMossyStoneBlock__1878381307(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1878381307L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addRareBerryBushes(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addRareBerryBushes_1365025360(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1365025360L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLightBambooVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addLightBambooVegetation_713590686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(713590686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSavannaTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSavannaTrees__944301483(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-944301483L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "commonSpawnWithZombieHorse(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void commonSpawnWithZombieHorse__1447455835(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1447455835L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addShatteredSavannaGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addShatteredSavannaGrass_687473964(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(687473964L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addForestFlowers(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addForestFlowers_1516321441(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1516321441L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addForestGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addForestGrass__2098082593(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2098082593L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDesertVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDesertVegetation_1645558123(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1645558123L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultFlowers(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultFlowers_1968364447(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1968364447L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultGrass__1489791651(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1489791651L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultCarversAndLakes(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultCarversAndLakes__240942152(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-240942152L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addGroveTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addGroveTrees__1644524118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1644524118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMushroomFieldVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMushroomFieldVegetation_714911670(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(714911670L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSavannaExtraGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSavannaExtraGrass__2133441932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2133441932L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlainGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addPlainGrass__1897683340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1897683340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "commonSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;I)V", cancellable = true)
    private static void commonSpawns__54998236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-54998236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "commonSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void commonSpawns__546160765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-546160765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultMonsterRoom(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultMonsterRoom__667703236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-667703236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSwampClayDisk(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSwampClayDisk_119038564(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(119038564L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMangroveSwampDisks(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMangroveSwampDisks_487615735(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(487615735L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSnowyTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSnowyTrees_324916487(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(324916487L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addJungleGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addJungleGrass_1760134207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1760134207L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBadlandGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBadlandGrass_1188437198(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1188437198L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addGiantTaigaVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addGiantTaigaVegetation_752096135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(752096135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addShatteredSavannaTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addShatteredSavannaTrees__991172405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-991172405L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMeadowVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMeadowVegetation_849860665(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(849860665L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDripstone(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDripstone__194650346(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-194650346L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addCommonBerryBushes(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addCommonBerryBushes__470832025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-470832025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBirchForestFlowers(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBirchForestFlowers_172362227(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(172362227L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMountainForestTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMountainForestTrees__1433879951(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1433879951L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSparseJungleTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSparseJungleTrees_1838284382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1838284382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSwampVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSwampVegetation__884172780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-884172780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMangroveSwampVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMangroveSwampVegetation_1525030171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1525030171L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addCherryGroveVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addCherryGroveVegetation__695224210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-695224210L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultMushrooms(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultMushrooms_1264061186(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1264061186L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultExtraVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;Z)V", cancellable = true)
    private static void addDefaultExtraVegetation_1303755667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1303755667L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLeafLitterPatch(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addLeafLitterPatch_995655302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(995655302L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBadlandExtraVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBadlandExtraVegetation__1371604714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1371604714L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addJungleTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addJungleTrees_81487838(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(81487838L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addJungleMelons(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addJungleMelons__1338181979(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1338181979L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlainVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addPlainVegetation_265678078(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(265678078L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSparseJungleMelons(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSparseJungleMelons_1582903333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1582903333L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "farmAnimals(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void farmAnimals_609398021(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(609398021L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addInfestedStone(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addInfestedStone__12318489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-12318489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMountainTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMountainTrees__1797672882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1797672882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTallBirchTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addTallBirchTrees_258409402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(258409402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSavannaGrass(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSavannaGrass_734344886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(734344886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addOtherBirchTrees(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addOtherBirchTrees_426230715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(426230715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mooshroomSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void mooshroomSpawns__1219236175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1219236175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLukeWarmKelp(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addLukeWarmKelp__1563859218(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1563859218L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "warmOceanSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;II)V", cancellable = true)
    private static void warmOceanSpawns__1750380459(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1750380459L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "snowySpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;Z)V", cancellable = true)
    private static void snowySpawns__1154901024(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1154901024L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addNetherDefaultOres(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addNetherDefaultOres_742722944(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(742722944L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addFrozenSprings(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addFrozenSprings_564651276(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(564651276L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "oceanSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;III)V", cancellable = true)
    private static void oceanSpawns_504139543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(504139543L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "plainsSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void plainsSpawns_192153669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(192153669L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultSprings(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultSprings_389953453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(389953453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "desertSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void desertSpawns__1586638951(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1586638951L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dripstoneCavesSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void dripstoneCavesSpawns__415609032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-415609032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDesertExtraDecoration(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDesertExtraDecoration_640794897(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(640794897L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addIcebergs(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addIcebergs__534899784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-534899784L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "baseJungleSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void baseJungleSpawns_688478304(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(688478304L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSurfaceFreezing(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSurfaceFreezing__658198233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-658198233L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addFossilDecoration(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addFossilDecoration_571648324(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(571648324L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "swampSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;I)V", cancellable = true)
    private static void swampSpawns__1307062695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1307062695L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "monsters(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;IIIIZ)V", cancellable = true)
    private static void monsters_1955595563(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1955595563L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLushCavesVegetationFeatures(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addLushCavesVegetationFeatures_24763609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(24763609L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultCrystalFormations(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultCrystalFormations_1672535007(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1672535007L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMangroveSwampExtraVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addMangroveSwampExtraVegetation_856393023(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(856393023L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addColdOceanExtraVegetation(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addColdOceanExtraVegetation_275587596(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(275587596L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDefaultUndergroundVariety(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addDefaultUndergroundVariety__941145264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-941145264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "caveSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void caveSpawns__1066224863(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1066224863L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addFerns(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addFerns_1391300062(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1391300062L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSculk(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addSculk__183207766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-183207766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBlueIce(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBlueIce_250110615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(250110615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endSpawns(Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;)V", cancellable = true)
    private static void endSpawns_2110076563(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2110076563L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBushes(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", cancellable = true)
    private static void addBushes_560680446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(560680446L))
            info.cancel();
    }


}
