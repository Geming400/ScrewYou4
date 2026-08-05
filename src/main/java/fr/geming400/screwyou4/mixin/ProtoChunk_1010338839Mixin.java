package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.ProtoChunk.class)
public class ProtoChunk_1010338839Mixin {
        @Inject(at = @At("HEAD"), method = "getEntities()Ljava/util/List;", cancellable = true)
    private void getEntities__1658291642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1658291642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCarvingMask()Lnet/minecraft/world/level/chunk/CarvingMask;", cancellable = true)
    private void getCarvingMask__1983442868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1983442868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateCarvingMask()Lnet/minecraft/world/level/chunk/CarvingMask;", cancellable = true)
    private void getOrCreateCarvingMask__1983442868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1983442868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpackFluidTicks()Lnet/minecraft/world/ticks/LevelChunkTicks;", cancellable = true)
    private void unpackFluidTicks__1978405833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978405833L))
            info.setReturnValue(new net.minecraft.world.ticks.LevelChunkTicks());
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntities()Ljava/util/Map;", cancellable = true)
    private void getBlockEntities__994284802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-994284802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpackOffsetCoordinates(SILnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void unpackOffsetCoordinates__82773039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-82773039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpackBlockTicks()Lnet/minecraft/world/ticks/LevelChunkTicks;", cancellable = true)
    private void unpackBlockTicks__1978405833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978405833L))
            info.setReturnValue(new net.minecraft.world.ticks.LevelChunkTicks());
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntityNbts()Ljava/util/Map;", cancellable = true)
    private void getBlockEntityNbts__994284802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-994284802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState__1838451685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838451685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_1007999630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007999630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void addEntity_558614178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(558614178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addEntity(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void addEntity_1571247060(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1571247060L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void setBlockState_1072336366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072336366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void setBlockEntity_726642070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(726642070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeBlockEntity(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void removeBlockEntity_1179105437(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1179105437L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__1882600405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1882600405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTicks()Lnet/minecraft/world/ticks/TickContainerAccess;", cancellable = true)
    private void getBlockTicks__207820644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207820644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidTicks()Lnet/minecraft/world/ticks/TickContainerAccess;", cancellable = true)
    private void getFluidTicks__207820644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207820644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_1408964784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1408964784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeightAccessorForGeneration()Lnet/minecraft/world/level/LevelHeightAccessor;", cancellable = true)
    private void getHeightAccessorForGeneration_1047559236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1047559236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setStartForStructure(Lnet/minecraft/world/level/levelgen/structure/Structure;Lnet/minecraft/world/level/levelgen/structure/StructureStart;)V", cancellable = true)
    private void setStartForStructure_1364207631(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1364207631L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTicksForSerialization(J)Lnet/minecraft/world/level/chunk/ChunkAccess$PackedTicks;", cancellable = true)
    private void getTicksForSerialization__885905881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-885905881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPackedPostProcess(Lit/unimi/dsi/fastutil/shorts/ShortList;I)V", cancellable = true)
    private void addPackedPostProcess__563296310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-563296310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistedStatus()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void getPersistedStatus_1027618436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027618436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntityNbtForSaving(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getBlockEntityNbtForSaving_498385534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498385534L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getBelowZeroRetrogen()Lnet/minecraft/world/level/levelgen/BelowZeroRetrogen;", cancellable = true)
    private void getBelowZeroRetrogen_750049088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750049088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packOffsetCoordinates(Lnet/minecraft/core/BlockPos;)S", cancellable = true)
    private static void packOffsetCoordinates_1179102802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179102802L))
            info.setReturnValue((short) 18762);
    }

    @Inject(at = @At("HEAD"), method = "markPosForPostProcessing(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void markPosForPostProcessing_1179105437(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1179105437L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPersistedStatus(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)V", cancellable = true)
    private void setPersistedStatus__306267464(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-306267464L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBelowZeroRetrogen(Lnet/minecraft/world/level/levelgen/BelowZeroRetrogen;)V", cancellable = true)
    private void setBelowZeroRetrogen__69194060(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-69194060L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCarvingMask(Lnet/minecraft/world/level/chunk/CarvingMask;)V", cancellable = true)
    private void setCarvingMask__550527982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-550527982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLightEngine(Lnet/minecraft/world/level/lighting/LevelLightEngine;)V", cancellable = true)
    private void setLightEngine__600561051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-600561051L))
            info.cancel();
    }


}
