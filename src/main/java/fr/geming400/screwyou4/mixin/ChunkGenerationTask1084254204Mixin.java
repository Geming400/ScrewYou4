package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkGenerationTask.class)
public class ChunkGenerationTask1084254204Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/server/level/GeneratingChunkMap;Lnet/minecraft/world/level/chunk/status/ChunkStatus;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/server/level/ChunkGenerationTask;", cancellable = true)
    private static void create__731784179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-731784179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCenter()Lnet/minecraft/server/level/GenerationChunkHolder;", cancellable = true)
    private void getCenter__1534307316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1534307316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markForCancellation()V", cancellable = true)
    private void markForCancellation_1122528943(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1122528943L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runUntilWait()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void runUntilWait__1497337831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497337831L))
            info.setReturnValue(null);
    }


}
