package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.golem.IronGolem.class)
public class IronGolem829256438Mixin {
        @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1834413291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1834413291L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "die(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void die__1341601790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1341601790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_13968585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(13968585L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1583004554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1583004554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canAttack(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void canAttack__632303723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632303723L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__2090608868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090608868L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "canSpawnSprintParticle()Z", cancellable = true)
    private void canSpawnSprintParticle__486650270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-486650270L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_1744915584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744915584L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction_1660738918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1660738918L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__1925527915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1925527915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerTarget(Lnet/minecraft/world/entity/EntityReference;)V", cancellable = true)
    private void setPersistentAngerTarget_1601942828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1601942828L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCrackiness()Lnet/minecraft/world/entity/Crackiness$Level;", cancellable = true)
    private void getCrackiness__1204540355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1204540355L))
            info.setReturnValue(net.minecraft.world.entity.Crackiness.Level.MEDIUM);
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerEndTime()J", cancellable = true)
    private void getPersistentAngerEndTime__795980305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-795980305L))
            info.setReturnValue(-3197663551551569711L);
    }

    @Inject(at = @At("HEAD"), method = "getAttackAnimationTick()I", cancellable = true)
    private void getAttackAnimationTick__522099687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-522099687L))
            info.setReturnValue(1971018908);
    }

    @Inject(at = @At("HEAD"), method = "getOfferFlowerTick()I", cancellable = true)
    private void getOfferFlowerTick__1459919938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1459919938L))
            info.setReturnValue(284079483);
    }

    @Inject(at = @At("HEAD"), method = "isPlayerCreated()Z", cancellable = true)
    private void isPlayerCreated__848014576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848014576L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "startPersistentAngerTimer()V", cancellable = true)
    private void startPersistentAngerTimer__545742062(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-545742062L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerEndTime(J)V", cancellable = true)
    private void setPersistentAngerEndTime_1929837981(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1929837981L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerTarget()Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private void getPersistentAngerTarget__590201694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590201694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offerFlower(Z)V", cancellable = true)
    private void offerFlower__1042892726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1042892726L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPlayerCreated(Z)V", cancellable = true)
    private void setPlayerCreated_1008943480(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1008943480L))
            info.cancel();
    }


}
