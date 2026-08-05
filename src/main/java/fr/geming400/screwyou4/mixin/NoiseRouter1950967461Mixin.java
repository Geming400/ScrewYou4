package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.NoiseRouter.class)
public class NoiseRouter1950967461Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__958487576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-958487576L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_815507486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(815507486L))
            info.setReturnValue("u)L%NPXB\uAA58@Y2,\u5CB6y0/\u9824x@56\uBC753 u@Y]\u86C9(+ff}o\u12F6m\u3A25");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1989230203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1989230203L))
            info.setReturnValue(-599859724);
    }

    @Inject(at = @At("HEAD"), method = "depth()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void depth__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "erosion()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void erosion__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapAll(Lnet/minecraft/world/level/levelgen/DensityFunction$Visitor;)Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private void mapAll_636819147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(636819147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "temperature()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void temperature__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ridges()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void ridges__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vegetation()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void vegetation__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "continents()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void continents__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preliminarySurfaceLevel()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void preliminarySurfaceLevel__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "barrierNoise()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void barrierNoise__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluidLevelFloodednessNoise()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void fluidLevelFloodednessNoise__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalDensity()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void finalDensity__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluidLevelSpreadNoise()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void fluidLevelSpreadNoise__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lavaNoise()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void lavaNoise__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "veinToggle()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void veinToggle__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "veinRidged()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void veinRidged__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "veinGap()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void veinGap__864960166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864960166L))
            info.setReturnValue(null);
    }


}
