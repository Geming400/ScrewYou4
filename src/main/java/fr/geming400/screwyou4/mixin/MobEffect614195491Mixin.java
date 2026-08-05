package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.effect.MobEffect.class)
public class MobEffect614195491Mixin {
        @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1562713674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1562713674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCategory()Lnet/minecraft/world/effect/MobEffectCategory;", cancellable = true)
    private void getCategory__1790848849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790848849L))
            info.setReturnValue(net.minecraft.world.effect.MobEffectCategory.BENEFICIAL);
    }

    @Inject(at = @At("HEAD"), method = "getColor()I", cancellable = true)
    private void getColor_652457737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652457737L))
            info.setReturnValue(-138774667);
    }

    @Inject(at = @At("HEAD"), method = "addAttributeModifier(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;DLnet/minecraft/world/entity/ai/attributes/AttributeModifier$Operation;)Lnet/minecraft/world/effect/MobEffect;", cancellable = true)
    private void addAttributeModifier_2028276299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2028276299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlendDuration(III)Lnet/minecraft/world/effect/MobEffect;", cancellable = true)
    private void setBlendDuration__1363882540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1363882540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlendDuration(I)Lnet/minecraft/world/effect/MobEffect;", cancellable = true)
    private void setBlendDuration_1656559284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1656559284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSoundOnAdded(Lnet/minecraft/sounds/SoundEvent;)Lnet/minecraft/world/effect/MobEffect;", cancellable = true)
    private void withSoundOnAdded__887033608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-887033608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures([Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/effect/MobEffect;", cancellable = true)
    private void requiredFeatures__35344125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-35344125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void requiredFeatures_1279015989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1279015989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createModifiers(ILjava/util/function/BiConsumer;)V", cancellable = true)
    private void createModifiers__882827872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-882827872L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeAttributeModifiers(Lnet/minecraft/world/entity/ai/attributes/AttributeMap;)V", cancellable = true)
    private void removeAttributeModifiers_1506031585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1506031585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createParticleOptions(Lnet/minecraft/world/effect/MobEffectInstance;)Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void createParticleOptions_2073743393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073743393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlendInDurationTicks()I", cancellable = true)
    private void getBlendInDurationTicks_652457737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652457737L))
            info.setReturnValue(-138774667);
    }

    @Inject(at = @At("HEAD"), method = "onEffectStarted(Lnet/minecraft/world/entity/LivingEntity;I)V", cancellable = true)
    private void onEffectStarted_2023224223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2023224223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlendOutDurationTicks()I", cancellable = true)
    private void getBlendOutDurationTicks_652457737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652457737L))
            info.setReturnValue(-138774667);
    }

    @Inject(at = @At("HEAD"), method = "addAttributeModifiers(Lnet/minecraft/world/entity/ai/attributes/AttributeMap;I)V", cancellable = true)
    private void addAttributeModifiers__1776256604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1776256604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlendOutAdvanceTicks()I", cancellable = true)
    private void getBlendOutAdvanceTicks_652457737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652457737L))
            info.setReturnValue(-138774667);
    }

    @Inject(at = @At("HEAD"), method = "applyInstantaneousEffect(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/LivingEntity;ID)V", cancellable = true)
    private void applyInstantaneousEffect__1409949424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1409949424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBeneficial()Z", cancellable = true)
    private void isBeneficial_652474074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652474074L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "applyEffectTick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void applyEffectTick__309276876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-309276876L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onEffectAdded(Lnet/minecraft/world/entity/LivingEntity;I)V", cancellable = true)
    private void onEffectAdded_2023224223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2023224223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onMobRemoved(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/entity/Entity$RemovalReason;)V", cancellable = true)
    private void onMobRemoved_557731849(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(557731849L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInstantaneous()Z", cancellable = true)
    private void isInstantaneous_652474074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652474074L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onMobHurt(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/damagesource/DamageSource;F)V", cancellable = true)
    private void onMobHurt__264786067(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-264786067L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldApplyEffectTickThisTick(II)Z", cancellable = true)
    private void shouldApplyEffectTickThisTick__381680134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381680134L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDescriptionId()Ljava/lang/String;", cancellable = true)
    private void getDescriptionId__521264980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-521264980L))
            info.setReturnValue("7=ZlM>尷ϝpY<䈵<k隸^^!&诖Q6mฝ-{렜YhMd q⚰6ᤒb9꺬O^jc%-w⒎1\"Zjf: 訫)a7-c1bwhh_XsnmmMPG>CE;\" 5[+dBRaO'Z");
    }


}
