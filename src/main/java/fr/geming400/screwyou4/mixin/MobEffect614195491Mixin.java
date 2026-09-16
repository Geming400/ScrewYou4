package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.effect.MobEffect.class)
public class MobEffect614195491Mixin {
        @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName_1794607661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1794607661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()I", cancellable = true)
    private void getColor_1553098108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1553098108L))
            info.setReturnValue(-1968946221);
    }

    @Inject(at = @At("HEAD"), method = "onMobRemoved(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/entity/Entity$RemovalReason;)V", cancellable = true)
    private void onMobRemoved__1579091576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1579091576L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeAttributeModifiers(Lnet/minecraft/world/entity/ai/attributes/AttributeMap;)V", cancellable = true)
    private void removeAttributeModifiers__171359547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-171359547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onEffectStarted(Lnet/minecraft/world/entity/LivingEntity;I)V", cancellable = true)
    private void onEffectStarted_530228590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(530228590L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onEffectAdded(Lnet/minecraft/world/entity/LivingEntity;I)V", cancellable = true)
    private void onEffectAdded__378556657(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-378556657L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addAttributeModifiers(Lnet/minecraft/world/entity/ai/attributes/AttributeMap;I)V", cancellable = true)
    private void addAttributeModifiers__1480010365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1480010365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onMobHurt(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/damagesource/DamageSource;F)V", cancellable = true)
    private void onMobHurt_371133725(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(371133725L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCategory()Lnet/minecraft/world/effect/MobEffectCategory;", cancellable = true)
    private void getCategory__1690974685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1690974685L))
            info.setReturnValue(net.minecraft.world.effect.MobEffectCategory.HARMFUL);
    }

    @Inject(at = @At("HEAD"), method = "shouldApplyEffectTickThisTick(II)Z", cancellable = true)
    private void shouldApplyEffectTickThisTick__1594568106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1594568106L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures([Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/effect/MobEffect;", cancellable = true)
    private void requiredFeatures__2038479993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2038479993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void requiredFeatures__289423175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289423175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addAttributeModifier(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;DLnet/minecraft/world/entity/ai/attributes/AttributeModifier$Operation;)Lnet/minecraft/world/effect/MobEffect;", cancellable = true)
    private void addAttributeModifier_1361588541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1361588541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlendDuration(III)Lnet/minecraft/world/effect/MobEffect;", cancellable = true)
    private void setBlendDuration_1057290993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1057290993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlendDuration(I)Lnet/minecraft/world/effect/MobEffect;", cancellable = true)
    private void setBlendDuration_1484777233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1484777233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSoundOnAdded(Lnet/minecraft/sounds/SoundEvent;)Lnet/minecraft/world/effect/MobEffect;", cancellable = true)
    private void withSoundOnAdded__1010267200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1010267200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createModifiers(ILjava/util/function/BiConsumer;)V", cancellable = true)
    private void createModifiers__2006632768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2006632768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyInstantaneousEffect(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/LivingEntity;ID)V", cancellable = true)
    private void applyInstantaneousEffect__2100800055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2100800055L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBeneficial()Z", cancellable = true)
    private void isBeneficial__1742441214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742441214L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBlendOutAdvanceTicks()I", cancellable = true)
    private void getBlendOutAdvanceTicks_1065004546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1065004546L))
            info.setReturnValue(35885804);
    }

    @Inject(at = @At("HEAD"), method = "createParticleOptions(Lnet/minecraft/world/effect/MobEffectInstance;)Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void createParticleOptions__679056195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-679056195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlendInDurationTicks()I", cancellable = true)
    private void getBlendInDurationTicks_1668085831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1668085831L))
            info.setReturnValue(-1858568730);
    }

    @Inject(at = @At("HEAD"), method = "isInstantaneous()Z", cancellable = true)
    private void isInstantaneous__1183017010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1183017010L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "applyEffectTick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void applyEffectTick__1692058920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692058920L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBlendOutDurationTicks()I", cancellable = true)
    private void getBlendOutDurationTicks__538481894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-538481894L))
            info.setReturnValue(1552428492);
    }

    @Inject(at = @At("HEAD"), method = "getDescriptionId()Ljava/lang/String;", cancellable = true)
    private void getDescriptionId__722922387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-722922387L))
            info.setReturnValue("\u0F36u[EBs-pGxI%/\u4AFA0xI\u7596MMI{LD\u2DCAW 2JQj2$5{T4\u4607CTc%4qND\"g\u3350|boK6v\u3C810n(*N5+aP0A%*nhV.$e/(`o8Z");
    }


}
