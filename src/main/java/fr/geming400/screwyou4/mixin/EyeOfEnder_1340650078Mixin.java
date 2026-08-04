package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.EyeOfEnder.class)
public class EyeOfEnder_1340650078Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1378924816(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1378924816L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1864068737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1864068737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem__1219785931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1219785931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightLevelDependentMagicValue()F", cancellable = true)
    private void getLightLevelDependentMagicValue_1378909440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378909440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance__1745014008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745014008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAttackable()Z", cancellable = true)
    private void isAttackable_1378928660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378928660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_891219746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891219746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "signalTo(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void signalTo_1708386076(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1708386076L))
            info.cancel();
    }


}
