package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.hurtingprojectile.windcharge.WindCharge.class)
public class WindCharge1573860830Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1444177172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1444177172L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deflect(Lnet/minecraft/world/entity/projectile/ProjectileDeflection;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EntityReference;Z)Z", cancellable = true)
    private void deflect_827794455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(827794455L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance__1766864426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1766864426L))
            info.setReturnValue(true);
    }


}
