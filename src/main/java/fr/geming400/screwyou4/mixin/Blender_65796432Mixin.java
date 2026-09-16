package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blending.Blender.class)
public class Blender_65796432Mixin {
        @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/server/level/WorldGenRegion;)Lnet/minecraft/world/level/levelgen/blending/Blender;", cancellable = true)
    private static void of__1268776195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1268776195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1124912803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1124912803L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/world/level/levelgen/blending/Blender;", cancellable = true)
    private static void empty_1217135383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1217135383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blendDensity(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;D)D", cancellable = true)
    private void blendDensity_313180152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(313180152L))
            info.setReturnValue(3.2893210029080164E8D);
    }

    @Inject(at = @At("HEAD"), method = "getBiomeResolver(Lnet/minecraft/world/level/biome/BiomeResolver;)Lnet/minecraft/world/level/biome/BiomeResolver;", cancellable = true)
    private void getBiomeResolver__781478204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-781478204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addAroundOldChunksCarvingMaskFilter(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/chunk/ProtoChunk;)V", cancellable = true)
    private static void addAroundOldChunksCarvingMaskFilter_973845208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(973845208L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeOldChunkDistanceGetter(Lnet/minecraft/world/level/levelgen/blending/BlendingData;Ljava/util/Map;)Lnet/minecraft/world/level/levelgen/blending/Blender$DistanceGetter;", cancellable = true)
    private static void makeOldChunkDistanceGetter__254746106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-254746106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateBorderTicks(Lnet/minecraft/server/level/WorldGenRegion;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private static void generateBorderTicks_1391435847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1391435847L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blendOffsetAndFactor(II)Lnet/minecraft/world/level/levelgen/blending/Blender$BlendingOutput;", cancellable = true)
    private void blendOffsetAndFactor__1593634704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1593634704L))
            info.setReturnValue(null);
    }


}
