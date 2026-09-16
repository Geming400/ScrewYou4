package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.AreaEffectCloud.class)
public class AreaEffectCloud870127689Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1758132374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1758132374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getOwner_1315709938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315709938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getOwner__1373346487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1373346487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOwner(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setOwner__1745707171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1745707171L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_740444031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(740444031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDuration()I", cancellable = true)
    private void getDuration__160056987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-160056987L))
            info.setReturnValue(1044060546);
    }

    @Inject(at = @At("HEAD"), method = "addEffect(Lnet/minecraft/world/effect/MobEffectInstance;)V", cancellable = true)
    private void addEffect__586187328(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-586187328L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_54840332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(54840332L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPistonPushReaction()Lnet/minecraft/world/level/material/PushReaction;", cancellable = true)
    private void getPistonPushReaction__1500826740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1500826740L))
            info.setReturnValue(net.minecraft.world.level.material.PushReaction.BLOCK);
    }

    @Inject(at = @At("HEAD"), method = "getDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDimensions_1521346352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1521346352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refreshDimensions()V", cancellable = true)
    private void refreshDimensions__1916376332(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1916376332L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1576862037(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1576862037L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPotionContents(Lnet/minecraft/world/item/alchemy/PotionContents;)V", cancellable = true)
    private void setPotionContents_2106165532(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2106165532L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getParticle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void getParticle__1953335783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1953335783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCustomParticle(Lnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private void setCustomParticle__1520669096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1520669096L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPotionDurationScale(F)V", cancellable = true)
    private void setPotionDurationScale_151905715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(151905715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDurationOnUse(I)V", cancellable = true)
    private void setDurationOnUse_1982919335(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1982919335L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDuration(I)V", cancellable = true)
    private void setDuration__1913191669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1913191669L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRadiusOnUse(F)V", cancellable = true)
    private void setRadiusOnUse__252323354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-252323354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWaitTime()I", cancellable = true)
    private void getWaitTime__201231913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-201231913L))
            info.setReturnValue(-1969462682);
    }

    @Inject(at = @At("HEAD"), method = "getRadiusPerTick()F", cancellable = true)
    private void getRadiusPerTick_367608442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(367608442L))
            info.setReturnValue(9.275621E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRadiusOnUse()F", cancellable = true)
    private void getRadiusOnUse__671203732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-671203732L))
            info.setReturnValue(9.275621E8F);
    }

    @Inject(at = @At("HEAD"), method = "setRadiusPerTick(F)V", cancellable = true)
    private void setRadiusPerTick__484832616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-484832616L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWaitTime(I)V", cancellable = true)
    private void setWaitTime_1105352921(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1105352921L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDurationOnUse()I", cancellable = true)
    private void getDurationOnUse__245609807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-245609807L))
            info.setReturnValue(-2001033781);
    }

    @Inject(at = @At("HEAD"), method = "setRadius(F)V", cancellable = true)
    private void setRadius_1696890246(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1696890246L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRadius()F", cancellable = true)
    private void getRadius_1697892452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697892452L))
            info.setReturnValue(9.275621E8F);
    }

    @Inject(at = @At("HEAD"), method = "isWaiting()Z", cancellable = true)
    private void isWaiting_1848472093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848472093L))
            info.setReturnValue(true);
    }


}
