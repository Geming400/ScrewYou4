package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.BiomeColors.class)
public class BiomeColors531417218Mixin {
        @Inject(at = @At("HEAD"), method = "getAverageGrassColor(Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getAverageGrassColor__568576633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-568576633L))
            info.setReturnValue(-1913591278);
    }

    @Inject(at = @At("HEAD"), method = "getAverageFoliageColor(Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getAverageFoliageColor__1810402844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1810402844L))
            info.setReturnValue(977360124);
    }

    @Inject(at = @At("HEAD"), method = "getAverageWaterColor(Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getAverageWaterColor__1467576826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1467576826L))
            info.setReturnValue(-1727008978);
    }

    @Inject(at = @At("HEAD"), method = "getAverageDryFoliageColor(Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getAverageDryFoliageColor__279701375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-279701375L))
            info.setReturnValue(515303368);
    }


}
