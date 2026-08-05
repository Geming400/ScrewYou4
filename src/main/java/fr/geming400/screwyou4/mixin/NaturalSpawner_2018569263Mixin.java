package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.NaturalSpawner.class)
public class NaturalSpawner_2018569263Mixin {
        @Inject(at = @At("HEAD"), method = "getFilteredSpawningCategories(Lnet/minecraft/world/level/NaturalSpawner$SpawnState;ZZ)Ljava/util/List;", cancellable = true)
    private static void getFilteredSpawningCategories_771095550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771095550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnForChunk(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/chunk/LevelChunk;Lnet/minecraft/world/level/NaturalSpawner$SpawnState;Ljava/util/List;)V", cancellable = true)
    private static void spawnForChunk__2047273975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2047273975L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnMobsForChunkGeneration(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void spawnMobsForChunkGeneration_1303264041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1303264041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createState(ILjava/lang/Iterable;Lnet/minecraft/world/level/NaturalSpawner$ChunkGetter;Lnet/minecraft/world/level/LocalMobCapCalculator;)Lnet/minecraft/world/level/NaturalSpawner$SpawnState;", cancellable = true)
    private static void createState__615681699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615681699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidEmptySpawnBlock(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/entity/EntityType;)Z", cancellable = true)
    private static void isValidEmptySpawnBlock_460298624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(460298624L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "spawnCategoryForPosition(Lnet/minecraft/world/entity/MobCategory;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/NaturalSpawner$SpawnPredicate;Lnet/minecraft/world/level/NaturalSpawner$AfterSpawnCallback;)V", cancellable = true)
    private static void spawnCategoryForPosition__950189154(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-950189154L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnCategoryForPosition(Lnet/minecraft/world/entity/MobCategory;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void spawnCategoryForPosition__912764560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-912764560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnCategoryForChunk(Lnet/minecraft/world/entity/MobCategory;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/chunk/LevelChunk;Lnet/minecraft/world/level/NaturalSpawner$SpawnPredicate;Lnet/minecraft/world/level/NaturalSpawner$AfterSpawnCallback;)V", cancellable = true)
    private static void spawnCategoryForChunk_1800603574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1800603574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInNetherFortressBounds(Lnet/minecraft/core/BlockPos;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/MobCategory;Lnet/minecraft/world/level/StructureManager;)Z", cancellable = true)
    private static void isInNetherFortressBounds__2084452537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2084452537L))
            info.setReturnValue(true);
    }


}
