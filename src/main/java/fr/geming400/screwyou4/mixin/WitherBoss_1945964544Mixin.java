package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.wither.WitherBoss.class)
public class WitherBoss_1945964544Mixin {
        @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack__942744584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-942744584L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1245746098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245746098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCustomName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setCustomName_44785606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(44785606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeStuckInBlock(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void makeStuckInBlock__1030380625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1030380625L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startSeenByPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void startSeenByPlayer_1176402690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1176402690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopSeenByPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void stopSeenByPlayer_1176402690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1176402690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkDespawn()V", cancellable = true)
    private void checkDespawn_1984239282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1984239282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInvulnerableTicks()I", cancellable = true)
    private void getInvulnerableTicks_1984226789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984226789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeadYRots()[F", cancellable = true)
    private void getHeadYRots__1163164279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163164279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeadXRots()[F", cancellable = true)
    private void getHeadXRots__1163164279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163164279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1984239282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1984239282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1496534212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496534212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addEffect(Lnet/minecraft/world/effect/MobEffectInstance;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void addEffect_2106649657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106649657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPowered()Z", cancellable = true)
    private void isPowered_1984243126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984243126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeAffected(Lnet/minecraft/world/effect/MobEffectInstance;)Z", cancellable = true)
    private void canBeAffected_2101836620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101836620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canUsePortal(Z)Z", cancellable = true)
    private void canUsePortal__1119382080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1119382080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canDestroy(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void canDestroy_1800675805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1800675805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAlternativeTarget(I)I", cancellable = true)
    private void getAlternativeTarget__1135098274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135098274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAlternativeTarget(II)V", cancellable = true)
    private void setAlternativeTarget_950085074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(950085074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setInvulnerableTicks(I)V", cancellable = true)
    private void setInvulnerableTicks__1135085781(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1135085781L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeInvulnerable()V", cancellable = true)
    private void makeInvulnerable_1984239282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1984239282L))
            info.cancel();
    }


}
