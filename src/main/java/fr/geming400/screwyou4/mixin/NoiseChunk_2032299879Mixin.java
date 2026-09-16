package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.NoiseChunk.class)
public class NoiseChunk_2032299879Mixin {
        @Inject(at = @At("HEAD"), method = "forChunk(Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/levelgen/DensityFunctions$BeardifierOrMarker;Lnet/minecraft/world/level/levelgen/NoiseGeneratorSettings;Lnet/minecraft/world/level/levelgen/Aquifer$FluidPicker;Lnet/minecraft/world/level/levelgen/blending/Blender;)Lnet/minecraft/world/level/levelgen/NoiseChunk;", cancellable = true)
    private static void forChunk__1657551264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657551264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateForY(ID)V", cancellable = true)
    private void updateForY_1548395643(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1548395643L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateForZ(ID)V", cancellable = true)
    private void updateForZ__1003761318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1003761318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "swapSlices()V", cancellable = true)
    private void swapSlices__1999898107(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1999898107L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateForX(ID)V", cancellable = true)
    private void updateForX__194414692(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-194414692L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blockY()I", cancellable = true)
    private void blockY__1278411936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1278411936L))
            info.setReturnValue(77258366);
    }

    @Inject(at = @At("HEAD"), method = "blockZ()I", cancellable = true)
    private void blockZ__1249782785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249782785L))
            info.setReturnValue(-939369996);
    }

    @Inject(at = @At("HEAD"), method = "blockX()I", cancellable = true)
    private void blockX__1307041087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1307041087L))
            info.setReturnValue(-1946860746);
    }

    @Inject(at = @At("HEAD"), method = "forIndex(I)Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;", cancellable = true)
    private void forIndex_1058109574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1058109574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forIndex(I)Lnet/minecraft/world/level/levelgen/NoiseChunk;", cancellable = true)
    private void forIndex__761846350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-761846350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preliminarySurfaceLevel(II)I", cancellable = true)
    private void preliminarySurfaceLevel_982936479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(982936479L))
            info.setReturnValue(7838345);
    }

    @Inject(at = @At("HEAD"), method = "initializeForFirstCellX()V", cancellable = true)
    private void initializeForFirstCellX_598809370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(598809370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "advanceCellX(I)V", cancellable = true)
    private void advanceCellX__10275994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-10275994L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectCellYZ(II)V", cancellable = true)
    private void selectCellYZ__1287996358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1287996358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopInterpolation()V", cancellable = true)
    private void stopInterpolation__2095666537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2095666537L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aquifer()Lnet/minecraft/world/level/levelgen/Aquifer;", cancellable = true)
    private void aquifer_170034843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(170034843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillAllDirectly([DLnet/minecraft/world/level/levelgen/DensityFunction;)V", cancellable = true)
    private void fillAllDirectly__1937621020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1937621020L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "maxPreliminarySurfaceLevel(IIII)I", cancellable = true)
    private void maxPreliminarySurfaceLevel__856863869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-856863869L))
            info.setReturnValue(579889182);
    }


}
