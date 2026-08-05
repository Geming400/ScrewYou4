package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.EvokerFangs.class)
public class EvokerFangs1429038967Mixin {
        @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getOwner_696800852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(696800852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getOwner__1036910915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1036910915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOwner(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setOwner_1750702298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1750702298L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1467313706(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1467313706L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1658476004(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1658476004L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_979608636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979608636L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAnimationProgress(F)F", cancellable = true)
    private void getAnimationProgress__1654797296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654797296L))
            info.setReturnValue(2.13631E8F);
    }


}
