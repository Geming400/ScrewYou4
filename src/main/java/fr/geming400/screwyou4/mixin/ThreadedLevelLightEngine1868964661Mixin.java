package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ThreadedLevelLightEngine.class)
public class ThreadedLevelLightEngine1868964661Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1907239400(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1907239400L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkBlock(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void checkBlock_2037731260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2037731260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateSectionStatus(Lnet/minecraft/core/SectionPos;Z)V", cancellable = true)
    private void updateSectionStatus__1775759034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1775759034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "propagateLightSources(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void propagateLightSources__911120428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-911120428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "initializeLight(Lnet/minecraft/world/level/chunk/ChunkAccess;Z)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void initializeLight_902514380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902514380L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "queueSectionData(Lnet/minecraft/world/level/LightLayer;Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/chunk/DataLayer;)V", cancellable = true)
    private void queueSectionData_1857805026(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1857805026L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runLightUpdates()I", cancellable = true)
    private void runLightUpdates_1907226907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1907226907L))
            info.setReturnValue(-681023038);
    }

    @Inject(at = @At("HEAD"), method = "setLightEnabled(Lnet/minecraft/world/level/ChunkPos;Z)V", cancellable = true)
    private void setLightEnabled_1628772742(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1628772742L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lightChunk(Lnet/minecraft/world/level/chunk/ChunkAccess;Z)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void lightChunk_902514380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902514380L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "retainData(Lnet/minecraft/world/level/ChunkPos;Z)V", cancellable = true)
    private void retainData_1628772742(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1628772742L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "waitForPendingTasks(II)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void waitForPendingTasks_142956594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142956594L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "tryScheduleUpdate()V", cancellable = true)
    private void tryScheduleUpdate_1907239400(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1907239400L))
            info.cancel();
    }


}
