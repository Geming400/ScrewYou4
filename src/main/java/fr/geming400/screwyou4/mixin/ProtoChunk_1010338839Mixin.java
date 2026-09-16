package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.ProtoChunk.class)
public class ProtoChunk_1010338839Mixin {
        @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__1744745866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1744745866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState__158231816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-158231816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntities()Ljava/util/List;", cancellable = true)
    private void getEntities__182501891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-182501891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPersistedStatus()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void getPersistedStatus_1580124819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580124819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPackedPostProcess(Lit/unimi/dsi/fastutil/shorts/ShortList;I)V", cancellable = true)
    private void addPackedPostProcess__451104576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-451104576L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntityNbtForSaving(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getBlockEntityNbtForSaving__1897301829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897301829L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "setStartForStructure(Lnet/minecraft/world/level/levelgen/structure/Structure;Lnet/minecraft/world/level/levelgen/structure/StructureStart;)V", cancellable = true)
    private void setStartForStructure_1381333881(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1381333881L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTicksForSerialization(J)Lnet/minecraft/world/level/chunk/ChunkAccess$PackedTicks;", cancellable = true)
    private void getTicksForSerialization_434441838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(434441838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBelowZeroRetrogen()Lnet/minecraft/world/level/levelgen/BelowZeroRetrogen;", cancellable = true)
    private void getBelowZeroRetrogen__1141042219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1141042219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntityNbts()Ljava/util/Map;", cancellable = true)
    private void getBlockEntityNbts__1612452367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612452367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpackFluidTicks()Lnet/minecraft/world/ticks/LevelChunkTicks;", cancellable = true)
    private void unpackFluidTicks_1261980633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1261980633L))
            info.setReturnValue(new net.minecraft.world.ticks.LevelChunkTicks());
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntities()Ljava/util/Map;", cancellable = true)
    private void getBlockEntities_1981993030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1981993030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpackBlockTicks()Lnet/minecraft/world/ticks/LevelChunkTicks;", cancellable = true)
    private void unpackBlockTicks__52163812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-52163812L))
            info.setReturnValue(new net.minecraft.world.ticks.LevelChunkTicks());
    }

    @Inject(at = @At("HEAD"), method = "unpackOffsetCoordinates(SILnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void unpackOffsetCoordinates__2104410693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104410693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markPosForPostProcessing(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void markPosForPostProcessing_490180306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(490180306L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void addEntity_102801030(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(102801030L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addEntity(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void addEntity_1615576504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1615576504L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity__1748856524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1748856524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidTicks()Lnet/minecraft/world/ticks/TickContainerAccess;", cancellable = true)
    private void getFluidTicks__966973798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-966973798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__990589241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990589241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTicks()Lnet/minecraft/world/ticks/TickContainerAccess;", cancellable = true)
    private void getBlockTicks_834767965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834767965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void setBlockState__1210583180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1210583180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void setBlockEntity_1969889352(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1969889352L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeBlockEntity(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void removeBlockEntity_1351678281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1351678281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeightAccessorForGeneration()Lnet/minecraft/world/level/LevelHeightAccessor;", cancellable = true)
    private void getHeightAccessorForGeneration__194822777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-194822777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCarvingMask()Lnet/minecraft/world/level/chunk/CarvingMask;", cancellable = true)
    private void getCarvingMask_1943702454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943702454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateCarvingMask()Lnet/minecraft/world/level/chunk/CarvingMask;", cancellable = true)
    private void getOrCreateCarvingMask_426143253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(426143253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPersistedStatus(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)V", cancellable = true)
    private void setPersistedStatus_1456253333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1456253333L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBelowZeroRetrogen(Lnet/minecraft/world/level/levelgen/BelowZeroRetrogen;)V", cancellable = true)
    private void setBelowZeroRetrogen__1417011253(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1417011253L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCarvingMask(Lnet/minecraft/world/level/chunk/CarvingMask;)V", cancellable = true)
    private void setCarvingMask_605535324(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(605535324L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLightEngine(Lnet/minecraft/world/level/lighting/LevelLightEngine;)V", cancellable = true)
    private void setLightEngine_1685342235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1685342235L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "packOffsetCoordinates(Lnet/minecraft/core/BlockPos;)S", cancellable = true)
    private static void packOffsetCoordinates__494829343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-494829343L))
            info.setReturnValue((short) 24381);
    }


}
