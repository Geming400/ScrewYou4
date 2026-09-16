package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement.class)
public class RandomOffsetPlacement_802581695Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type_1464224641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1464224641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/util/valueproviders/IntProvider;Lnet/minecraft/util/valueproviders/IntProvider;)Lnet/minecraft/world/level/levelgen/placement/RandomOffsetPlacement;", cancellable = true)
    private static void of__1784981859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1784981859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vertical(Lnet/minecraft/util/valueproviders/IntProvider;)Lnet/minecraft/world/level/levelgen/placement/RandomOffsetPlacement;", cancellable = true)
    private static void vertical_1968433460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968433460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofTriangle(II)Lnet/minecraft/world/level/levelgen/placement/RandomOffsetPlacement;", cancellable = true)
    private static void ofTriangle__173290075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-173290075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontal(Lnet/minecraft/util/valueproviders/IntProvider;)Lnet/minecraft/world/level/levelgen/placement/RandomOffsetPlacement;", cancellable = true)
    private static void horizontal_688457926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688457926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPositions(Lnet/minecraft/world/level/levelgen/placement/PlacementContext;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void getPositions_587199127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587199127L))
            info.setReturnValue(null);
    }


}
