package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.EyeOfEnder.class)
public class EyeOfEnder_1340650078Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1210966419(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1210966419L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_846484746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846484746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_525362224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525362224L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isAttackable()Z", cancellable = true)
    private void isAttackable__2113499352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113499352L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance__2000075179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2000075179L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_344919104(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(344919104L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "signalTo(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void signalTo__1475792673(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1475792673L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightLevelDependentMagicValue()F", cancellable = true)
    private void getLightLevelDependentMagicValue__881234207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-881234207L))
            info.setReturnValue(9.929217E8F);
    }


}
