package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.HeightRangePlacement.class)
public class HeightRangePlacement799099623Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type__568376208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-568376208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/heightproviders/HeightProvider;)Lnet/minecraft/world/level/levelgen/placement/HeightRangePlacement;", cancellable = true)
    private static void of_73217671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73217671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uniform(Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;)Lnet/minecraft/world/level/levelgen/placement/HeightRangePlacement;", cancellable = true)
    private static void uniform_1822170595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822170595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triangle(Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;)Lnet/minecraft/world/level/levelgen/placement/HeightRangePlacement;", cancellable = true)
    private static void triangle_1822170595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822170595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPositions(Lnet/minecraft/world/level/levelgen/placement/PlacementContext;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void getPositions__1152480244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1152480244L))
            info.setReturnValue(null);
    }


}
