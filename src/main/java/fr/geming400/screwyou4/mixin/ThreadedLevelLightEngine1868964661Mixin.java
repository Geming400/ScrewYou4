package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ThreadedLevelLightEngine.class)
public class ThreadedLevelLightEngine1868964661Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__245610768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-245610768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkBlock(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void checkBlock_197315297(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(197315297L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runLightUpdates()I", cancellable = true)
    private void runLightUpdates__2095895684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2095895684L))
            info.setReturnValue(-1921032069);
    }

    @Inject(at = @At("HEAD"), method = "setLightEnabled(Lnet/minecraft/world/level/ChunkPos;Z)V", cancellable = true)
    private void setLightEnabled_1893466131(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1893466131L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "queueSectionData(Lnet/minecraft/world/level/LightLayer;Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/chunk/DataLayer;)V", cancellable = true)
    private void queueSectionData_1708570436(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1708570436L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lightChunk(Lnet/minecraft/world/level/chunk/ChunkAccess;Z)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void lightChunk_1257403139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1257403139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retainData(Lnet/minecraft/world/level/ChunkPos;Z)V", cancellable = true)
    private void retainData__6418155(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-6418155L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "propagateLightSources(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void propagateLightSources__340340567(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-340340567L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "waitForPendingTasks(II)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void waitForPendingTasks__68131235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-68131235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryScheduleUpdate()V", cancellable = true)
    private void tryScheduleUpdate_743663085(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(743663085L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "initializeLight(Lnet/minecraft/world/level/chunk/ChunkAccess;Z)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void initializeLight_1418802866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418802866L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "updateSectionStatus(Lnet/minecraft/core/SectionPos;Z)V", cancellable = true)
    private void updateSectionStatus_1682712(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1682712L))
            info.cancel();
    }


}
