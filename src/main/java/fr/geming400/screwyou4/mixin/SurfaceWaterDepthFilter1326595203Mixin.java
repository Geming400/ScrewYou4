package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter.class)
public class SurfaceWaterDepthFilter1326595203Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type__40880628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-40880628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forMaxDepth(I)Lnet/minecraft/world/level/levelgen/placement/SurfaceWaterDepthFilter;", cancellable = true)
    private static void forMaxDepth_1350082480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350082480L))
            info.setReturnValue(null);
    }


}
