package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.CountPlacement.class)
public class CountPlacement1058258638Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type_1719901585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1719901585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(I)Lnet/minecraft/world/level/levelgen/placement/CountPlacement;", cancellable = true)
    private static void of_922750387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(922750387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/util/valueproviders/IntProvider;)Lnet/minecraft/world/level/levelgen/placement/CountPlacement;", cancellable = true)
    private static void of__578547178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578547178L))
            info.setReturnValue(null);
    }


}
