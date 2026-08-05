package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.placement.VegetationPlacements.class)
public class VegetationPlacements1101945916Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap__90572587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-90572587L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "worldSurfaceSquaredWithCount(I)Ljava/util/List;", cancellable = true)
    private static void worldSurfaceSquaredWithCount_1986087371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1986087371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "treePlacement(Lnet/minecraft/world/level/levelgen/placement/PlacementModifier;)Ljava/util/List;", cancellable = true)
    private static void treePlacement_998427904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998427904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "treePlacement(Lnet/minecraft/world/level/levelgen/placement/PlacementModifier;Lnet/minecraft/world/level/block/Block;)Ljava/util/List;", cancellable = true)
    private static void treePlacement_1852926976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852926976L))
            info.setReturnValue(null);
    }


}
