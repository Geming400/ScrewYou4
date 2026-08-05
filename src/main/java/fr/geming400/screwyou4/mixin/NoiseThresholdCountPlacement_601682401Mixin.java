package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.NoiseThresholdCountPlacement.class)
public class NoiseThresholdCountPlacement_601682401Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type_1263325347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263325347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(DII)Lnet/minecraft/world/level/levelgen/placement/NoiseThresholdCountPlacement;", cancellable = true)
    private static void of__703626769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-703626769L))
            info.setReturnValue(null);
    }


}
