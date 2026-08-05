package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.ChunkStatusTasks.class)
public class ChunkStatusTasks180759463Mixin {
        @Inject(at = @At("HEAD"), method = "full(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void full__1754165972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754165972L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "passThrough(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void passThrough__1754165972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754165972L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "light(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void light__1754165972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754165972L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "generateStructureReferences(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void generateStructureReferences__1754165972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754165972L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "generateSpawn(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void generateSpawn__1754165972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754165972L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "generateBiomes(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void generateBiomes__1754165972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754165972L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "generateCarvers(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void generateCarvers__1754165972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754165972L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "generateStructureStarts(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void generateStructureStarts__1754165972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754165972L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "generateSurface(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void generateSurface__1754165972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754165972L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "generateNoise(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void generateNoise__1754165972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754165972L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "generateFeatures(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void generateFeatures__1754165972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754165972L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "loadStructureStarts(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void loadStructureStarts__1754165972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754165972L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "initializeLight(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void initializeLight__1754165972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754165972L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
