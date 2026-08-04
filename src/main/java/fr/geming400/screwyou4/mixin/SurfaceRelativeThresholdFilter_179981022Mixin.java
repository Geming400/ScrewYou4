package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.SurfaceRelativeThresholdFilter.class)
public class SurfaceRelativeThresholdFilter_179981022Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type__1187494810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1187494810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/Heightmap$Types;II)Lnet/minecraft/world/level/levelgen/placement/SurfaceRelativeThresholdFilter;", cancellable = true)
    private static void of__571804470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-571804470L))
            info.setReturnValue(null);
    }


}
