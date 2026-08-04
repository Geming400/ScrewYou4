package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.NoiseChunk.class)
public class NoiseChunk_2032299879Mixin {
        @Inject(at = @At("HEAD"), method = "blockX()I", cancellable = true)
    private void blockX_2070562124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070562124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockZ()I", cancellable = true)
    private void blockZ_2070562124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070562124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockY()I", cancellable = true)
    private void blockY_2070562124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070562124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxPreliminarySurfaceLevel(IIII)I", cancellable = true)
    private void maxPreliminarySurfaceLevel__648340596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648340596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preliminarySurfaceLevel(II)I", cancellable = true)
    private void preliminarySurfaceLevel_1036407916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036407916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillAllDirectly([DLnet/minecraft/world/level/levelgen/DensityFunction;)V", cancellable = true)
    private void fillAllDirectly_222202584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(222202584L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "initializeForFirstCellX()V", cancellable = true)
    private void initializeForFirstCellX_2070574617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2070574617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "advanceCellX(I)V", cancellable = true)
    private void advanceCellX__1048750446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1048750446L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectCellYZ(II)V", cancellable = true)
    private void selectCellYZ_1036420409(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1036420409L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopInterpolation()V", cancellable = true)
    private void stopInterpolation_2070574617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2070574617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forIndex(I)Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;", cancellable = true)
    private void forIndex_1311197167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311197167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forIndex(I)Lnet/minecraft/world/level/levelgen/NoiseChunk;", cancellable = true)
    private void forIndex__1966053719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966053719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forChunk(Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/levelgen/DensityFunctions$BeardifierOrMarker;Lnet/minecraft/world/level/levelgen/NoiseGeneratorSettings;Lnet/minecraft/world/level/levelgen/Aquifer$FluidPicker;Lnet/minecraft/world/level/levelgen/blending/Blender;)Lnet/minecraft/world/level/levelgen/NoiseChunk;", cancellable = true)
    private static void forChunk_1858161468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1858161468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateForY(ID)V", cancellable = true)
    private void updateForY_1031802804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1031802804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateForX(ID)V", cancellable = true)
    private void updateForX_1031802804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1031802804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateForZ(ID)V", cancellable = true)
    private void updateForZ_1031802804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1031802804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aquifer()Lnet/minecraft/world/level/levelgen/Aquifer;", cancellable = true)
    private void aquifer_1958603340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958603340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "swapSlices()V", cancellable = true)
    private void swapSlices_2070574617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2070574617L))
            info.cancel();
    }


}
