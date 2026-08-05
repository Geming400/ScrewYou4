package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.EnvironmentScanPlacement.class)
public class EnvironmentScanPlacement792070733Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type_1453713680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1453713680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scanningFor(Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;I)Lnet/minecraft/world/level/levelgen/placement/EnvironmentScanPlacement;", cancellable = true)
    private static void scanningFor__1577881392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577881392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scanningFor(Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;I)Lnet/minecraft/world/level/levelgen/placement/EnvironmentScanPlacement;", cancellable = true)
    private static void scanningFor_1849067976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1849067976L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPositions(Lnet/minecraft/world/level/levelgen/placement/PlacementContext;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void getPositions_576688166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(576688166L))
            info.setReturnValue(null);
    }


}
