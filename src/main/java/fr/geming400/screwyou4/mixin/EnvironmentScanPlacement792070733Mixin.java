package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.EnvironmentScanPlacement.class)
public class EnvironmentScanPlacement792070733Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type__575405098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-575405098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scanningFor(Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;I)Lnet/minecraft/world/level/levelgen/placement/EnvironmentScanPlacement;", cancellable = true)
    private static void scanningFor_1589556264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589556264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scanningFor(Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;I)Lnet/minecraft/world/level/levelgen/placement/EnvironmentScanPlacement;", cancellable = true)
    private static void scanningFor__530110608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530110608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPositions(Lnet/minecraft/world/level/levelgen/placement/PlacementContext;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void getPositions__1159509134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1159509134L))
            info.setReturnValue(null);
    }


}
