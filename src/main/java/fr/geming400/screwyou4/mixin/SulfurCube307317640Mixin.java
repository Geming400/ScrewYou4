package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.cubemob.SulfurCube.class)
public class SulfurCube307317640Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1974024873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1974024873L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "setSize(IZ)V", cancellable = true)
    private void setSize_24115209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(24115209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_177633982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(177633982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__507970213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-507970213L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "maxUpStep()F", cancellable = true)
    private void maxUpStep_1295006336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1295006336L))
            info.setReturnValue(1.169504E8F);
    }

    @Inject(at = @At("HEAD"), method = "knockback(DDDLnet/minecraft/world/damagesource/DamageSource;FZ)V", cancellable = true)
    private void knockback__708734631(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-708734631L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot_382891112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382891112L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canFreeze()Z", cancellable = true)
    private void canFreeze__142716136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-142716136L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "playerTouch(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void playerTouch_259204120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(259204120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource_1821574839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1821574839L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.WEATHER);
    }

    @Inject(at = @At("HEAD"), method = "getFluidJumpThreshold()D", cancellable = true)
    private void getFluidJumpThreshold__2045752288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2045752288L))
            info.setReturnValue(1.1695040038146457E8D);
    }

    @Inject(at = @At("HEAD"), method = "canBreatheUnderwater()Z", cancellable = true)
    private void canBreatheUnderwater__695041909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695041909L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canPickUpLoot()Z", cancellable = true)
    private void canPickUpLoot__682825109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-682825109L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getEquipmentSlotForItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private void getEquipmentSlotForItem__1501506906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1501506906L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.SADDLE);
    }

    @Inject(at = @At("HEAD"), method = "isEquippableInSlot(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void isEquippableInSlot_861287803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861287803L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1014051988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1014051988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed__1640754474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1640754474L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canBePickedFromInside()Z", cancellable = true)
    private void canBePickedFromInside__1030686298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1030686298L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPrimed()Z", cancellable = true)
    private void isPrimed_1102852880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102852880L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canExplode()Z", cancellable = true)
    private void canExplode__1849005842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1849005842L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "primeTime(Z)Z", cancellable = true)
    private void primeTime_718918197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718918197L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "equipItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void equipItem_1581440865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581440865L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasBodyItem()Z", cancellable = true)
    private void hasBodyItem__1596154352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1596154352L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matchingArchetypes(Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;", cancellable = true)
    private void matchingArchetypes__2054861094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2054861094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkSulfurCubeSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkSulfurCubeSpawnRules__1698656152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1698656152L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createSulfurCubeAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createSulfurCubeAttributes__137168868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137168868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shear(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/sounds/SoundSource;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void shear_32675916(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(32675916L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readyForShearing()Z", cancellable = true)
    private void readyForShearing__227984392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-227984392L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_447201740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(447201740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/monster/cubemob/AbstractCubeMob;", cancellable = true)
    private void getBreedOffspring_1894482431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894482431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canHoldItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canHoldItem__1765930686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1765930686L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "requiresCustomPersistence()Z", cancellable = true)
    private void requiresCustomPersistence_817375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(817375L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset_1847500583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1847500583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickupSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getPickupSound_817184525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(817184525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFuse()I", cancellable = true)
    private void getFuse_284845047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(284845047L))
            info.setReturnValue(1631205143);
    }

    @Inject(at = @At("HEAD"), method = "fromBucket()Z", cancellable = true)
    private void fromBucket__1759528053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759528053L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canBePickedUpWithBucket(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canBePickedUpWithBucket__1042811994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042811994L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "saveToBucketTag(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void saveToBucketTag_1483495432(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1483495432L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFromBucket(Z)V", cancellable = true)
    private void setFromBucket_1974840827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1974840827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBucketItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBucketItemStack_511666401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511666401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadFromBucketTag(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void loadFromBucketTag__1876743994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1876743994L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightLevelDependentMagicValue()F", cancellable = true)
    private void getLightLevelDependentMagicValue__1914566644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1914566644L))
            info.setReturnValue(1.169504E8F);
    }

    @Inject(at = @At("HEAD"), method = "isInvulnerableToPiercingWeapon()Z", cancellable = true)
    private void isInvulnerableToPiercingWeapon_1405643436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405643436L))
            info.setReturnValue(true);
    }


}
