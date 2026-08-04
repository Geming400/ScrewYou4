package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.effect.MobEffectInstance.class)
public class MobEffectInstance_753271144Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2138782906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138782906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__382189328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-382189328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_791533389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791533389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/world/effect/MobEffectInstance;)I", cancellable = true)
    private void compareTo_909126883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(909126883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo_2138895529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138895529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/world/effect/MobEffectInstance;)Z", cancellable = true)
    private void update_909143220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(909143220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void is__1995217171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1995217171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDuration()I", cancellable = true)
    private void getDuration_791533389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791533389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isVisible()Z", cancellable = true)
    private void isVisible_791549726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791549726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAmbient()Z", cancellable = true)
    private void isAmbient_791549726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791549726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapDuration(Lit/unimi/dsi/fastutil/ints/Int2IntFunction;)I", cancellable = true)
    private void mapDuration_2040064558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2040064558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withScaledDuration(F)Lnet/minecraft/world/effect/MobEffectInstance;", cancellable = true)
    private void withScaledDuration__1539867706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1539867706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skipBlending()V", cancellable = true)
    private void skipBlending_791545882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(791545882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInfiniteDuration()Z", cancellable = true)
    private void isInfiniteDuration_791549726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791549726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAmplifier()I", cancellable = true)
    private void getAmplifier_791533389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791533389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endsWithin(I)Z", cancellable = true)
    private void endsWithin_1967191959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1967191959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showIcon()Z", cancellable = true)
    private void showIcon_791549726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791549726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onMobHurt(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/damagesource/DamageSource;F)V", cancellable = true)
    private void onMobHurt_1427259734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1427259734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickClient()V", cancellable = true)
    private void tickClient_791545882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(791545882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Ljava/lang/Runnable;)Z", cancellable = true)
    private void tickServer__577486821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-577486821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEffect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getEffect__1992820381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1992820381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDescriptionId()Ljava/lang/String;", cancellable = true)
    private void getDescriptionId__382189328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-382189328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onMobRemoved(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/Entity$RemovalReason;)V", cancellable = true)
    private void onMobRemoved_1594241864(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1594241864L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getParticleOptions()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void getParticleOptions__1315689925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1315689925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onEffectAdded(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void onEffectAdded_1074934474(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1074934474L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onEffectStarted(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void onEffectStarted_1074934474(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1074934474L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlendFactor(Lnet/minecraft/world/entity/LivingEntity;F)F", cancellable = true)
    private void getBlendFactor__2135453360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2135453360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyBlendState(Lnet/minecraft/world/effect/MobEffectInstance;)V", cancellable = true)
    private void copyBlendState_909139376(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(909139376L))
            info.cancel();
    }


}
