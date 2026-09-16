package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiManager.class)
public class PoiManager1701902643Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void remove__1496318658(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1496318658L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/ai/village/poi/PoiRecord;", cancellable = true)
    private void add__1288632118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1288632118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "find(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/Optional;", cancellable = true)
    private void find__1257452152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1257452152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType(Lnet/minecraft/core/BlockPos;)Ljava/util/Optional;", cancellable = true)
    private void getType_244982493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(244982493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "release(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void release__568026363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-568026363L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "exists(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;)Z", cancellable = true)
    private void exists_1261823401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1261823401L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "findAll(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/stream/Stream;", cancellable = true)
    private void findAll_754317074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(754317074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;Lnet/minecraft/core/BlockPos;ILnet/minecraft/util/RandomSource;)Ljava/util/Optional;", cancellable = true)
    private void getRandom__1558296262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1558296262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick(Ljava/util/function/BooleanSupplier;)V", cancellable = true)
    private void tick_732256763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(732256763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "take(Ljava/util/function/Predicate;Ljava/util/function/BiPredicate;Lnet/minecraft/core/BlockPos;I)Ljava/util/Optional;", cancellable = true)
    private void take__229253954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-229253954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "existsAtPosition(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void existsAtPosition__2669630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2669630L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "findClosestWithType(Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/Optional;", cancellable = true)
    private void findClosestWithType__1410186466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1410186466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionsToVillage(Lnet/minecraft/core/SectionPos;)I", cancellable = true)
    private void sectionsToVillage_1783323368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1783323368L))
            info.setReturnValue(185433650);
    }

    @Inject(at = @At("HEAD"), method = "findClosest(Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/Optional;", cancellable = true)
    private void findClosest__1520861730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520861730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findClosest(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/Optional;", cancellable = true)
    private void findClosest__249524625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-249524625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInRange(Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/stream/Stream;", cancellable = true)
    private void getInRange__2132260215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2132260215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findAllWithType(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/stream/Stream;", cancellable = true)
    private void findAllWithType_1221423570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1221423570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ensureLoadedAndValid(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void ensureLoadedAndValid__719378593(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-719378593L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkConsistencyWithBlocks(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/chunk/LevelChunkSection;)V", cancellable = true)
    private void checkConsistencyWithBlocks__1279440457(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1279440457L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCountInRange(Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)J", cancellable = true)
    private void getCountInRange_498736062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498736062L))
            info.setReturnValue(-6241341914703895886L);
    }

    @Inject(at = @At("HEAD"), method = "getInSquare(Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/stream/Stream;", cancellable = true)
    private void getInSquare__759899629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-759899629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDebugPoiInfo(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/util/debug/DebugPoiInfo;", cancellable = true)
    private void getDebugPoiInfo_1203694700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1203694700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findAllClosestFirstWithType(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;ILnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/stream/Stream;", cancellable = true)
    private void findAllClosestFirstWithType__492911877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-492911877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInChunk(Ljava/util/function/Predicate;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/stream/Stream;", cancellable = true)
    private void getInChunk_342520160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(342520160L))
            info.setReturnValue(null);
    }


}
