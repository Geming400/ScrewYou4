package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.CountOnEveryLayerPlacement.class)
public class CountOnEveryLayerPlacement817369945Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type_1479012892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479012892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(I)Lnet/minecraft/world/level/levelgen/placement/CountOnEveryLayerPlacement;", cancellable = true)
    private static void of_1084943251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1084943251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/util/valueproviders/IntProvider;)Lnet/minecraft/world/level/levelgen/placement/CountOnEveryLayerPlacement;", cancellable = true)
    private static void of__1980468362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980468362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPositions(Lnet/minecraft/world/level/levelgen/placement/PlacementContext;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void getPositions_601987378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(601987378L))
            info.setReturnValue(null);
    }


}
