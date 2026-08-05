package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.LevelDebugSynchronizers.class)
public class LevelDebugSynchronizers_1195965484Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/util/debug/ServerDebugSubscribers;)V", cancellable = true)
    private void tick__1808105118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1808105118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasAnySubscriberFor(Lnet/minecraft/util/debug/DebugSubscription;)Z", cancellable = true)
    private void hasAnySubscriberFor_242809639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(242809639L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "registerBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void registerBlockEntity_569471518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(569471518L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerPoi(Lnet/minecraft/world/entity/ai/village/poi/PoiRecord;)V", cancellable = true)
    private void registerPoi_1834086197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1834086197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "broadcastEventToTracking(Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/debug/DebugSubscription;Ljava/lang/Object;)V", cancellable = true)
    private void broadcastEventToTracking_526269613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(526269613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendBlockValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/debug/DebugSubscription;Ljava/lang/Object;)V", cancellable = true)
    private void sendBlockValue__1784173138(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1784173138L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropChunk(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void dropChunk_1383902668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383902668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropPoi(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void dropPoi__2121260339(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2121260339L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerChunk(Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void registerChunk_950155644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(950155644L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void registerEntity__1129213667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1129213667L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTrackingEntity(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void startTrackingEntity__2094395029(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2094395029L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearBlockValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/debug/DebugSubscription;)V", cancellable = true)
    private void clearBlockValue_169716951(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(169716951L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearEntityValue(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/util/debug/DebugSubscription;)V", cancellable = true)
    private void clearEntityValue__268865972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-268865972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendEntityValue(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/util/debug/DebugSubscription;Ljava/lang/Object;)V", cancellable = true)
    private void sendEntityValue_155614349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(155614349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updatePoi(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void updatePoi_2050627891(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2050627891L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void dropEntity_1829235817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1829235817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTrackingChunk(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void startTrackingChunk_1331405006(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1331405006L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropBlockEntity(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void dropBlockEntity_1662330067(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1662330067L))
            info.cancel();
    }


}
