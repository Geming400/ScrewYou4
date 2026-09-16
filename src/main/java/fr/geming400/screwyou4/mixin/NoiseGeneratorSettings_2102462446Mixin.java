package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.NoiseGeneratorSettings.class)
public class NoiseGeneratorSettings_2102462446Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1193836177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1193836177L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1422081326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1422081326L))
            info.setReturnValue("2uF\u2159A+,aeE`Z@(>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1635152760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1635152760L))
            info.setReturnValue(1192149480);
    }

    @Inject(at = @At("HEAD"), method = "dummy()Lnet/minecraft/world/level/levelgen/NoiseGeneratorSettings;", cancellable = true)
    private static void dummy_129200766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(129200766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_1547856728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1547856728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "defaultBlock()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void defaultBlock__1344948825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1344948825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useLegacyRandomSource()Z", cancellable = true)
    private void useLegacyRandomSource__1218065578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218065578L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "spawnTarget()Ljava/util/List;", cancellable = true)
    private void spawnTarget_1408749833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1408749833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noiseSettings()Lnet/minecraft/world/level/levelgen/NoiseSettings;", cancellable = true)
    private void noiseSettings_1050487202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050487202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultFluid()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void defaultFluid__1172522204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172522204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disableMobGeneration()Z", cancellable = true)
    private void disableMobGeneration__808810124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-808810124L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "oreVeinsEnabled()Z", cancellable = true)
    private void oreVeinsEnabled__224610112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224610112L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "noiseRouter()Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private void noiseRouter__721693918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721693918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aquifersEnabled()Z", cancellable = true)
    private void aquifersEnabled__1049783001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1049783001L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAquifersEnabled()Z", cancellable = true)
    private void isAquifersEnabled__1564304015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1564304015L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRandomSource()Lnet/minecraft/world/level/levelgen/WorldgenRandom$Algorithm;", cancellable = true)
    private void getRandomSource_2038550858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2038550858L))
            info.setReturnValue(net.minecraft.world.level.levelgen.WorldgenRandom.Algorithm.LEGACY);
    }

    @Inject(at = @At("HEAD"), method = "surfaceRule()Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private void surfaceRule_1342430266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342430266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seaLevel()I", cancellable = true)
    private void seaLevel__1779722626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1779722626L))
            info.setReturnValue(-1200379281);
    }


}
