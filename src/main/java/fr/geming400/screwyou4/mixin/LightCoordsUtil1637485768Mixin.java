package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.LightCoordsUtil.class)
public class LightCoordsUtil1637485768Mixin {
        @Inject(at = @At("HEAD"), method = "max(II)I", cancellable = true)
    private static void max_150877410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(150877410L))
            info.setReturnValue(1123137780);
    }

    @Inject(at = @At("HEAD"), method = "block(I)I", cancellable = true)
    private static void block_1249389292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1249389292L))
            info.setReturnValue(1078649842);
    }

    @Inject(at = @At("HEAD"), method = "pack(II)I", cancellable = true)
    private static void pack__1682656627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682656627L))
            info.setReturnValue(1084812621);
    }

    @Inject(at = @At("HEAD"), method = "sky(I)I", cancellable = true)
    private static void sky__1331534720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1331534720L))
            info.setReturnValue(-1968552582);
    }

    @Inject(at = @At("HEAD"), method = "lightCoordsWithEmission(II)I", cancellable = true)
    private static void lightCoordsWithEmission__1332831163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1332831163L))
            info.setReturnValue(-1045409155);
    }

    @Inject(at = @At("HEAD"), method = "smoothWeightedBlend(IIIIFFFF)I", cancellable = true)
    private static void smoothWeightedBlend__427058054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-427058054L))
            info.setReturnValue(592578275);
    }

    @Inject(at = @At("HEAD"), method = "smoothBlend(IIII)I", cancellable = true)
    private static void smoothBlend__1749705213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749705213L))
            info.setReturnValue(-1544842589);
    }

    @Inject(at = @At("HEAD"), method = "withBlock(II)I", cancellable = true)
    private static void withBlock__1820757633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820757633L))
            info.setReturnValue(1257102067);
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(Lnet/minecraft/world/level/BlockAndLightGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getLightCoords__417047776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417047776L))
            info.setReturnValue(311478647);
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(Lnet/minecraft/util/LightCoordsUtil$BrightnessGetter;Lnet/minecraft/world/level/BlockAndLightGetter;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getLightCoords_1312063329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1312063329L))
            info.setReturnValue(-1786359623);
    }

    @Inject(at = @At("HEAD"), method = "addSmoothBlockEmission(IF)I", cancellable = true)
    private static void addSmoothBlockEmission__2054763298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2054763298L))
            info.setReturnValue(1367568773);
    }

    @Inject(at = @At("HEAD"), method = "smoothPack(II)I", cancellable = true)
    private static void smoothPack_1600138239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1600138239L))
            info.setReturnValue(-1173597140);
    }

    @Inject(at = @At("HEAD"), method = "smoothSky(I)I", cancellable = true)
    private static void smoothSky_660705906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(660705906L))
            info.setReturnValue(-1747398126);
    }

    @Inject(at = @At("HEAD"), method = "smoothBlock(I)I", cancellable = true)
    private static void smoothBlock_237216862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(237216862L))
            info.setReturnValue(-84940115);
    }


}
