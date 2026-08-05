package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.FixedPlacement.class)
public class FixedPlacement_1870092471Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type__1763231879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1763231879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of([Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/levelgen/placement/FixedPlacement;", cancellable = true)
    private static void of__873171230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873171230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPositions(Lnet/minecraft/world/level/levelgen/placement/PlacementContext;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void getPositions_1654709903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1654709903L))
            info.setReturnValue(null);
    }


}
