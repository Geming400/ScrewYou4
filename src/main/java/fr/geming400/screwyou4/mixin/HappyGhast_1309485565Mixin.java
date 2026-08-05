package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.happyghast.HappyGhast.class)
public class HappyGhast_1309485565Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1179801906(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1179801906L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "supportQuadLeashAsHolder()Z", cancellable = true)
    private void supportQuadLeashAsHolder__1087113490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1087113490L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFlyingVehicle()Z", cancellable = true)
    private void isFlyingVehicle__2061457664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061457664L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "notifyLeashHolder(Lnet/minecraft/world/entity/Leashable;)V", cancellable = true)
    private void notifyLeashHolder__2113841886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2113841886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadLeashHolderOffsets()[Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getQuadLeashHolderOffsets__1759931696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759931696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onClimbable()Z", cancellable = true)
    private void onClimbable_2015661891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015661891L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1610379742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610379742L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getVoicePitch()F", cancellable = true)
    private void getVoicePitch_2050847227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2050847227L))
            info.setReturnValue(7.92828E7F);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1990270440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1990270440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAgeScale()F", cancellable = true)
    private void getAgeScale_673269822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(673269822L))
            info.setReturnValue(7.92828E7F);
    }

    @Inject(at = @At("HEAD"), method = "canBreatheUnderwater()Z", cancellable = true)
    private void canBreatheUnderwater_307126015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307126015L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addAdditionalSaveData(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void addAdditionalSaveData__1287328973(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1287328973L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readAdditionalSaveData(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void readAdditionalSaveData__532345007(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-532345007L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeCollidedWith(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void canBeCollidedWith_1559754283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1559754283L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getControllingPassenger()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getControllingPassenger__2096394116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096394116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "travel(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void travel__1235822379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1235822379L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__1471224533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1471224533L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.MUSIC);
    }

    @Inject(at = @At("HEAD"), method = "getDismountLocationForPassenger(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getDismountLocationForPassenger__1920374356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1920374356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leashSnapDistance()D", cancellable = true)
    private void leashSnapDistance_98836929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98836929L))
            info.setReturnValue(7.92828007065945E7D);
    }

    @Inject(at = @At("HEAD"), method = "getMaxSpawnClusterSize()I", cancellable = true)
    private void getMaxSpawnClusterSize_1061798836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1061798836L))
            info.setReturnValue(1212368846);
    }

    @Inject(at = @At("HEAD"), method = "onElasticLeashPull()V", cancellable = true)
    private void onElasticLeashPull_2125441347(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2125441347L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__1445298789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1445298789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1354184165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1354184165L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_1123583638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123583638L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot_1385059036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1385059036L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue__231500618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-231500618L))
            info.setReturnValue(7.92828E7F);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__976326204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-976326204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1449240704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449240704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leashElasticDistance()D", cancellable = true)
    private void leashElasticDistance__2029665424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2029665424L))
            info.setReturnValue(7.928280070724656E7D);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSoundInterval()I", cancellable = true)
    private void getAmbientSoundInterval_1130363760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130363760L))
            info.setReturnValue(1488703639);
    }

    @Inject(at = @At("HEAD"), method = "canFallInLove()Z", cancellable = true)
    private void canFallInLove_1631379313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631379313L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isLeashHolder()Z", cancellable = true)
    private void isLeashHolder__3831756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-3831756L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isOnStillTimeout()Z", cancellable = true)
    private void isOnStillTimeout__1338723567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338723567L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1285359152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285359152L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "staysStill()Z", cancellable = true)
    private void staysStill__212334619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-212334619L))
            info.setReturnValue(false);
    }


}
