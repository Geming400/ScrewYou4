package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.FireworkRocketEntity.class)
public class FireworkRocketEntity558923808Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_429240150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(429240150L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(DDD)Z", cancellable = true)
    private void shouldRender_711666292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(711666292L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance_1513165848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1513165848L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1312671924(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1312671924L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAttackable()Z", cancellable = true)
    private void isAttackable_1399741675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399741675L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "calculateHorizontalHurtKnockbackDirection(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/damagesource/DamageSource;)Lit/unimi/dsi/fastutil/doubles/DoubleDoubleImmutablePair;", cancellable = true)
    private void calculateHorizontalHurtKnockbackDirection_1657170200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657170200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isShotAtAngle()Z", cancellable = true)
    private void isShotAtAngle__1768852773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1768852773L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_64758477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(64758477L))
            info.setReturnValue(null);
    }


}
