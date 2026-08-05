package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.FireworkRocketEntity.class)
public class FireworkRocketEntity558923808Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_597198547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(597198547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1082342468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082342468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(DDD)Z", cancellable = true)
    private void shouldRender__511479221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-511479221L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance_1768227019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768227019L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1766376133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1766376133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAttackable()Z", cancellable = true)
    private void isAttackable_597202391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597202391L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "calculateHorizontalHurtKnockbackDirection(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/damagesource/DamageSource;)Lit/unimi/dsi/fastutil/doubles/DoubleDoubleImmutablePair;", cancellable = true)
    private void calculateHorizontalHurtKnockbackDirection_412378677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(412378677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isShotAtAngle()Z", cancellable = true)
    private void isShotAtAngle_597202391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597202391L))
            info.setReturnValue(false);
    }


}
