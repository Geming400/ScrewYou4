package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiManager.class)
public class PoiManager1701902643Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void remove_1870669242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1870669242L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/ai/village/poi/PoiRecord;", cancellable = true)
    private void add_839745355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839745355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "find(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/Optional;", cancellable = true)
    private void find_783034383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(783034383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType(Lnet/minecraft/core/BlockPos;)Ljava/util/Optional;", cancellable = true)
    private void getType__420696947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-420696947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "release(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void release_1870673086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1870673086L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "exists(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;)Z", cancellable = true)
    private void exists__790572723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-790572723L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "findAll(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/stream/Stream;", cancellable = true)
    private void findAll_676669754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676669754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;Lnet/minecraft/core/BlockPos;ILnet/minecraft/util/RandomSource;)Ljava/util/Optional;", cancellable = true)
    private void getRandom__947262061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-947262061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick(Ljava/util/function/BooleanSupplier;)V", cancellable = true)
    private void tick_1748694776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1748694776L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "take(Ljava/util/function/Predicate;Ljava/util/function/BiPredicate;Lnet/minecraft/core/BlockPos;I)Ljava/util/Optional;", cancellable = true)
    private void take_1624884663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1624884663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkConsistencyWithBlocks(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/chunk/LevelChunkSection;)V", cancellable = true)
    private void checkConsistencyWithBlocks_2039054131(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2039054131L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCountInRange(Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)J", cancellable = true)
    private void getCountInRange__935493283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-935493283L))
            info.setReturnValue(5940980310872104053L);
    }

    @Inject(at = @At("HEAD"), method = "getInSquare(Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/stream/Stream;", cancellable = true)
    private void getInSquare__428609749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-428609749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ensureLoadedAndValid(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void ensureLoadedAndValid_1899753975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1899753975L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "existsAtPosition(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void existsAtPosition_1882824378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882824378L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDebugPoiInfo(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/util/debug/DebugPoiInfo;", cancellable = true)
    private void getDebugPoiInfo__1174570831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1174570831L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findClosest(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/Optional;", cancellable = true)
    private void findClosest_783034383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(783034383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findClosest(Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/Optional;", cancellable = true)
    private void findClosest_613658494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613658494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionsToVillage(Lnet/minecraft/core/SectionPos;)I", cancellable = true)
    private void sectionsToVillage_613096773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613096773L))
            info.setReturnValue(-2142272761);
    }

    @Inject(at = @At("HEAD"), method = "getInRange(Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/stream/Stream;", cancellable = true)
    private void getInRange__428609749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-428609749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findAllClosestFirstWithType(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/stream/Stream;", cancellable = true)
    private void findAllClosestFirstWithType_676669754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676669754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findClosestWithType(Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/Optional;", cancellable = true)
    private void findClosestWithType_613658494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613658494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findAllWithType(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/stream/Stream;", cancellable = true)
    private void findAllWithType_676669754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676669754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInChunk(Ljava/util/function/Predicate;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/stream/Stream;", cancellable = true)
    private void getInChunk_1662690226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1662690226L))
            info.setReturnValue(null);
    }


}
