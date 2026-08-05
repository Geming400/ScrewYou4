package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.axolotl.Axolotl.class)
public class Axolotl1536101285Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1373008880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1373008880L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_803863170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803863170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/axolotl/Axolotl$Variant;", cancellable = true)
    private void getVariant__979616823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-979616823L))
            info.setReturnValue(net.minecraft.world.entity.animal.axolotl.Axolotl.Variant.BLUE);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1086670954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1086670954L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "saveToBucketTag(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void saveToBucketTag__1024334723(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1024334723L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFromBucket(Z)V", cancellable = true)
    private void setFromBucket__1529249182(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1529249182L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBucketItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBucketItemStack_2059519945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059519945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadFromBucketTag(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void loadFromBucketTag_2097009507(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2097009507L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playAttackSound()V", cancellable = true)
    private void playAttackSound_1574376024(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1574376024L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxAirSupply()I", cancellable = true)
    private void getMaxAirSupply_1574363531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574363531L))
            info.setReturnValue(1902087206);
    }

    @Inject(at = @At("HEAD"), method = "isPushedByFluid()Z", cancellable = true)
    private void isPushedByFluid_1574379868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574379868L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_1574379868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574379868L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canBeSeenAsEnemy()Z", cancellable = true)
    private void canBeSeenAsEnemy_1574379868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574379868L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_835882840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(835882840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_293455241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293455241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiresCustomPersistence()Z", cancellable = true)
    private void requiresCustomPersistence_1574379868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574379868L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway__1549562800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1549562800L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_1574363531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574363531L))
            info.setReturnValue(1902087206);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction__1721711800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1721711800L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "baseTick()V", cancellable = true)
    private void baseTick_1574376024(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1574376024L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rehydrate()V", cancellable = true)
    private void rehydrate_1574376024(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1574376024L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadXRot()I", cancellable = true)
    private void getMaxHeadXRot_1574363531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574363531L))
            info.setReturnValue(1902087206);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1142040169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1142040169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue_1750412256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750412256L))
            info.setReturnValue(1.222772E8F);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1161206389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1161206389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__1165889153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1165889153L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "getPickupSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getPickupSound__1668653113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668653113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__1024330879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1024330879L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fromBucket()Z", cancellable = true)
    private void fromBucket_1574379868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574379868L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPlayingDead()Z", cancellable = true)
    private void isPlayingDead_1574379868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574379868L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setPlayingDead(Z)V", cancellable = true)
    private void setPlayingDead__1529249182(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1529249182L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onStopAttacking(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/animal/axolotl/Axolotl;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void onStopAttacking__1786377927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1786377927L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkAxolotlSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkAxolotlSpawnRules__249275782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-249275782L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "applySupportingEffects(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void applySupportingEffects__1818264365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1818264365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__910134073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910134073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playAmbientSound()V", cancellable = true)
    private void playAmbientSound_1574376024(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1574376024L))
            info.cancel();
    }


}
