package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.NoiseThresholdCountPlacement.class)
public class NoiseThresholdCountPlacement_601682401Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type__765793431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-765793431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(DII)Lnet/minecraft/world/level/levelgen/placement/NoiseThresholdCountPlacement;", cancellable = true)
    private static void of__486747176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-486747176L))
            info.setReturnValue(null);
    }


}
