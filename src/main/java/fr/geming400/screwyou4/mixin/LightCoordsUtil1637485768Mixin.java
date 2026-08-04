package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.LightCoordsUtil.class)
public class LightCoordsUtil1637485768Mixin {
        @Inject(at = @At("HEAD"), method = "max(II)I", cancellable = true)
    private static void max_641594054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641594054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block(I)I", cancellable = true)
    private static void block__1443576801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1443576801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack(II)I", cancellable = true)
    private static void pack_641594054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641594054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sky(I)I", cancellable = true)
    private static void sky__1443576801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1443576801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(Lnet/minecraft/world/level/BlockAndLightGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getLightCoords__1852416258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1852416258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(Lnet/minecraft/util/LightCoordsUtil$BrightnessGetter;Lnet/minecraft/world/level/BlockAndLightGetter;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getLightCoords_1437068739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437068739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addSmoothBlockEmission(IF)I", cancellable = true)
    private static void addSmoothBlockEmission_638823491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(638823491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withBlock(II)I", cancellable = true)
    private static void withBlock_641594054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641594054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightCoordsWithEmission(II)I", cancellable = true)
    private static void lightCoordsWithEmission_641594054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641594054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smoothWeightedBlend(IIIIFFFF)I", cancellable = true)
    private static void smoothWeightedBlend__1756403866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1756403866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smoothBlend(IIII)I", cancellable = true)
    private static void smoothBlend__1043154458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1043154458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smoothPack(II)I", cancellable = true)
    private static void smoothPack_641594054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641594054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smoothSky(I)I", cancellable = true)
    private static void smoothSky__1443576801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1443576801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smoothBlock(I)I", cancellable = true)
    private static void smoothBlock__1443576801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1443576801L))
            info.setReturnValue(null);
    }


}
