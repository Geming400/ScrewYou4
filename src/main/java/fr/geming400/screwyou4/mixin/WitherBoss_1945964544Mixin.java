package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.wither.WitherBoss.class)
public class WitherBoss_1945964544Mixin {
        @Inject(at = @At("HEAD"), method = "addEffect(Lnet/minecraft/world/effect/MobEffectInstance;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void addEffect__1325374389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1325374389L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__717705186(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-717705186L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1130676690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130676690L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBeAffected(Lnet/minecraft/world/effect/MobEffectInstance;)Z", cancellable = true)
    private void canBeAffected_330617893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(330617893L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "makeStuckInBlock(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void makeStuckInBlock_1618504297(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1618504297L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__973900763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-973900763L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setCustomName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setCustomName__1431066264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1431066264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startSeenByPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void startSeenByPlayer_1213462903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1213462903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopSeenByPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void stopSeenByPlayer__864717545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-864717545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkDespawn()V", cancellable = true)
    private void checkDespawn__608754560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-608754560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUsePortal(Z)Z", cancellable = true)
    private void canUsePortal_1086374499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1086374499L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getInvulnerableTicks()I", cancellable = true)
    private void getInvulnerableTicks__1208105422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1208105422L))
            info.setReturnValue(1879266268);
    }

    @Inject(at = @At("HEAD"), method = "getAlternativeTarget(I)I", cancellable = true)
    private void getAlternativeTarget__1157705914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1157705914L))
            info.setReturnValue(-501930684);
    }

    @Inject(at = @At("HEAD"), method = "setAlternativeTarget(II)V", cancellable = true)
    private void setAlternativeTarget__1096285450(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1096285450L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeInvulnerable()V", cancellable = true)
    private void makeInvulnerable_306254935(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(306254935L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setInvulnerableTicks(I)V", cancellable = true)
    private void setInvulnerableTicks__940898830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-940898830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeadYRots()[F", cancellable = true)
    private void getHeadYRots__1075539160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1075539160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeadXRots()[F", cancellable = true)
    private void getHeadXRots_721412199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(721412199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canDestroy(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void canDestroy__581873517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-581873517L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack__966069240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-966069240L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPowered()Z", cancellable = true)
    private void isPowered_245976604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(245976604L))
            info.setReturnValue(true);
    }


}
