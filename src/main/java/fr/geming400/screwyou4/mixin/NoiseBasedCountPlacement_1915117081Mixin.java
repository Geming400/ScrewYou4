package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.NoiseBasedCountPlacement.class)
public class NoiseBasedCountPlacement_1915117081Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type__1718207269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1718207269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(IDD)Lnet/minecraft/world/level/levelgen/placement/NoiseBasedCountPlacement;", cancellable = true)
    private static void of__1335861436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1335861436L))
            info.setReturnValue(null);
    }


}
