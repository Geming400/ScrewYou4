package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.axolotl.Axolotl.class)
public class Axolotl1536101285Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1092158778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1092158778L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_1499501915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499501915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/axolotl/Axolotl$Variant;", cancellable = true)
    private void getVariant_1904779674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904779674L))
            info.setReturnValue(net.minecraft.world.entity.animal.axolotl.Axolotl.Variant.CYAN);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_720813432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720813432L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1383764021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1383764021L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "canBeSeenAsEnemy()Z", cancellable = true)
    private void canBeSeenAsEnemy__1003279084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1003279084L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "playAttackSound()V", cancellable = true)
    private void playAttackSound_1542591077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1542591077L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPushedByFluid()Z", cancellable = true)
    private void isPushedByFluid__1222028244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1222028244L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1763654719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1763654719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxAirSupply()I", cancellable = true)
    private void getMaxAirSupply__1771205600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1771205600L))
            info.setReturnValue(64911491);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed__411970829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-411970829L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_1350199359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350199359L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "baseTick()V", cancellable = true)
    private void baseTick_1198812938(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1198812938L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1675856425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1675856425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue__4884897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-4884897L))
            info.setReturnValue(6.99635E7F);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__749710483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-749710483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadXRot()I", cancellable = true)
    private void getMaxHeadXRot__442964706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-442964706L))
            info.setReturnValue(1313931886);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway_877571575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(877571575L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "requiresCustomPersistence()Z", cancellable = true)
    private void requiresCustomPersistence_1229601020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1229601020L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_2044548127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044548127L))
            info.setReturnValue(-778845569);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction__1927383531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1927383531L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPickupSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getPickupSound_2045968170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2045968170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playAmbientSound()V", cancellable = true)
    private void playAmbientSound_1012797069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1012797069L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__2008767702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2008767702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1511974873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511974873L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fromBucket()Z", cancellable = true)
    private void fromBucket__530744408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530744408L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "saveToBucketTag(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void saveToBucketTag__1582688219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1582688219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFromBucket(Z)V", cancellable = true)
    private void setFromBucket__1091342824(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1091342824L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBucketItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBucketItemStack_1740450046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1740450046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadFromBucketTag(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void loadFromBucketTag__647960349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-647960349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onStopAttacking(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/animal/axolotl/Axolotl;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void onStopAttacking_2013430336(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2013430336L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkAxolotlSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkAxolotlSpawnRules_204879827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(204879827L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPlayingDead()Z", cancellable = true)
    private void isPlayingDead_1890362420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1890362420L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "applySupportingEffects(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void applySupportingEffects__1029072718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1029072718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPlayingDead(Z)V", cancellable = true)
    private void setPlayingDead__2008022446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2008022446L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rehydrate()V", cancellable = true)
    private void rehydrate_12060440(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(12060440L))
            info.cancel();
    }


}
