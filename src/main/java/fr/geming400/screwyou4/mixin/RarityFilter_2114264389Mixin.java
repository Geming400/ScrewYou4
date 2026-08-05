package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.RarityFilter.class)
public class RarityFilter_2114264389Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type__1519059961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519059961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onAverageOnceEvery(I)Lnet/minecraft/world/level/levelgen/placement/RarityFilter;", cancellable = true)
    private static void onAverageOnceEvery_1256206017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1256206017L))
            info.setReturnValue(null);
    }


}
