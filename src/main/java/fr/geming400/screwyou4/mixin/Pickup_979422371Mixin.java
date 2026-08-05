package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup.class)
public class Pickup_979422371Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/projectile/arrow/AbstractArrow$Pickup;", cancellable = true)
    private static void values__1707694475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707694475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/projectile/arrow/AbstractArrow$Pickup;", cancellable = true)
    private static void valueOf_1473999932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1473999932L))
            info.setReturnValue(net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup.CREATIVE_ONLY);
    }

    @Inject(at = @At("HEAD"), method = "byOrdinal(I)Lnet/minecraft/world/entity/projectile/arrow/AbstractArrow$Pickup;", cancellable = true)
    private static void byOrdinal_1743553323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743553323L))
            info.setReturnValue(net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup.ALLOWED);
    }


}
