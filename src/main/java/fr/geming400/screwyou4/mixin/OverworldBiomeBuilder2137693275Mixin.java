package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.OverworldBiomeBuilder.class)
public class OverworldBiomeBuilder2137693275Mixin {
        @Inject(at = @At("HEAD"), method = "spawnTarget()Ljava/util/List;", cancellable = true)
    private void spawnTarget_1443980663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1443980663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDebugStringForErosion(D)Ljava/lang/String;", cancellable = true)
    private void getDebugStringForErosion__944712652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944712652L))
            info.setReturnValue("DPu`M;nzyQ8-\u3785.*Tn4SZ\u55DDy-");
    }

    @Inject(at = @At("HEAD"), method = "getDebugStringForHumidity(D)Ljava/lang/String;", cancellable = true)
    private void getDebugStringForHumidity__1859876094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1859876094L))
            info.setReturnValue("ot\u731B>+>^QOB\u6D9A0):");
    }

    @Inject(at = @At("HEAD"), method = "getHumidityThresholds()[Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void getHumidityThresholds_1616591896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616591896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWeirdnessThresholds()[Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void getWeirdnessThresholds__381290339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381290339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getErosionThresholds()[Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void getErosionThresholds_2006636240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006636240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTemperatureThresholds()[Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void getTemperatureThresholds__120818451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-120818451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDeepDarkRegion(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)Z", cancellable = true)
    private static void isDeepDarkRegion__720188039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-720188039L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDebugStringForPeaksAndValleys(D)Ljava/lang/String;", cancellable = true)
    private static void getDebugStringForPeaksAndValleys_1557962322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1557962322L))
            info.setReturnValue(">#X,m0i]Z/uaGR/\u84B9\u8093E:6*\u110EtkBHdKF\u9C62&");
    }

    @Inject(at = @At("HEAD"), method = "getDebugStringForContinentalness(D)Ljava/lang/String;", cancellable = true)
    private void getDebugStringForContinentalness__438440523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-438440523L))
            info.setReturnValue("*#\u6DEE\u0488t\"M(Y7. lMdm%RcUn&/9{ 8KXLB");
    }

    @Inject(at = @At("HEAD"), method = "getDebugStringForTemperature(D)Ljava/lang/String;", cancellable = true)
    private void getDebugStringForTemperature__1561868361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1561868361L))
            info.setReturnValue("X*'l+3bS{iPzsi&A_ -#K0{FtB]2J\u9A84+$\uB2C51)7\u453B'7\u835CXn\u4359\u07E5g{4#_\"n%S#RJ2e=\u5112!'D0\uD183lQ\uA772tcxM4lc");
    }

    @Inject(at = @At("HEAD"), method = "getContinentalnessThresholds()[Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void getContinentalnessThresholds__1437892177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1437892177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPeaksAndValleysThresholds()[Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void getPeaksAndValleysThresholds_1056267498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1056267498L))
            info.setReturnValue(null);
    }


}
