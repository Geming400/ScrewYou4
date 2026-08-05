package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter.class)
public class SurfaceWaterDepthFilter1326595203Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type_1988238150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1988238150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forMaxDepth(I)Lnet/minecraft/world/level/levelgen/placement/SurfaceWaterDepthFilter;", cancellable = true)
    private static void forMaxDepth_396786440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(396786440L))
            info.setReturnValue(null);
    }


}
