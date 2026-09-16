package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.placement.VegetationPlacements.class)
public class VegetationPlacements1101945916Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_547340199(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(547340199L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "worldSurfaceSquaredWithCount(I)Ljava/util/List;", cancellable = true)
    private static void worldSurfaceSquaredWithCount__527259058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527259058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "treePlacement(Lnet/minecraft/world/level/levelgen/placement/PlacementModifier;)Ljava/util/List;", cancellable = true)
    private static void treePlacement_2139130983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139130983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "treePlacement(Lnet/minecraft/world/level/levelgen/placement/PlacementModifier;Lnet/minecraft/world/level/block/Block;)Ljava/util/List;", cancellable = true)
    private static void treePlacement_999732921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999732921L))
            info.setReturnValue(null);
    }


}
