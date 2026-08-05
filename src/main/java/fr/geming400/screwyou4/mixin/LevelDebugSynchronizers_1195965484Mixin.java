package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.LevelDebugSynchronizers.class)
public class LevelDebugSynchronizers_1195965484Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/util/debug/ServerDebugSubscribers;)V", cancellable = true)
    private void tick__1865242747(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1865242747L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updatePoi(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void updatePoi_1364732082(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1364732082L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropChunk(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void dropChunk__1584119606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1584119606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropPoi(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void dropPoi_1364732082(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1364732082L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerPoi(Lnet/minecraft/world/entity/ai/village/poi/PoiRecord;)V", cancellable = true)
    private void registerPoi_1072036174(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1072036174L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "broadcastEventToTracking(Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/debug/DebugSubscription;Ljava/lang/Object;)V", cancellable = true)
    private void broadcastEventToTracking__408441054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-408441054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void registerBlockEntity_912268715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(912268715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasAnySubscriberFor(Lnet/minecraft/util/debug/DebugSubscription;)Z", cancellable = true)
    private void hasAnySubscriberFor_446544566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446544566L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "sendBlockValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/debug/DebugSubscription;Ljava/lang/Object;)V", cancellable = true)
    private void sendBlockValue__408441054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-408441054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropBlockEntity(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void dropBlockEntity_1364732082(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1364732082L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTrackingChunk(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void startTrackingChunk__335692518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-335692518L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void dropEntity_744240823(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(744240823L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerChunk(Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void registerChunk__167100986(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-167100986L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearBlockValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/debug/DebugSubscription;)V", cancellable = true)
    private void clearBlockValue_488792966(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(488792966L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void registerEntity_744240823(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(744240823L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTrackingEntity(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void startTrackingEntity__878055321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-878055321L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendEntityValue(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/util/debug/DebugSubscription;Ljava/lang/Object;)V", cancellable = true)
    private void sendEntityValue_783602279(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(783602279L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearEntityValue(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/util/debug/DebugSubscription;)V", cancellable = true)
    private void clearEntityValue_1374502411(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1374502411L))
            info.cancel();
    }


}
