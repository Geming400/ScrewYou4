package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.cubemob.SulfurCube.class)
public class SulfurCube307317640Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_144225235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(144225235L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "setSize(IZ)V", cancellable = true)
    private void setSize__672861972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-672861972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_345592379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(345592379L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFuse()I", cancellable = true)
    private void getFuse_345579886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345579886L))
            info.setReturnValue(-344566826);
    }

    @Inject(at = @At("HEAD"), method = "shear(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/sounds/SoundSource;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void shear_784940749(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(784940749L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__142112691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-142112691L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "knockback(DDDLnet/minecraft/world/damagesource/DamageSource;FZ)V", cancellable = true)
    private void knockback_320227508(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(320227508L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromBucket()Z", cancellable = true)
    private void fromBucket_345596223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345596223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPickupSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getPickupSound_1397530538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1397530538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxUpStep()F", cancellable = true)
    private void maxUpStep_345577003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345577003L))
            info.setReturnValue(1.825992E8F);
    }

    @Inject(at = @At("HEAD"), method = "canFreeze()Z", cancellable = true)
    private void canFreeze_345596223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345596223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot_1302685501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302685501L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isEquippableInSlot(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void isEquippableInSlot__2121352414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121352414L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getEquipmentSlotForItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private void getEquipmentSlotForItem__1095974272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1095974272L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.MAINHAND);
    }

    @Inject(at = @At("HEAD"), method = "canPickUpLoot()Z", cancellable = true)
    private void canPickUpLoot_345596223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345596223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "playerTouch(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void playerTouch_1247919286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1247919286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBePickedFromInside()Z", cancellable = true)
    private void canBePickedFromInside_345596223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345596223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_345596223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345596223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1953067084(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1953067084L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFluidJumpThreshold()D", cancellable = true)
    private void getFluidJumpThreshold_345575081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345575081L))
            info.setReturnValue(1.825992006513319E8D);
    }

    @Inject(at = @At("HEAD"), method = "canBreatheUnderwater()Z", cancellable = true)
    private void canBreatheUnderwater_345596223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345596223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__1985730333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985730333L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.AMBIENT);
    }

    @Inject(at = @At("HEAD"), method = "getLightLevelDependentMagicValue()F", cancellable = true)
    private void getLightLevelDependentMagicValue_345577003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345577003L))
            info.setReturnValue(1.825992E8F);
    }

    @Inject(at = @At("HEAD"), method = "isInvulnerableToPiercingWeapon()Z", cancellable = true)
    private void isInvulnerableToPiercingWeapon_345596223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345596223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset_1405047169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405047169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canExplode()Z", cancellable = true)
    private void canExplode_345596223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345596223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "equipItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void equipItem_2041852772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041852772L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPrimed()Z", cancellable = true)
    private void isPrimed_345596223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345596223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "primeTime(Z)Z", cancellable = true)
    private void primeTime_1536938313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1536938313L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createSulfurCubeAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createSulfurCubeAttributes__392900805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-392900805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasBodyItem()Z", cancellable = true)
    private void hasBodyItem_345596223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345596223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkSulfurCubeSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkSulfurCubeSpawnRules__534946054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-534946054L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matchingArchetypes(Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;", cancellable = true)
    private void matchingArchetypes_956119283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(956119283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canHoldItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canHoldItem_2041852772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041852772L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "requiresCustomPersistence()Z", cancellable = true)
    private void requiresCustomPersistence_345596223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345596223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "readyForShearing()Z", cancellable = true)
    private void readyForShearing_345596223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345596223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBePickedUpWithBucket(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canBePickedUpWithBucket_2041852772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041852772L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "loadFromBucketTag(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void loadFromBucketTag_868225862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(868225862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBucketItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBucketItemStack_830736300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830736300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saveToBucketTag(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void saveToBucketTag_2041848928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2041848928L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFromBucket(Z)V", cancellable = true)
    private void setFromBucket_1536934469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1536934469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1905106222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905106222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/monster/cubemob/AbstractCubeMob;", cancellable = true)
    private void getBreedOffspring__1325533219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1325533219L))
            info.setReturnValue(null);
    }


}
