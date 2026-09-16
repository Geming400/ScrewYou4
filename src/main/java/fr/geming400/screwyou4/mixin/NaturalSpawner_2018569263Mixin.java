package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.NaturalSpawner.class)
public class NaturalSpawner_2018569263Mixin {
        @Inject(at = @At("HEAD"), method = "spawnMobsForChunkGeneration(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void spawnMobsForChunkGeneration__1968294477(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1968294477L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnCategoryForPosition(Lnet/minecraft/world/entity/MobCategory;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/NaturalSpawner$SpawnPredicate;Lnet/minecraft/world/level/NaturalSpawner$AfterSpawnCallback;)V", cancellable = true)
    private static void spawnCategoryForPosition_762067845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(762067845L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnCategoryForPosition(Lnet/minecraft/world/entity/MobCategory;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void spawnCategoryForPosition__1196921111(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1196921111L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isValidEmptySpawnBlock(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/entity/EntityType;)Z", cancellable = true)
    private static void isValidEmptySpawnBlock__153023117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153023117L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "spawnCategoryForChunk(Lnet/minecraft/world/entity/MobCategory;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/chunk/LevelChunk;Lnet/minecraft/world/level/NaturalSpawner$SpawnPredicate;Lnet/minecraft/world/level/NaturalSpawner$AfterSpawnCallback;)V", cancellable = true)
    private static void spawnCategoryForChunk_1285524281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1285524281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInNetherFortressBounds(Lnet/minecraft/core/BlockPos;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/MobCategory;Lnet/minecraft/world/level/StructureManager;)Z", cancellable = true)
    private static void isInNetherFortressBounds__834762175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-834762175L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createState(ILjava/lang/Iterable;Lnet/minecraft/world/level/NaturalSpawner$ChunkGetter;Lnet/minecraft/world/level/LocalMobCapCalculator;)Lnet/minecraft/world/level/NaturalSpawner$SpawnState;", cancellable = true)
    private static void createState_824868744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824868744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnForChunk(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/chunk/LevelChunk;Lnet/minecraft/world/level/NaturalSpawner$SpawnState;Ljava/util/List;)V", cancellable = true)
    private static void spawnForChunk_473445256(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(473445256L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFilteredSpawningCategories(Lnet/minecraft/world/level/NaturalSpawner$SpawnState;ZZ)Ljava/util/List;", cancellable = true)
    private static void getFilteredSpawningCategories_942905230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942905230L))
            info.setReturnValue(null);
    }


}
