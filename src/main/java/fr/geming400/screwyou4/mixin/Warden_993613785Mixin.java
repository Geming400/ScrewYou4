package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.warden.Warden.class)
public class Warden_993613785Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_261375669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(261375669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1031888523(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1031888523L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTendrilAnimation(F)F", cancellable = true)
    private void getTendrilAnimation__2090222479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090222479L))
            info.setReturnValue(3.929309E8F);
    }

    @Inject(at = @At("HEAD"), method = "getHeartAnimation(F)F", cancellable = true)
    private void getHeartAnimation__2090222479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090222479L))
            info.setReturnValue(3.939323E8F);
    }

    @Inject(at = @At("HEAD"), method = "getClientAngerLevel()I", cancellable = true)
    private void getClientAngerLevel_1031876030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031876030L))
            info.setReturnValue(1063864687);
    }

    @Inject(at = @At("HEAD"), method = "increaseAngerAt(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void increaseAngerAt_541889124(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(541889124L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "increaseAngerAt(Lnet/minecraft/world/entity/Entity;IZ)V", cancellable = true)
    private void increaseAngerAt_1570414293(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1570414293L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAttackTarget(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setAttackTarget_1315277115(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1315277115L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAngerManagement()Lnet/minecraft/world/entity/monster/warden/AngerManagement;", cancellable = true)
    private void getAngerManagement_1145313964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145313964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityAngryAt()Ljava/util/Optional;", cancellable = true)
    private void getEntityAngryAt_1239075206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1239075206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAngerLevel()Lnet/minecraft/world/entity/monster/warden/AngerLevel;", cancellable = true)
    private void getAngerLevel__1807633137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807633137L))
            info.setReturnValue(net.minecraft.world.entity.monster.warden.AngerLevel.AGITATED);
    }

    @Inject(at = @At("HEAD"), method = "canTargetEntity(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void canTargetEntity_541892968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541892968L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "updateDynamicGameEventListener(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void updateDynamicGameEventListener__744537106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-744537106L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSecondsToDisableBlocking()F", cancellable = true)
    private void getSecondsToDisableBlocking_1031873147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031873147L))
            info.setReturnValue(3.939323E8F);
    }

    @Inject(at = @At("HEAD"), method = "isPushable()Z", cancellable = true)
    private void isPushable_1031892367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031892367L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__1708376654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1708376654L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "canAttack(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void canAttack_1315280959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315280959L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget__1657313801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657313801L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "dampensVibrations()Z", cancellable = true)
    private void dampensVibrations_1031892367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031892367L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__2093901187(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2093901187L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1655604068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1655604068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket__195174906(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-195174906L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ignoreExplosion(Lnet/minecraft/world/level/Explosion;)Z", cancellable = true)
    private void ignoreExplosion__1316618611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1316618611L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_1373640768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1373640768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInvulnerableTo(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void isInvulnerableTo_562683255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562683255L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_293395339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293395339L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__249032260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-249032260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_544183453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(544183453L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getVibrationUser()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$User;", cancellable = true)
    private void getVibrationUser_11134595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(11134595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVibrationData()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$Data;", cancellable = true)
    private void getVibrationData_1601462852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601462852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction_2030767995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2030767995L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue_1207924755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207924755L))
            info.setReturnValue(3.949294E8F);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway__2092050301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2092050301L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "applyDarknessAround(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/entity/Entity;I)V", cancellable = true)
    private static void applyDarknessAround_411985886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(411985886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearAnger(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void clearAnger_541889124(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(541889124L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1452621574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1452621574L))
            info.setReturnValue(null);
    }


}
