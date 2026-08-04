package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.NoiseBasedCountPlacement.class)
public class NoiseBasedCountPlacement_1915117081Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type_547641249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(547641249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(IDD)Lnet/minecraft/world/level/levelgen/placement/NoiseBasedCountPlacement;", cancellable = true)
    private static void of__1718809171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1718809171L))
            info.setReturnValue(null);
    }


}
