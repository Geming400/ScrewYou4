package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.FixedPlacement.class)
public class FixedPlacement_1870092471Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type_502616639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(502616639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of([Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/levelgen/placement/FixedPlacement;", cancellable = true)
    private static void of__1479587943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1479587943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPositions(Lnet/minecraft/world/level/levelgen/placement/PlacementContext;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void getPositions__81487397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81487397L))
            info.setReturnValue(null);
    }


}
