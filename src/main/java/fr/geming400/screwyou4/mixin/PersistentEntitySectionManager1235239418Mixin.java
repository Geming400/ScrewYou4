package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.PersistentEntitySectionManager.class)
public class PersistentEntitySectionManager1235239418Mixin {
        @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_1273501664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1273501664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1273514157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1273514157L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLoaded(Ljava/util/UUID;)Z", cancellable = true)
    private void isLoaded_877687173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(877687173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1273514157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1273514157L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gatherStats()Ljava/lang/String;", cancellable = true)
    private void gatherStats_99778947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(99778947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityGetter()Lnet/minecraft/world/level/entity/LevelEntityGetter;", cancellable = true)
    private void getEntityGetter_233993446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(233993446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "autoSave()V", cancellable = true)
    private void autoSave_1273514157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1273514157L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveAll()V", cancellable = true)
    private void saveAll_1273514157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1273514157L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTicking(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void isTicking__1544841827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1544841827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateChunkStatus(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/server/level/FullChunkStatus;)V", cancellable = true)
    private void updateChunkStatus__1037110373(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1037110373L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateChunkStatus(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/entity/Visibility;)V", cancellable = true)
    private void updateChunkStatus__1860192522(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1860192522L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dumpSections(Ljava/io/Writer;)V", cancellable = true)
    private void dumpSections_819776269(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(819776269L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addNewEntity(Lnet/minecraft/world/level/entity/EntityAccess;)Z", cancellable = true)
    private void addNewEntity__1810333583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1810333583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addWorldGenChunkEntities(Ljava/util/stream/Stream;)V", cancellable = true)
    private void addWorldGenChunkEntities__575803147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-575803147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "processPendingLoads()V", cancellable = true)
    private void processPendingLoads_1273514157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1273514157L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPositionTick(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void canPositionTick_1404009861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1404009861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPositionTick(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void canPositionTick__1544841827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1544841827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addLegacyChunkEntities(Ljava/util/stream/Stream;)V", cancellable = true)
    private void addLegacyChunkEntities__575803147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-575803147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "areEntitiesLoaded(J)Z", cancellable = true)
    private void areEntitiesLoaded__1844883541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844883541L))
            info.setReturnValue(null);
    }


}
