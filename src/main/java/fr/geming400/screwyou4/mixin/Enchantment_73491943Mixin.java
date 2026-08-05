package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.Enchantment.class)
public class Enchantment_73491943Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1459004201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1459004201L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1061968529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1061968529L))
            info.setReturnValue("-&$)!Frq+5TChh椶䉪}g/j^<坜ኀdI轋p벻#9UE>7)YힰT\"t륣(F)?5Mj*+$h=Q4F2eo?6w=*Ijt?H");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_111754684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(111754684L))
            info.setReturnValue(-1099375332);
    }

    @Inject(at = @At("HEAD"), method = "definition()Lnet/minecraft/world/item/enchantment/Enchantment$EnchantmentDefinition;", cancellable = true)
    private void definition__1811934214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811934214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "definition(Lnet/minecraft/core/HolderSet;Lnet/minecraft/core/HolderSet;IILnet/minecraft/world/item/enchantment/Enchantment$Cost;Lnet/minecraft/world/item/enchantment/Enchantment$Cost;I[Lnet/minecraft/world/entity/EquipmentSlotGroup;)Lnet/minecraft/world/item/enchantment/Enchantment$EnchantmentDefinition;", cancellable = true)
    private static void definition_265128133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(265128133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "definition(Lnet/minecraft/core/HolderSet;IILnet/minecraft/world/item/enchantment/Enchantment$Cost;Lnet/minecraft/world/item/enchantment/Enchantment$Cost;I[Lnet/minecraft/world/entity/EquipmentSlotGroup;)Lnet/minecraft/world/item/enchantment/Enchantment$EnchantmentDefinition;", cancellable = true)
    private static void definition__361237584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-361237584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void tick_1951731261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1951731261L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description__2103417223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103417223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxLevel()I", cancellable = true)
    private void getMaxLevel_111754188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(111754188L))
            info.setReturnValue(-920851842);
    }

    @Inject(at = @At("HEAD"), method = "getMinLevel()I", cancellable = true)
    private void getMinLevel_111754188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(111754188L))
            info.setReturnValue(-920851842);
    }

    @Inject(at = @At("HEAD"), method = "getWeight()I", cancellable = true)
    private void getWeight_111754188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(111754188L))
            info.setReturnValue(-920851842);
    }

    @Inject(at = @At("HEAD"), method = "modifyDamage(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyDamage_1232619613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1232619613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopLocationBasedEffects(ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void stopLocationBasedEffects__1048939451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1048939451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isImmuneToDamage(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void isImmuneToDamage_2076753733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076753733L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "runLocationChangedEffects(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void runLocationChangedEffects__197574444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-197574444L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyEffects(Ljava/util/List;Lnet/minecraft/world/level/storage/loot/LootContext;Lorg/apache/commons/lang3/mutable/MutableFloat;Lnet/minecraft/world/item/enchantment/Enchantment$FloatAction;)V", cancellable = true)
    private static void applyEffects__1510701185(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1510701185L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyEffects(Ljava/util/List;Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/item/enchantment/Enchantment$GenericAction;)V", cancellable = true)
    private static void applyEffects__980655085(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-980655085L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyKnockback(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyKnockback_1232619613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1232619613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canEnchant(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canEnchant_1808027074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1808027074L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "enchantment(Lnet/minecraft/world/item/enchantment/Enchantment$EnchantmentDefinition;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private static void enchantment__56155284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56155284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifyDurabilityToRepairFromXp(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyDurabilityToRepairFromXp_110313469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(110313469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyTridentReturnToOwnerAcceleration(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyTridentReturnToOwnerAcceleration__436999362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-436999362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyTridentSpinAttackStrength(Lnet/minecraft/util/RandomSource;ILorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyTridentSpinAttackStrength__1461745007(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1461745007L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPrimaryItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isPrimaryItem_1808027074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1808027074L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "effects()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void effects_1277296883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1277296883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinCost(I)I", cancellable = true)
    private void getMinCost_1287396421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1287396421L))
            info.setReturnValue(1036221262);
    }

    @Inject(at = @At("HEAD"), method = "getEffects(Lnet/minecraft/core/component/DataComponentType;)Ljava/util/List;", cancellable = true)
    private void getEffects_861971142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861971142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxCost(I)I", cancellable = true)
    private void getMaxCost_1287396421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1287396421L))
            info.setReturnValue(1036221262);
    }

    @Inject(at = @At("HEAD"), method = "itemContext(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemInstance;)Lnet/minecraft/world/level/storage/loot/LootContext;", cancellable = true)
    private static void itemContext_807314112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807314112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onProjectileSpawned(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void onProjectileSpawned_1951731261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1951731261L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "areCompatible(Lnet/minecraft/core/Holder;Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private static void areCompatible_970265397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970265397L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAnvilCost()I", cancellable = true)
    private void getAnvilCost_111754188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(111754188L))
            info.setReturnValue(-920851842);
    }

    @Inject(at = @At("HEAD"), method = "onHitBlock(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void onHitBlock__40634960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-40634960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyDurabilityChange(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyDurabilityChange_110313469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(110313469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyFallBasedDamage(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyFallBasedDamage_1232619613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1232619613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyArmorEffectivness(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyArmorEffectivness_1232619613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1232619613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyPiercingCount(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyPiercingCount_110313469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(110313469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFullname(Lnet/minecraft/core/Holder;I)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void getFullname__484472025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-484472025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exclusiveSet()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void exclusiveSet_1693444986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693444986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "constantCost(I)Lnet/minecraft/world/item/enchantment/Enchantment$Cost;", cancellable = true)
    private static void constantCost_624549054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(624549054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifyItemFilteredCount(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemInstance;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyItemFilteredCount__9572946(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-9572946L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyMobExperience(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyMobExperience__436999362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-436999362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyEntityFilteredValue(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyEntityFilteredValue_1389681630(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1389681630L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyUnfilteredValue(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/util/RandomSource;ILorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyUnfilteredValue_1072196929(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1072196929L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSupportedItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isSupportedItem_1808027074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1808027074L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "modifyAmmoCount(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyAmmoCount_110313469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(110313469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSlotItems(Lnet/minecraft/world/entity/LivingEntity;)Ljava/util/Map;", cancellable = true)
    private void getSlotItems_84999038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(84999038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifyFishingTimeReduction(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyFishingTimeReduction__436999362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-436999362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dynamicCost(II)Lnet/minecraft/world/item/enchantment/Enchantment$Cost;", cancellable = true)
    private static void dynamicCost_236464165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236464165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damageContext(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)Lnet/minecraft/world/level/storage/loot/LootContext;", cancellable = true)
    private static void damageContext_100081044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(100081044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifyDamageProtection(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyDamageProtection_1232619613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1232619613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSupportedItems()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void getSupportedItems_1693444986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693444986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifyBlockExperience(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyBlockExperience_110313469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(110313469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyFishingLuckBonus(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyFishingLuckBonus__436999362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-436999362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyDamageFilteredValue(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyDamageFilteredValue_509928861(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(509928861L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "matchingSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void matchingSlot_1068859803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068859803L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "locationContext(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/entity/Entity;Z)Lnet/minecraft/world/level/storage/loot/LootContext;", cancellable = true)
    private static void locationContext_1953634691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1953634691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doPostAttack(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/item/enchantment/EnchantmentTarget;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void doPostAttack__1679493960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1679493960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doPostAttack(Lnet/minecraft/world/item/enchantment/TargetedConditionalEffect;Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private static void doPostAttack_509580817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(509580817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyProjectileSpread(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyProjectileSpread__436999362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-436999362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityContext(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/level/storage/loot/LootContext;", cancellable = true)
    private static void entityContext__464847743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-464847743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifyProjectileCount(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyProjectileCount__436999362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-436999362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyCrossbowChargeTime(Lnet/minecraft/util/RandomSource;ILorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyCrossbowChargeTime__1461745007(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1461745007L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blockHitContext(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/storage/loot/LootContext;", cancellable = true)
    private static void blockHitContext__1274741326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274741326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doPostPiercingAttack(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void doPostPiercingAttack_1951731261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1951731261L))
            info.cancel();
    }


}
