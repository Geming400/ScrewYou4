package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.NoiseGeneratorSettings.class)
public class NoiseGeneratorSettings_2102462446Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__806992592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-806992592L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_967002470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967002470L))
            info.setReturnValue("UsT]7pK\"/<e*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2140725187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140725187L))
            info.setReturnValue(-28546646);
    }

    @Inject(at = @At("HEAD"), method = "dummy()Lnet/minecraft/world/level/levelgen/NoiseGeneratorSettings;", cancellable = true)
    private static void dummy_1890675750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1890675750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_909943942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(909943942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "noiseSettings()Lnet/minecraft/world/level/levelgen/NoiseSettings;", cancellable = true)
    private void noiseSettings_415917061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415917061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useLegacyRandomSource()Z", cancellable = true)
    private void useLegacyRandomSource_2140741028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140741028L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "spawnTarget()Ljava/util/List;", cancellable = true)
    private void spawnTarget__566168035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-566168035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultBlock()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void defaultBlock__193296421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-193296421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultFluid()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void defaultFluid__193296421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-193296421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disableMobGeneration()Z", cancellable = true)
    private void disableMobGeneration_2140741028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140741028L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "oreVeinsEnabled()Z", cancellable = true)
    private void oreVeinsEnabled_2140741028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140741028L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aquifersEnabled()Z", cancellable = true)
    private void aquifersEnabled_2140741028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140741028L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "noiseRouter()Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private void noiseRouter_946458527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(946458527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAquifersEnabled()Z", cancellable = true)
    private void isAquifersEnabled_2140741028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140741028L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRandomSource()Lnet/minecraft/world/level/levelgen/WorldgenRandom$Algorithm;", cancellable = true)
    private void getRandomSource_1119057918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119057918L))
            info.setReturnValue(net.minecraft.world.level.levelgen.WorldgenRandom.Algorithm.XOROSHIRO);
    }

    @Inject(at = @At("HEAD"), method = "seaLevel()I", cancellable = true)
    private void seaLevel_2140724691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140724691L))
            info.setReturnValue(176600074);
    }

    @Inject(at = @At("HEAD"), method = "surfaceRule()Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private void surfaceRule_726780657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726780657L))
            info.setReturnValue(null);
    }


}
