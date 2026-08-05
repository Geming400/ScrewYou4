package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.ImposterProtoChunk.class)
public class ImposterProtoChunk_470049542Mixin {
        @Inject(at = @At("HEAD"), method = "getWrapped()Lnet/minecraft/world/level/chunk/LevelChunk;", cancellable = true)
    private void getWrapped__788286548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-788286548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateHeightmapUnprimed(Lnet/minecraft/world/level/levelgen/Heightmap$Types;)Lnet/minecraft/world/level/levelgen/Heightmap;", cancellable = true)
    private void getOrCreateHeightmapUnprimed_374891609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(374891609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setStartForStructure(Lnet/minecraft/world/level/levelgen/structure/Structure;Lnet/minecraft/world/level/levelgen/structure/StructureStart;)V", cancellable = true)
    private void setStartForStructure_823918334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(823918334L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistedStatus()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void getPersistedStatus_487329139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487329139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlockEntityNbt(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void setBlockEntityNbt_1030957763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1030957763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntityNbt(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getBlockEntityNbt_631958161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631958161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntityNbtForSaving(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getBlockEntityNbtForSaving__41903763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-41903763L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "canBeSerialized()Z", cancellable = true)
    private void canBeSerialized_508328124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508328124L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isLightCorrect()Z", cancellable = true)
    private void isLightCorrect_508328124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508328124L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setAllReferences(Ljava/util/Map;)V", cancellable = true)
    private void setAllReferences__1310522637(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1310522637L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTicksForSerialization(J)Lnet/minecraft/world/level/chunk/ChunkAccess$PackedTicks;", cancellable = true)
    private void getTicksForSerialization__1426195178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1426195178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStartForStructure(Lnet/minecraft/world/level/levelgen/structure/Structure;)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private void getStartForStructure_1321013270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1321013270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAllStarts(Ljava/util/Map;)V", cancellable = true)
    private void setAllStarts__1310522637(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1310522637L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addReferenceForStructure(Lnet/minecraft/world/level/levelgen/structure/Structure;J)V", cancellable = true)
    private void addReferenceForStructure__840507085(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-840507085L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAllReferences()Ljava/util/Map;", cancellable = true)
    private void getAllReferences__1534574099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1534574099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryMarkSaved()Z", cancellable = true)
    private void tryMarkSaved_508328124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508328124L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getReferencesForStructure(Lnet/minecraft/world/level/levelgen/structure/Structure;)Lit/unimi/dsi/fastutil/longs/LongSet;", cancellable = true)
    private void getReferencesForStructure__1528834289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528834289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setHeightmap(Lnet/minecraft/world/level/levelgen/Heightmap$Types;[J)V", cancellable = true)
    private void setHeightmap_1781897299(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1781897299L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillBiomesFromNoise(Lnet/minecraft/world/level/biome/BiomeResolver;Lnet/minecraft/world/level/biome/Climate$Sampler;)V", cancellable = true)
    private void fillBiomesFromNoise_225953205(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(225953205L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSkyLightSources()Lnet/minecraft/world/level/lighting/ChunkSkyLightSources;", cancellable = true)
    private void getSkyLightSources_1306973068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1306973068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlendingData()Lnet/minecraft/world/level/levelgen/blending/BlendingData;", cancellable = true)
    private void getBlendingData__1076771295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076771295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLightCorrect(Z)V", cancellable = true)
    private void setLightCorrect_1699666370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1699666370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "initializeLightSources()V", cancellable = true)
    private void initializeLightSources_508324280(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(508324280L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/world/level/levelgen/Heightmap$Types;II)I", cancellable = true)
    private void getHeight_1265636567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1265636567L))
            info.setReturnValue(-257946178);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_467710333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467710333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState_1916226314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1916226314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void getPos__419049296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-419049296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void addEntity_18324881(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(18324881L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockTicks()Lnet/minecraft/world/ticks/TickContainerAccess;", cancellable = true)
    private void getBlockTicks__748109941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748109941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome_1872077594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1872077594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidTicks()Lnet/minecraft/world/ticks/TickContainerAccess;", cancellable = true)
    private void getFluidTicks__748109941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748109941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void setBlockState_532047069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532047069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void setBlockEntity_186352773(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(186352773L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeBlockEntity(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void removeBlockEntity_638816140(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(638816140L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markUnsaved()V", cancellable = true)
    private void markUnsaved_508324280(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(508324280L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSections()[Lnet/minecraft/world/level/chunk/LevelChunkSection;", cancellable = true)
    private void getSections_1239167186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1239167186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllStarts()Ljava/util/Map;", cancellable = true)
    private void getAllStarts__1534574099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1534574099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_868675487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868675487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSection(I)Lnet/minecraft/world/level/chunk/LevelChunkSection;", cancellable = true)
    private void getSection_1527258596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527258596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findBlocks(Ljava/util/function/Predicate;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void findBlocks_973313452(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(973313452L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isUnsaved()Z", cancellable = true)
    private void isUnsaved_508328124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508328124L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "markPosForPostProcessing(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void markPosForPostProcessing_638816140(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(638816140L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPersistedStatus(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)V", cancellable = true)
    private void setPersistedStatus__846556761(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-846556761L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateCarvingMask()Lnet/minecraft/world/level/chunk/CarvingMask;", cancellable = true)
    private void getOrCreateCarvingMask_1771235131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771235131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCarvingMask()Lnet/minecraft/world/level/chunk/CarvingMask;", cancellable = true)
    private void getCarvingMask_1771235131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771235131L))
            info.setReturnValue(null);
    }


}
