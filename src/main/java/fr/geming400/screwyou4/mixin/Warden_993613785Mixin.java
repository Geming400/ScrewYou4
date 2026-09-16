package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.warden.Warden.class)
public class Warden_993613785Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_957014414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(957014414L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_863930126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(863930126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearAnger(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void clearAnger_375884318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(375884318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getClientAngerLevel()I", cancellable = true)
    private void getClientAngerLevel_1367442208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1367442208L))
            info.setReturnValue(784399495);
    }

    @Inject(at = @At("HEAD"), method = "getTendrilAnimation(F)F", cancellable = true)
    private void getTendrilAnimation_711091773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(711091773L))
            info.setReturnValue(4.752325E8F);
    }

    @Inject(at = @At("HEAD"), method = "getEntityAngryAt()Ljava/util/Optional;", cancellable = true)
    private void getEntityAngryAt__120331999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-120331999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAngerManagement()Lnet/minecraft/world/entity/monster/warden/AngerManagement;", cancellable = true)
    private void getAngerManagement_810433208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810433208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "increaseAngerAt(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void increaseAngerAt_1988608092(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1988608092L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "increaseAngerAt(Lnet/minecraft/world/entity/Entity;IZ)V", cancellable = true)
    private void increaseAngerAt_297938637(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(297938637L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAngerLevel()Lnet/minecraft/world/entity/monster/warden/AngerLevel;", cancellable = true)
    private void getAngerLevel__1075382526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1075382526L))
            info.setReturnValue(net.minecraft.world.entity.monster.warden.AngerLevel.AGITATED);
    }

    @Inject(at = @At("HEAD"), method = "canTargetEntity(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void canTargetEntity_1667054124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1667054124L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setAttackTarget(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setAttackTarget_1092398454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1092398454L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeartAnimation(F)F", cancellable = true)
    private void getHeartAnimation__1239067579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1239067579L))
            info.setReturnValue(4.767406E8F);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1700348132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1700348132L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_840072342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840072342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket_2005274501(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2005274501L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ignoreExplosion(Lnet/minecraft/world/level/Explosion;)Z", cancellable = true)
    private void ignoreExplosion_63460400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63460400L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isInvulnerableTo(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void isInvulnerableTo__754834487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-754834487L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1926251522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1926251522L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1988825076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1988825076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_1909272930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909272930L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1747361900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1747361900L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dampensVibrations()Z", cancellable = true)
    private void dampensVibrations__1174933852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1174933852L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_178325931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(178325931L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPushable()Z", cancellable = true)
    private void isPushable__1401805423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1401805423L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "updateDynamicGameEventListener(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void updateDynamicGameEventListener__1252045068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1252045068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSecondsToDisableBlocking()F", cancellable = true)
    private void getSecondsToDisableBlocking_57192994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57192994L))
            info.setReturnValue(4.767406E8F);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction_1825096264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1825096264L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_807711858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807711858L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "canAttack(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void canAttack__467946377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-467946377L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue__547372398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-547372398L))
            info.setReturnValue(4.767406E8F);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway_335084074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335084074L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "applyDarknessAround(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/entity/Entity;I)V", cancellable = true)
    private static void applyDarknessAround__234479130(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-234479130L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVibrationUser()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$User;", cancellable = true)
    private void getVibrationUser_139442332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139442332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVibrationData()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$Data;", cancellable = true)
    private void getVibrationData__109669538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109669538L))
            info.setReturnValue(new net.minecraft.world.level.gameevent.vibrations.VibrationSystem.Data());
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1743712093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743712093L))
            info.setReturnValue(null);
    }


}
