package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.happyghast.HappyGhast.class)
public class HappyGhast_1309485565Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1347760303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1347760303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAgeScale()F", cancellable = true)
    private void getAgeScale_1347744927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347744927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__983562409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-983562409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVoicePitch()F", cancellable = true)
    private void getVoicePitch_1347744927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347744927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onClimbable()Z", cancellable = true)
    private void onClimbable_1347764147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347764147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getControllingPassenger()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getControllingPassenger_577247449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(577247449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeCollidedWith(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void canBeCollidedWith_857764748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857764748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "supportQuadLeashAsHolder()Z", cancellable = true)
    private void supportQuadLeashAsHolder_1347764147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347764147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notifyLeashHolder(Lnet/minecraft/world/entity/Leashable;)V", cancellable = true)
    private void notifyLeashHolder_1234704514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1234704514L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFlyingVehicle()Z", cancellable = true)
    private void isFlyingVehicle_1347764147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347764147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuadLeashHolderOffsets()[Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getQuadLeashHolderOffsets_275319964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(275319964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDismountLocationForPassenger(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getDismountLocationForPassenger__1975286107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1975286107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addAdditionalSaveData(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void addAdditionalSaveData_90354212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(90354212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readAdditionalSaveData(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void readAdditionalSaveData_1540722197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1540722197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_66839520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66839520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBreatheUnderwater()Z", cancellable = true)
    private void canBreatheUnderwater_1347764147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347764147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1347760303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1347760303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__1392504874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1392504874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot__1990113871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1990113871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "travel(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void travel_1677221563(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1677221563L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_609267119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609267119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isLeashHolder()Z", cancellable = true)
    private void isLeashHolder_1347764147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347764147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__1887752203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1887752203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__1250946600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250946600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "staysStill()Z", cancellable = true)
    private void staysStill_1347764147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347764147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOnStillTimeout()Z", cancellable = true)
    private void isOnStillTimeout_1347764147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347764147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leashSnapDistance()D", cancellable = true)
    private void leashSnapDistance_1347743005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347743005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onElasticLeashPull()V", cancellable = true)
    private void onElasticLeashPull_1347760303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1347760303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxSpawnClusterSize()I", cancellable = true)
    private void getMaxSpawnClusterSize_1347747810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347747810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1387822110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1387822110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leashElasticDistance()D", cancellable = true)
    private void leashElasticDistance_1347743005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347743005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue_1523796535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1523796535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1368655890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1368655890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSoundInterval()I", cancellable = true)
    private void getAmbientSoundInterval_1347747810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347747810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canFallInLove()Z", cancellable = true)
    private void canFallInLove_1347764147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347764147L))
            info.setReturnValue(null);
    }


}
