package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.ImposterProtoChunk.class)
public class ImposterProtoChunk_470049542Mixin {
        @Inject(at = @At("HEAD"), method = "getWrapped()Lnet/minecraft/world/level/chunk/LevelChunk;", cancellable = true)
    private void getWrapped__656344581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-656344581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_2005821475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2005821475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState__698521113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-698521113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void setBlockEntity_1429600055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1429600055L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeBlockEntity(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void removeBlockEntity_811388984(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(811388984L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void setBlockState__1750872477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1750872477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markUnsaved()V", cancellable = true)
    private void markUnsaved_1501817431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1501817431L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__1530878538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1530878538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTicks()Lnet/minecraft/world/ticks/TickContainerAccess;", cancellable = true)
    private void getBlockTicks_294478668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(294478668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidTicks()Lnet/minecraft/world/ticks/TickContainerAccess;", cancellable = true)
    private void getFluidTicks__1507263095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1507263095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSections()[Lnet/minecraft/world/level/chunk/LevelChunkSection;", cancellable = true)
    private void getSections__595619722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595619722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllStarts()Ljava/util/Map;", cancellable = true)
    private void getAllStarts__114196015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-114196015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/world/level/levelgen/Heightmap$Types;II)I", cancellable = true)
    private void getHeight__886183270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-886183270L))
            info.setReturnValue(1760459204);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void getPos__537641522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537641522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void addEntity__437488267(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-437488267L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSection(I)Lnet/minecraft/world/level/chunk/LevelChunkSection;", cancellable = true)
    private void getSection_1761673107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1761673107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_2009932133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2009932133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateHeightmapUnprimed(Lnet/minecraft/world/level/levelgen/Heightmap$Types;)Lnet/minecraft/world/level/levelgen/Heightmap;", cancellable = true)
    private void getOrCreateHeightmapUnprimed_1825198007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1825198007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markPosForPostProcessing(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void markPosForPostProcessing__50108991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-50108991L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateCarvingMask()Lnet/minecraft/world/level/chunk/CarvingMask;", cancellable = true)
    private void getOrCreateCarvingMask__114146044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-114146044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCarvingMask()Lnet/minecraft/world/level/chunk/CarvingMask;", cancellable = true)
    private void getCarvingMask_1403413157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403413157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isUnsaved()Z", cancellable = true)
    private void isUnsaved__980329416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980329416L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "findBlocks(Ljava/util/function/Predicate;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void findBlocks_1649029771(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1649029771L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPersistedStatus(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)V", cancellable = true)
    private void setPersistedStatus_915964036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(915964036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTicksForSerialization(J)Lnet/minecraft/world/level/chunk/ChunkAccess$PackedTicks;", cancellable = true)
    private void getTicksForSerialization__105847459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-105847459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillBiomesFromNoise(Lnet/minecraft/world/level/biome/BiomeResolver;Lnet/minecraft/world/level/biome/Climate$Sampler;)V", cancellable = true)
    private void fillBiomesFromNoise_1025323771(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1025323771L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSkyLightSources()Lnet/minecraft/world/level/lighting/ChunkSkyLightSources;", cancellable = true)
    private void getSkyLightSources_180212575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(180212575L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initializeLightSources()V", cancellable = true)
    private void initializeLightSources_454360966(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(454360966L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLightCorrect(Z)V", cancellable = true)
    private void setLightCorrect_715480376(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(715480376L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlendingData()Lnet/minecraft/world/level/levelgen/blending/BlendingData;", cancellable = true)
    private void getBlendingData_1796560402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1796560402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAllStarts(Ljava/util/Map;)V", cancellable = true)
    private void setAllStarts_1420082691(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1420082691L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getReferencesForStructure(Lnet/minecraft/world/level/levelgen/structure/Structure;)Lit/unimi/dsi/fastutil/longs/LongSet;", cancellable = true)
    private void getReferencesForStructure__248200249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-248200249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStartForStructure(Lnet/minecraft/world/level/levelgen/structure/Structure;)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private void getStartForStructure_456333664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(456333664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addReferenceForStructure(Lnet/minecraft/world/level/levelgen/structure/Structure;J)V", cancellable = true)
    private void addReferenceForStructure__2068262489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2068262489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAllReferences()Ljava/util/Map;", cancellable = true)
    private void getAllReferences__559907910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-559907910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAllReferences(Ljava/util/Map;)V", cancellable = true)
    private void setAllReferences_768124730(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(768124730L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStartForStructure(Lnet/minecraft/world/level/levelgen/structure/Structure;Lnet/minecraft/world/level/levelgen/structure/StructureStart;)V", cancellable = true)
    private void setStartForStructure_841044584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(841044584L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLightCorrect()Z", cancellable = true)
    private void isLightCorrect__748616002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748616002L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setHeightmap(Lnet/minecraft/world/level/levelgen/Heightmap$Types;[J)V", cancellable = true)
    private void setHeightmap__480182304(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-480182304L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryMarkSaved()Z", cancellable = true)
    private void tryMarkSaved_1543436253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543436253L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntityNbtForSaving(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getBlockEntityNbtForSaving_1857376170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1857376170L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "canBeSerialized()Z", cancellable = true)
    private void canBeSerialized__774869755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-774869755L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setBlockEntityNbt(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void setBlockEntityNbt_619603733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(619603733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntityNbt(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getBlockEntityNbt__971288617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-971288617L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getPersistedStatus()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void getPersistedStatus_1039835522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1039835522L))
            info.setReturnValue(null);
    }


}
