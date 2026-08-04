package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blending.Blender.class)
public class Blender_65796432Mixin {
        @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/server/level/WorldGenRegion;)Lnet/minecraft/world/level/levelgen/blending/Blender;", cancellable = true)
    private static void of_1494092966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1494092966L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_104075014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104075014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/world/level/levelgen/blending/Blender;", cancellable = true)
    private static void empty__1749355580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749355580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addAroundOldChunksCarvingMaskFilter(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/chunk/ProtoChunk;)V", cancellable = true)
    private static void addAroundOldChunksCarvingMaskFilter__1137890125(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1137890125L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBiomeResolver(Lnet/minecraft/world/level/biome/BiomeResolver;)Lnet/minecraft/world/level/biome/BiomeResolver;", cancellable = true)
    private void getBiomeResolver_683914676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(683914676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blendDensity(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;D)D", cancellable = true)
    private void blendDensity_33306977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(33306977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blendOffsetAndFactor(II)Lnet/minecraft/world/level/levelgen/blending/Blender$BlendingOutput;", cancellable = true)
    private void blendOffsetAndFactor__1915616050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915616050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeOldChunkDistanceGetter(Lnet/minecraft/world/level/levelgen/blending/BlendingData;Ljava/util/Map;)Lnet/minecraft/world/level/levelgen/blending/Blender$DistanceGetter;", cancellable = true)
    private static void makeOldChunkDistanceGetter__1689450854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1689450854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateBorderTicks(Lnet/minecraft/server/level/WorldGenRegion;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private static void generateBorderTicks_574322972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(574322972L))
            info.cancel();
    }


}
