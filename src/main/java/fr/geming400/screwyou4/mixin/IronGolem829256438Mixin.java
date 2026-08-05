package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.golem.IronGolem.class)
public class IronGolem829256438Mixin {
        @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_379826107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379826107L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget__1821671147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1821671147L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPlayerCreated()Z", cancellable = true)
    private void isPlayerCreated_867535021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867535021L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "startPersistentAngerTimer()V", cancellable = true)
    private void startPersistentAngerTimer_867531177(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(867531177L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerEndTime()J", cancellable = true)
    private void getPersistentAngerEndTime_867519645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867519645L))
            info.setReturnValue(4420938347447850390L);
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerTarget(Lnet/minecraft/world/entity/EntityReference;)V", cancellable = true)
    private void setPersistentAngerTarget__2076134037(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2076134037L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerTarget()Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private void getPersistentAngerTarget_1692218103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692218103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCrackiness()Lnet/minecraft/world/entity/Crackiness$Level;", cancellable = true)
    private void getCrackiness_1254798713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254798713L))
            info.setReturnValue(net.minecraft.world.entity.Crackiness.Level.LOW);
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerEndTime(J)V", cancellable = true)
    private void setPersistentAngerEndTime_2044096931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2044096931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPlayerCreated(Z)V", cancellable = true)
    private void setPlayerCreated_2058873267(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2058873267L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOfferFlowerTick()I", cancellable = true)
    private void getOfferFlowerTick_867518684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867518684L))
            info.setReturnValue(1462171714);
    }

    @Inject(at = @At("HEAD"), method = "getAttackAnimationTick()I", cancellable = true)
    private void getAttackAnimationTick_867518684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867518684L))
            info.setReturnValue(1462171714);
    }

    @Inject(at = @At("HEAD"), method = "offerFlower(Z)V", cancellable = true)
    private void offerFlower_2058873267(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2058873267L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canSpawnSprintParticle()Z", cancellable = true)
    private void canSpawnSprintParticle_867535021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867535021L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_2036708763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2036708763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_129037993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(129037993L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction_1866410649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866410649L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_867531177(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(867531177L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "die(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void die_497582978(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(497582978L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canAttack(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void canAttack_1150923613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150923613L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset_1926985967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1926985967L))
            info.setReturnValue(null);
    }


}
