package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.EvokerFangs.class)
public class EvokerFangs1429038967Mixin {
        @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getOwner__814435209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-814435209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getOwner_1874621216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874621216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOwner(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setOwner__1186795893(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1186795893L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1299355309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1299355309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_613751114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613751114L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__2112180213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2112180213L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAnimationProgress(F)F", cancellable = true)
    private void getAnimationProgress_1629180139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629180139L))
            info.setReturnValue(9.529193E8F);
    }


}
