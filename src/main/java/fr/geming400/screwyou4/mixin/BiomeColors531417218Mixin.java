package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.BiomeColors.class)
public class BiomeColors531417218Mixin {
        @Inject(at = @At("HEAD"), method = "getAverageGrassColor(Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getAverageGrassColor__348584461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-348584461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAverageFoliageColor(Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getAverageFoliageColor__348584461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-348584461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAverageWaterColor(Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getAverageWaterColor__348584461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-348584461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAverageDryFoliageColor(Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getAverageDryFoliageColor__348584461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-348584461L))
            info.setReturnValue(null);
    }


}
