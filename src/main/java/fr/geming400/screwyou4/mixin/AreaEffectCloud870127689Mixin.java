package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.AreaEffectCloud.class)
public class AreaEffectCloud870127689Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_707035284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707035284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getOwner__1595822193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1595822193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getOwner_137889574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(137889574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOwner(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setOwner_1191791020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1191791020L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_908402428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(908402428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDuration()I", cancellable = true)
    private void getDuration_908389935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908389935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDuration(I)V", cancellable = true)
    private void setDuration_2084044661(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2084044661L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPotionContents(Lnet/minecraft/world/item/alchemy/PotionContents;)V", cancellable = true)
    private void setPotionContents_1566318477(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1566318477L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCustomParticle(Lnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private void setCustomParticle__694145775(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-694145775L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRadiusOnUse()F", cancellable = true)
    private void getRadiusOnUse_908387052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908387052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDurationOnUse(I)V", cancellable = true)
    private void setDurationOnUse_2084044661(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2084044661L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRadiusOnUse(F)V", cancellable = true)
    private void setRadiusOnUse_2081274098(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2081274098L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDurationOnUse()I", cancellable = true)
    private void getDurationOnUse_908389935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908389935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPotionDurationScale(F)V", cancellable = true)
    private void setPotionDurationScale_2081274098(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2081274098L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWaitTime()I", cancellable = true)
    private void getWaitTime_908389935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908389935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRadiusPerTick(F)V", cancellable = true)
    private void setRadiusPerTick_2081274098(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2081274098L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWaitTime(I)V", cancellable = true)
    private void setWaitTime_2084044661(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2084044661L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRadiusPerTick()F", cancellable = true)
    private void getRadiusPerTick_908387052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908387052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParticle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void getParticle__1198833379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1198833379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRadius()F", cancellable = true)
    private void getRadius_908387052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908387052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPistonPushReaction()Lnet/minecraft/world/level/material/PushReaction;", cancellable = true)
    private void getPistonPushReaction__1533960770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1533960770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_420697854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420697854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addEffect(Lnet/minecraft/world/effect/MobEffectInstance;)V", cancellable = true)
    private void addEffect_1025995922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1025995922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1779090163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1779090163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "refreshDimensions()V", cancellable = true)
    private void refreshDimensions_908402428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(908402428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDimensions__372518355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-372518355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWaiting()Z", cancellable = true)
    private void isWaiting_908406272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908406272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRadius(F)V", cancellable = true)
    private void setRadius_2081274098(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2081274098L))
            info.cancel();
    }


}
