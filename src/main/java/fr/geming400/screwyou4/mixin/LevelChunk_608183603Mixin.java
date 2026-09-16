package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.LevelChunk.class)
public class LevelChunk_608183603Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1667299974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1667299974L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/world/level/Level;", cancellable = true)
    private void getLevel__1148137216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148137216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__2146901102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146901102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState__560387052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560387052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(III)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState__201018087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-201018087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerDebugValues(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/debug/DebugValueSource$Registration;)V", cancellable = true)
    private void registerDebugValues_149096228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(149096228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistedStatus()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void getPersistedStatus_1177969583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1177969583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntityNbtForSaving(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getBlockEntityNbtForSaving_1995510231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1995510231L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getTicksForSerialization(J)Lnet/minecraft/world/level/chunk/ChunkAccess$PackedTicks;", cancellable = true)
    private void getTicksForSerialization_32286602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(32286602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListenerRegistry(I)Lnet/minecraft/world/level/gameevent/GameEventListenerRegistry;", cancellable = true)
    private void getListenerRegistry__1253350720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1253350720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setUnsavedListener(Lnet/minecraft/world/level/chunk/LevelChunk$UnsavedListener;)V", cancellable = true)
    private void setUnsavedListener__362436529(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-362436529L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntities()Ljava/util/Map;", cancellable = true)
    private void getBlockEntities_1579837794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579837794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unregisterTickContainerFromLevel(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void unregisterTickContainerFromLevel_1626856612(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1626856612L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void addEntity__299354206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-299354206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpackTicks(J)V", cancellable = true)
    private void unpackTicks_571985475(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(571985475L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearAllBlockEntities()V", cancellable = true)
    private void clearAllBlockEntities_466647147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(466647147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_2143955536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2143955536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/chunk/LevelChunk$EntityCreationType;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity__690069490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-690069490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidTicks()Lnet/minecraft/world/ticks/TickContainerAccess;", cancellable = true)
    private void getFluidTicks__1369129034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369129034L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTicks()Lnet/minecraft/world/ticks/TickContainerAccess;", cancellable = true)
    private void getBlockTicks_432612729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432612729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void setBlockState__1612738416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612738416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markUnsaved()V", cancellable = true)
    private void markUnsaved_1639951492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1639951492L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void setBlockEntity_1567734116(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1567734116L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFullStatus()Lnet/minecraft/server/level/FullChunkStatus;", cancellable = true)
    private void getFullStatus_432184778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432184778L))
            info.setReturnValue(net.minecraft.server.level.FullChunkStatus.BLOCK_TICKING);
    }

    @Inject(at = @At("HEAD"), method = "removeBlockEntity(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void removeBlockEntity_949523045(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(949523045L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addAndRegisterBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void addAndRegisterBlockEntity__1336838213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1336838213L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerTickContainerInLevel(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void registerTickContainerInLevel_2035208664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2035208664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerAllBlockEntitiesAfterLevelLoad()V", cancellable = true)
    private void registerAllBlockEntitiesAfterLevelLoad__335787417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-335787417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLoaded(Z)V", cancellable = true)
    private void setLoaded__214531658(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-214531658L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFullStatus(Ljava/util/function/Supplier;)V", cancellable = true)
    private void setFullStatus__760822244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-760822244L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "postProcessGeneration(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void postProcessGeneration__107626257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-107626257L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replaceWithPacketData(Lnet/minecraft/network/FriendlyByteBuf;Ljava/util/Map;Ljava/util/function/Consumer;)V", cancellable = true)
    private void replaceWithPacketData_1152562828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1152562828L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runPostLoad()V", cancellable = true)
    private void runPostLoad__270405324(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-270405324L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replaceBiomes(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void replaceBiomes_358160856(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(358160856L))
            info.cancel();
    }


}
