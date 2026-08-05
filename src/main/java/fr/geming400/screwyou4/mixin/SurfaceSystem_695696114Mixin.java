package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.SurfaceSystem.class)
public class SurfaceSystem_695696114Mixin {
        @Inject(at = @At("HEAD"), method = "getSeaLevel()I", cancellable = true)
    private void getSeaLevel__9321012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-9321012L))
            info.setReturnValue(-1107096266);
    }

    @Inject(at = @At("HEAD"), method = "buildSurface(Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/biome/BiomeManager;ZLnet/minecraft/world/level/levelgen/WorldGenerationContext;Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/levelgen/NoiseChunk;Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;Ljava/util/Set;)V", cancellable = true)
    private void buildSurface__1157784870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1157784870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "topMaterial(Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;Lnet/minecraft/world/level/levelgen/carver/CarvingContext;Ljava/util/function/Function;Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/levelgen/NoiseChunk;Lnet/minecraft/core/BlockPos;Z)Ljava/util/Optional;", cancellable = true)
    private void topMaterial__1921784264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921784264L))
            info.setReturnValue(null);
    }


}
