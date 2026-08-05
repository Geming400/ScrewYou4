package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement.class)
public class RandomOffsetPlacement_802581695Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type__564894137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-564894137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/util/valueproviders/IntProvider;Lnet/minecraft/util/valueproviders/IntProvider;)Lnet/minecraft/world/level/levelgen/placement/RandomOffsetPlacement;", cancellable = true)
    private static void of_920506886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(920506886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontal(Lnet/minecraft/util/valueproviders/IntProvider;)Lnet/minecraft/world/level/levelgen/placement/RandomOffsetPlacement;", cancellable = true)
    private static void horizontal_1676758378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676758378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPositions(Lnet/minecraft/world/level/levelgen/placement/PlacementContext;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void getPositions__1148998173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148998173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofTriangle(II)Lnet/minecraft/world/level/levelgen/placement/RandomOffsetPlacement;", cancellable = true)
    private static void ofTriangle__1545370778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1545370778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vertical(Lnet/minecraft/util/valueproviders/IntProvider;)Lnet/minecraft/world/level/levelgen/placement/RandomOffsetPlacement;", cancellable = true)
    private static void vertical_1676758378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676758378L))
            info.setReturnValue(null);
    }


}
