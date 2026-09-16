package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.HeightRangePlacement.class)
public class HeightRangePlacement799099623Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type_1460742570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1460742570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/heightproviders/HeightProvider;)Lnet/minecraft/world/level/levelgen/placement/HeightRangePlacement;", cancellable = true)
    private static void of__1747274850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747274850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uniform(Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;)Lnet/minecraft/world/level/levelgen/placement/HeightRangePlacement;", cancellable = true)
    private static void uniform__377898833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377898833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triangle(Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;)Lnet/minecraft/world/level/levelgen/placement/HeightRangePlacement;", cancellable = true)
    private static void triangle_2033402075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033402075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPositions(Lnet/minecraft/world/level/levelgen/placement/PlacementContext;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void getPositions_583717056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583717056L))
            info.setReturnValue(null);
    }


}
