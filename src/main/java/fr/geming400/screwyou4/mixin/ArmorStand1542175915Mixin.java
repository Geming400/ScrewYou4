package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.ArmorStand.class)
public class ArmorStand1542175915Mixin {
        @Inject(at = @At("HEAD"), method = "kill(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void kill_563766575(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(563766575L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showBasePlate()Z", cancellable = true)
    private void showBasePlate_1580454498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580454498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showArms()Z", cancellable = true)
    private void showArms_1580454498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580454498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeSeenByAnyone()Z", cancellable = true)
    private void canBeSeenByAnyone_1580454498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580454498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInvisible(Z)V", cancellable = true)
    private void setInvisible__1523174552(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1523174552L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "refreshDimensions()V", cancellable = true)
    private void refreshDimensions_1580450654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1580450654L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFallSounds()Lnet/minecraft/world/entity/LivingEntity$Fallsounds;", cancellable = true)
    private void getFallSounds__104851299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-104851299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1545339056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1545339056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setYBodyRot(F)V", cancellable = true)
    private void setYBodyRot__1541644972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1541644972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setYHeadRot(F)V", cancellable = true)
    private void setYHeadRot__1541644972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1541644972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAffectedByPotions()Z", cancellable = true)
    private void isAffectedByPotions_1580454498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580454498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightProbePosition(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLightProbePosition__727643622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-727643622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance__1543488170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1543488170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skipAttackInteraction(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void skipAttackInteraction_1090455099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090455099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isIgnoringBlockTriggers()Z", cancellable = true)
    private void isIgnoringBlockTriggers_1580454498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580454498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_2065594575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2065594575L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignoreExplosion(Lnet/minecraft/world/level/Explosion;)Z", cancellable = true)
    private void ignoreExplosion__768056480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-768056480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPistonPushReaction()Lnet/minecraft/world/level/material/PushReaction;", cancellable = true)
    private void getPistonPushReaction__861912544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861912544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEffectiveAi()Z", cancellable = true)
    private void isEffectiveAi_1580454498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580454498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1107041937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1107041937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_299529871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(299529871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBaby()Z", cancellable = true)
    private void isBaby_1580454498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580454498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMainArm()Lnet/minecraft/world/entity/HumanoidArm;", cancellable = true)
    private void getMainArm__1044040619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1044040619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1092745584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1092745584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSmall()Z", cancellable = true)
    private void isSmall_1580454498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580454498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot__1757423520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757423520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "travel(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void travel_1909911914(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1909911914L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable_1580454498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580454498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attackable()Z", cancellable = true)
    private void attackable_1580454498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580454498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPushable()Z", cancellable = true)
    private void isPushable_1580454498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580454498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thunderHit(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LightningBolt;)V", cancellable = true)
    private void thunderHit_612155898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(612155898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact__760725679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760725679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_841957470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(841957470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isMarker()Z", cancellable = true)
    private void isMarker_1580454498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580454498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRightLegPose()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void getRightLegPose_1497927744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497927744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBodyPose()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void getBodyPose_1497927744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497927744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRightArmPose()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void getRightArmPose_1497927744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497927744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLeftLegPose()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void getLeftLegPose_1497927744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497927744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLeftArmPose()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void getLeftArmPose_1497927744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497927744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeadPose()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void getHeadPose_1497927744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497927744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLeftArmPose(Lnet/minecraft/core/Rotations;)V", cancellable = true)
    private void setLeftArmPose__486048268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-486048268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRightLegPose(Lnet/minecraft/core/Rotations;)V", cancellable = true)
    private void setRightLegPose__486048268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-486048268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLeftLegPose(Lnet/minecraft/core/Rotations;)V", cancellable = true)
    private void setLeftLegPose__486048268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-486048268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHeadPose(Lnet/minecraft/core/Rotations;)V", cancellable = true)
    private void setHeadPose__486048268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-486048268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBodyPose(Lnet/minecraft/core/Rotations;)V", cancellable = true)
    private void setBodyPose__486048268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-486048268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setArmorStandPose(Lnet/minecraft/world/entity/decoration/ArmorStand$ArmorStandPose;)V", cancellable = true)
    private void setArmorStandPose_209229956(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(209229956L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setShowArms(Z)V", cancellable = true)
    private void setShowArms__1523174552(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1523174552L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setNoBasePlate(Z)V", cancellable = true)
    private void setNoBasePlate__1523174552(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1523174552L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRightArmPose(Lnet/minecraft/core/Rotations;)V", cancellable = true)
    private void setRightArmPose__486048268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-486048268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getArmorStandPose()Lnet/minecraft/world/entity/decoration/ArmorStand$ArmorStandPose;", cancellable = true)
    private void getArmorStandPose__1262676354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1262676354L))
            info.setReturnValue(null);
    }


}
