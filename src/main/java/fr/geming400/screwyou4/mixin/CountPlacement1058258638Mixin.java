package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.CountPlacement.class)
public class CountPlacement1058258638Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type__309217193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-309217193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(I)Lnet/minecraft/world/level/levelgen/placement/CountPlacement;", cancellable = true)
    private static void of__734506596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-734506596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/util/valueproviders/IntProvider;)Lnet/minecraft/world/level/levelgen/placement/CountPlacement;", cancellable = true)
    private static void of__51648961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-51648961L))
            info.setReturnValue(null);
    }


}
