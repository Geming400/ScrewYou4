package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup.class)
public class Pickup_979422371Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/projectile/arrow/AbstractArrow$Pickup;", cancellable = true)
    private static void values_1038278103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038278103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/projectile/arrow/AbstractArrow$Pickup;", cancellable = true)
    private static void valueOf_1132964116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132964116L))
            info.setReturnValue(net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup.DISALLOWED);
    }

    @Inject(at = @At("HEAD"), method = "byOrdinal(I)Lnet/minecraft/world/entity/projectile/arrow/AbstractArrow$Pickup;", cancellable = true)
    private static void byOrdinal_939584133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939584133L))
            info.setReturnValue(net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup.ALLOWED);
    }


}
