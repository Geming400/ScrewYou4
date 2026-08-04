package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.SurfaceSystem.class)
public class SurfaceSystem_695696114Mixin {
        @Inject(at = @At("HEAD"), method = "topMaterial(Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;Lnet/minecraft/world/level/levelgen/carver/CarvingContext;Ljava/util/function/Function;Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/levelgen/NoiseChunk;Lnet/minecraft/core/BlockPos;Z)Ljava/util/Optional;", cancellable = true)
    private void topMaterial__1219675564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1219675564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildSurface(Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/biome/BiomeManager;ZLnet/minecraft/world/level/levelgen/WorldGenerationContext;Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/levelgen/NoiseChunk;Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;Ljava/util/Set;)V", cancellable = true)
    private void buildSurface__161009733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-161009733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSeaLevel()I", cancellable = true)
    private void getSeaLevel_733958359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(733958359L))
            info.setReturnValue(null);
    }


}
