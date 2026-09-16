package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.ArmorStand.class)
public class ArmorStand1542175915Mixin {
        @Inject(at = @At("HEAD"), method = "kill(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void kill_1915882129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1915882129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_726888062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726888062L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact_534925787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534925787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable__10358467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-10358467L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isMarker()Z", cancellable = true)
    private void isMarker_307326686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307326686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "travel(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void travel__1003132028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1003132028L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMainArm()Lnet/minecraft/world/entity/HumanoidArm;", cancellable = true)
    private void getMainArm__1988602238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1988602238L))
            info.setReturnValue(net.minecraft.world.entity.HumanoidArm.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "isSmall()Z", cancellable = true)
    private void isSmall_595478149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595478149L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot_1617749387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617749387L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPushable()Z", cancellable = true)
    private void isPushable__853243292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-853243292L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "attackable()Z", cancellable = true)
    private void attackable_1598302208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1598302208L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "skipAttackInteraction(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void skipAttackInteraction__1758727642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1758727642L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1377689391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1377689391L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getPistonPushReaction()Lnet/minecraft/world/level/material/PushReaction;", cancellable = true)
    private void getPistonPushReaction__828778514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-828778514L))
            info.setReturnValue(net.minecraft.world.level.material.PushReaction.NORMAL);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1999043265(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1999043265L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEffectiveAi()Z", cancellable = true)
    private void isEffectiveAi_77361373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(77361373L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFallSounds()Lnet/minecraft/world/entity/LivingEntity$Fallsounds;", cancellable = true)
    private void getFallSounds__1310957006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1310957006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1757580089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757580089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInvisible(Z)V", cancellable = true)
    private void setInvisible_1239296147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1239296147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "refreshDimensions()V", cancellable = true)
    private void refreshDimensions__1244328106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1244328106L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeSeenByAnyone()Z", cancellable = true)
    private void canBeSeenByAnyone_1476610595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1476610595L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "ignoreExplosion(Lnet/minecraft/world/level/Explosion;)Z", cancellable = true)
    private void ignoreExplosion_612022531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(612022531L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isIgnoringBlockTriggers()Z", cancellable = true)
    private void isIgnoringBlockTriggers_335106867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335106867L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isAffectedByPotions()Z", cancellable = true)
    private void isAffectedByPotions_1296943223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1296943223L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setYHeadRot(F)V", cancellable = true)
    private void setYHeadRot__1834501900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1834501900L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setYBodyRot(F)V", cancellable = true)
    private void setYBodyRot_289040242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(289040242L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__2046057033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2046057033L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightProbePosition(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLightProbePosition__1571985645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1571985645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance__1798549341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1798549341L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_1597105251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597105251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRightLegPose(Lnet/minecraft/core/Rotations;)V", cancellable = true)
    private void setRightLegPose__576854961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-576854961L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setNoBasePlate(Z)V", cancellable = true)
    private void setNoBasePlate__301355478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-301355478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setShowArms(Z)V", cancellable = true)
    private void setShowArms_1331841950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1331841950L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLeftLegPose(Lnet/minecraft/core/Rotations;)V", cancellable = true)
    private void setLeftLegPose__1046288834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1046288834L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBodyPose()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void getBodyPose__15499063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-15499063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRightArmPose()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void getRightArmPose__1062967225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062967225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBodyPose(Lnet/minecraft/core/Rotations;)V", cancellable = true)
    private void setBodyPose__1472904705(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1472904705L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHeadPose(Lnet/minecraft/core/Rotations;)V", cancellable = true)
    private void setHeadPose__227245055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-227245055L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRightArmPose(Lnet/minecraft/core/Rotations;)V", cancellable = true)
    private void setRightArmPose__1155895231(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1155895231L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLeftArmPose()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void getLeftArmPose_1325633040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325633040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLeftArmPose(Lnet/minecraft/core/Rotations;)V", cancellable = true)
    private void setLeftArmPose__1625329104(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1625329104L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeadPose()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void getHeadPose_717420167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(717420167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLeftLegPose()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void getLeftLegPose_928669762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928669762L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArmorStandPose()Lnet/minecraft/world/entity/decoration/ArmorStand$ArmorStandPose;", cancellable = true)
    private void getArmorStandPose_1987763520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1987763520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showBasePlate()Z", cancellable = true)
    private void showBasePlate__1230508262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1230508262L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRightLegPose()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void getRightLegPose__1459930503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1459930503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setArmorStandPose(Lnet/minecraft/world/entity/decoration/ArmorStand$ArmorStandPose;)V", cancellable = true)
    private void setArmorStandPose__1329039090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1329039090L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBaby()Z", cancellable = true)
    private void isBaby__778918590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-778918590L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "showArms()Z", cancellable = true)
    private void showArms__227362642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-227362642L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "thunderHit(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LightningBolt;)V", cancellable = true)
    private void thunderHit_641103115(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(641103115L))
            info.cancel();
    }


}
