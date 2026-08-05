package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.LevelChunk.class)
public class LevelChunk_608183603Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_646462185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646462185L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/world/level/Level;", cancellable = true)
    private void getLevel__1968084466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1968084466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void addEntity_156458942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(156458942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void setBlockEntity_324486834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(324486834L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFullStatus()Lnet/minecraft/server/level/FullChunkStatus;", cancellable = true)
    private void getFullStatus__845408141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845408141L))
            info.setReturnValue(net.minecraft.server.level.FullChunkStatus.BLOCK_TICKING);
    }

    @Inject(at = @At("HEAD"), method = "addAndRegisterBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void addAndRegisterBlockEntity_324486834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(324486834L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeBlockEntity(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void removeBlockEntity_776950201(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(776950201L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void setBlockState_670181130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670181130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markUnsaved()V", cancellable = true)
    private void markUnsaved_646458341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(646458341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearAllBlockEntities()V", cancellable = true)
    private void clearAllBlockEntities_646458341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(646458341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpackTicks(J)V", cancellable = true)
    private void unpackTicks_1823024095(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1823024095L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockTicks()Lnet/minecraft/world/ticks/TickContainerAccess;", cancellable = true)
    private void getBlockTicks__609975880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609975880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidTicks()Lnet/minecraft/world/ticks/TickContainerAccess;", cancellable = true)
    private void getFluidTicks__609975880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609975880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerDebugValues(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/debug/DebugValueSource$Registration;)V", cancellable = true)
    private void registerDebugValues_1836460694(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1836460694L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_1006809548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1006809548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState_2054360375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2054360375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(III)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState_670579708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670579708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/chunk/LevelChunk$EntityCreationType;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_142758772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142758772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_605844394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(605844394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unregisterTickContainerFromLevel(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void unregisterTickContainerFromLevel__370225738(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-370225738L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerAllBlockEntitiesAfterLevelLoad()V", cancellable = true)
    private void registerAllBlockEntitiesAfterLevelLoad_646458341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(646458341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerTickContainerInLevel(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void registerTickContainerInLevel__370225738(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-370225738L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getListenerRegistry(I)Lnet/minecraft/world/level/gameevent/GameEventListenerRegistry;", cancellable = true)
    private void getListenerRegistry_461957561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461957561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPersistedStatus()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void getPersistedStatus_625463200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625463200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntityNbtForSaving(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getBlockEntityNbtForSaving_96230298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(96230298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicksForSerialization(J)Lnet/minecraft/world/level/chunk/ChunkAccess$PackedTicks;", cancellable = true)
    private void getTicksForSerialization__1288061117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1288061117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntities()Ljava/util/Map;", cancellable = true)
    private void getBlockEntities__1396440038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1396440038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFullStatus(Ljava/util/function/Supplier;)V", cancellable = true)
    private void setFullStatus__634232455(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-634232455L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runPostLoad()V", cancellable = true)
    private void runPostLoad_646458341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(646458341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setUnsavedListener(Lnet/minecraft/world/level/chunk/LevelChunk$UnsavedListener;)V", cancellable = true)
    private void setUnsavedListener_1235202543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1235202543L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replaceBiomes(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void replaceBiomes_254690481(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(254690481L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "postProcessGeneration(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void postProcessGeneration__370225738(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-370225738L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replaceWithPacketData(Lnet/minecraft/network/FriendlyByteBuf;Ljava/util/Map;Ljava/util/function/Consumer;)V", cancellable = true)
    private void replaceWithPacketData__715371264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-715371264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLoaded(Z)V", cancellable = true)
    private void setLoaded_1837800431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1837800431L))
            info.cancel();
    }


}
