package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.effect.MobEffectInstance.class)
public class MobEffectInstance_753271144Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__155355621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155355621L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1523694172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1523694172L))
            info.setReturnValue("Rz-c!rHt*S\u3358R7=\uFC2Eb.d$I\u77DDs<:}w0,\u72AAjJBil?fFLH\uC5B4*!iM#BC29\u9082]BS]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1310622738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1310622738L))
            info.setReturnValue(-1024801366);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/world/effect/MobEffectInstance;)I", cancellable = true)
    private void compareTo__1671699805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1671699805L))
            info.setReturnValue(660751114);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__1138832791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138832791L))
            info.setReturnValue(184294204);
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/world/effect/MobEffectInstance;)Z", cancellable = true)
    private void update_151415115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151415115L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void is_587484183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587484183L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDuration()I", cancellable = true)
    private void getDuration__276913533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-276913533L))
            info.setReturnValue(-1404121215);
    }

    @Inject(at = @At("HEAD"), method = "getEffect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getEffect_313543676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(313543676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAmplifier()I", cancellable = true)
    private void getAmplifier__253136782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-253136782L))
            info.setReturnValue(-104251720);
    }

    @Inject(at = @At("HEAD"), method = "onMobRemoved(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/Entity$RemovalReason;)V", cancellable = true)
    private void onMobRemoved__1799823895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1799823895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getParticleOptions()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void getParticleOptions__1905859395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905859395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlendFactor(Lnet/minecraft/world/entity/LivingEntity;F)F", cancellable = true)
    private void getBlendFactor_1016619078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1016619078L))
            info.setReturnValue(4.99617E7F);
    }

    @Inject(at = @At("HEAD"), method = "onEffectAdded(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void onEffectAdded__526562982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-526562982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyBlendState(Lnet/minecraft/world/effect/MobEffectInstance;)V", cancellable = true)
    private void copyBlendState_994003835(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(994003835L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onEffectStarted(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void onEffectStarted__635794661(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-635794661L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAmbient()Z", cancellable = true)
    private void isAmbient_576845264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(576845264L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onMobHurt(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/damagesource/DamageSource;F)V", cancellable = true)
    private void onMobHurt__353342042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-353342042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isVisible()Z", cancellable = true)
    private void isVisible__298217418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-298217418L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tickClient()V", cancellable = true)
    private void tickClient_1377557842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1377557842L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Ljava/lang/Runnable;)Z", cancellable = true)
    private void tickServer_189870939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189870939L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "showIcon()Z", cancellable = true)
    private void showIcon__1331490872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1331490872L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "endsWithin(I)Z", cancellable = true)
    private void endsWithin_1646105306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646105306L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDescriptionId()Ljava/lang/String;", cancellable = true)
    private void getDescriptionId__583846735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-583846735L))
            info.setReturnValue("Ay5hde]i<\u3907Cgo:>(\u9723}&%z2HW(1]Hx]\u48B08&\u1EB4#X\u39094<gq#\uBF56bZ<)\uBEAAyp1\u4230j\u7163");
    }

    @Inject(at = @At("HEAD"), method = "isInfiniteDuration()Z", cancellable = true)
    private void isInfiniteDuration__255333044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-255333044L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mapDuration(Lit/unimi/dsi/fastutil/ints/Int2IntFunction;)I", cancellable = true)
    private void mapDuration__946245346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-946245346L))
            info.setReturnValue(441659402);
    }

    @Inject(at = @At("HEAD"), method = "skipBlending()V", cancellable = true)
    private void skipBlending__1027261046(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1027261046L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withScaledDuration(F)Lnet/minecraft/world/effect/MobEffectInstance;", cancellable = true)
    private void withScaledDuration__325604142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-325604142L))
            info.setReturnValue(null);
    }


}
