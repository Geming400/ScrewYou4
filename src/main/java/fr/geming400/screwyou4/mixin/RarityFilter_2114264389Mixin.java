package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.RarityFilter.class)
public class RarityFilter_2114264389Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type_746788557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746788557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onAverageOnceEvery(I)Lnet/minecraft/world/level/levelgen/placement/RarityFilter;", cancellable = true)
    private static void onAverageOnceEvery__580699323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-580699323L))
            info.setReturnValue(null);
    }


}
