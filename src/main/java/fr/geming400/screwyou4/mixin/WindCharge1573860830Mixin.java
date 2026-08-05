package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.hurtingprojectile.windcharge.WindCharge.class)
public class WindCharge1573860830Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1612135569(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1612135569L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance__1511803255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1511803255L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "deflect(Lnet/minecraft/world/entity/projectile/ProjectileDeflection;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EntityReference;Z)Z", cancellable = true)
    private void deflect__149018266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-149018266L))
            info.setReturnValue(false);
    }


}
