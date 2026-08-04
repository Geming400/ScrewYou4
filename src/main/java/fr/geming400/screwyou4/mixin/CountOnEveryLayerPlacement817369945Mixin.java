package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.CountOnEveryLayerPlacement.class)
public class CountOnEveryLayerPlacement817369945Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type__550105886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-550105886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(I)Lnet/minecraft/world/level/levelgen/placement/CountOnEveryLayerPlacement;", cancellable = true)
    private static void of_701995516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701995516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/util/valueproviders/IntProvider;)Lnet/minecraft/world/level/levelgen/placement/CountOnEveryLayerPlacement;", cancellable = true)
    private static void of_2067419679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067419679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPositions(Lnet/minecraft/world/level/levelgen/placement/PlacementContext;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void getPositions__1134209922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1134209922L))
            info.setReturnValue(null);
    }


}
