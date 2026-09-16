package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkGenerationTask.class)
public class ChunkGenerationTask1084254204Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/server/level/GeneratingChunkMap;Lnet/minecraft/world/level/chunk/status/ChunkStatus;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/server/level/ChunkGenerationTask;", cancellable = true)
    private static void create__1055380079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055380079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCenter()Lnet/minecraft/server/level/GenerationChunkHolder;", cancellable = true)
    private void getCenter_1054997783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054997783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runUntilWait()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void runUntilWait__1248965695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1248965695L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "markForCancellation()V", cancellable = true)
    private void markForCancellation__1668243408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1668243408L))
            info.cancel();
    }


}
