package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.Enchantment.class)
public class Enchantment_73491943Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__835134326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835134326L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_843914971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843914971L))
            info.setReturnValue("\uB6DD%A/\u7475nw2Uk{M*|X|\uCC0Cd=>p+74\u74B6\"<(\uBB0BN#1\u2F80C]mIc SX\u6444m|]d_N\u3AD7d\u6745W>7Yuc\u8300\u2C7Fj'G$:j|\u2D4A^?#+qDwS.b+hT\uA342{8xO9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_630844033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630844033L))
            info.setReturnValue(95717326);
    }

    @Inject(at = @At("HEAD"), method = "definition(Lnet/minecraft/core/HolderSet;IILnet/minecraft/world/item/enchantment/Enchantment$Cost;Lnet/minecraft/world/item/enchantment/Enchantment$Cost;I[Lnet/minecraft/world/entity/EquipmentSlotGroup;)Lnet/minecraft/world/item/enchantment/Enchantment$EnchantmentDefinition;", cancellable = true)
    private static void definition_552639613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552639613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "definition()Lnet/minecraft/world/item/enchantment/Enchantment$EnchantmentDefinition;", cancellable = true)
    private void definition__1926443827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1926443827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "definition(Lnet/minecraft/core/HolderSet;Lnet/minecraft/core/HolderSet;IILnet/minecraft/world/item/enchantment/Enchantment$Cost;Lnet/minecraft/world/item/enchantment/Enchantment$Cost;I[Lnet/minecraft/world/entity/EquipmentSlotGroup;)Lnet/minecraft/world/item/enchantment/Enchantment$EnchantmentDefinition;", cancellable = true)
    private static void definition_639143122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(639143122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void tick_908652442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(908652442L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description__240439435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-240439435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinLevel()I", cancellable = true)
    private void getMinLevel__240307452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-240307452L))
            info.setReturnValue(-1471231140);
    }

    @Inject(at = @At("HEAD"), method = "getMaxLevel()I", cancellable = true)
    private void getMaxLevel__2062613610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2062613610L))
            info.setReturnValue(-753186344);
    }

    @Inject(at = @At("HEAD"), method = "runLocationChangedEffects(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void runLocationChangedEffects__155277310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-155277310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyKnockback(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyKnockback__640864612(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-640864612L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyEffects(Ljava/util/List;Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/item/enchantment/Enchantment$GenericAction;)V", cancellable = true)
    private static void applyEffects_2008373471(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2008373471L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyEffects(Ljava/util/List;Lnet/minecraft/world/level/storage/loot/LootContext;Lorg/apache/commons/lang3/mutable/MutableFloat;Lnet/minecraft/world/item/enchantment/Enchantment$FloatAction;)V", cancellable = true)
    private static void applyEffects_319614515(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(319614515L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyDamage(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyDamage_1261663476(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1261663476L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopLocationBasedEffects(ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void stopLocationBasedEffects_573208459(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(573208459L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isImmuneToDamage(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void isImmuneToDamage__2113097092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113097092L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "effects()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void effects_1478106289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1478106289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantment(Lnet/minecraft/world/item/enchantment/Enchantment$EnchantmentDefinition;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private static void enchantment_1326136163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1326136163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onHitBlock(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void onHitBlock__1981932969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1981932969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyTridentReturnToOwnerAcceleration(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyTridentReturnToOwnerAcceleration__737936306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-737936306L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyTridentSpinAttackStrength(Lnet/minecraft/util/RandomSource;ILorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyTridentSpinAttackStrength__1809546220(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1809546220L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyDurabilityToRepairFromXp(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyDurabilityToRepairFromXp_552271376(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(552271376L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "itemContext(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemInstance;)Lnet/minecraft/world/level/storage/loot/LootContext;", cancellable = true)
    private static void itemContext_2121944540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2121944540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWeight()I", cancellable = true)
    private void getWeight_1458375454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458375454L))
            info.setReturnValue(-1124007945);
    }

    @Inject(at = @At("HEAD"), method = "getMaxCost(I)I", cancellable = true)
    private void getMaxCost_684183328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(684183328L))
            info.setReturnValue(-1688916925);
    }

    @Inject(at = @At("HEAD"), method = "getEffects(Lnet/minecraft/core/component/DataComponentType;)Ljava/util/List;", cancellable = true)
    private void getEffects__1153257070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1153257070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinCost(I)I", cancellable = true)
    private void getMinCost__1788477810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1788477810L))
            info.setReturnValue(-245703477);
    }

    @Inject(at = @At("HEAD"), method = "getAnvilCost()I", cancellable = true)
    private void getAnvilCost_355255721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(355255721L))
            info.setReturnValue(1879313773);
    }

    @Inject(at = @At("HEAD"), method = "areCompatible(Lnet/minecraft/core/Holder;Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private static void areCompatible__1665470995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1665470995L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFullname(Lnet/minecraft/core/Holder;I)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void getFullname__912885193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-912885193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dynamicCost(II)Lnet/minecraft/world/item/enchantment/Enchantment$Cost;", cancellable = true)
    private static void dynamicCost__1144956167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1144956167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifyFishingLuckBonus(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyFishingLuckBonus__1682689892(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1682689892L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyProjectileSpread(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyProjectileSpread_2069026260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2069026260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyMobExperience(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyMobExperience_630654254(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(630654254L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSupportedItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isSupportedItem__1380501557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1380501557L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "modifyDurabilityChange(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyDurabilityChange__1282542486(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1282542486L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyFallBasedDamage(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyFallBasedDamage_2112959696(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2112959696L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "exclusiveSet()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void exclusiveSet_1351961438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1351961438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifyDamageFilteredValue(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyDamageFilteredValue__130549588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-130549588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyAmmoCount(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyAmmoCount_344231318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(344231318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyUnfilteredValue(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/util/RandomSource;ILorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyUnfilteredValue__1032511608(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1032511608L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyFishingTimeReduction(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyFishingTimeReduction__544958508(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-544958508L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityContext(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/level/storage/loot/LootContext;", cancellable = true)
    private static void entityContext__1840208715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1840208715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSlotItems(Lnet/minecraft/world/entity/LivingEntity;)Ljava/util/Map;", cancellable = true)
    private void getSlotItems__504733910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-504733910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifyItemFilteredCount(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemInstance;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyItemFilteredCount__1084057223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1084057223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "damageContext(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)Lnet/minecraft/world/level/storage/loot/LootContext;", cancellable = true)
    private static void damageContext_1512504916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512504916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifyDamageProtection(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyDamageProtection_1657964699(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1657964699L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyProjectileCount(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyProjectileCount_625912266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(625912266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "locationContext(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/entity/Entity;Z)Lnet/minecraft/world/level/storage/loot/LootContext;", cancellable = true)
    private static void locationContext_1536542089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1536542089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matchingSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void matchingSlot__1189519200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1189519200L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "modifyBlockExperience(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyBlockExperience_753493472(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(753493472L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyEntityFilteredValue(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyEntityFilteredValue__828188997(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-828188997L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyPiercingCount(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyPiercingCount__1684237683(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1684237683L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doPostAttack(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/item/enchantment/EnchantmentTarget;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void doPostAttack__1946641627(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1946641627L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doPostAttack(Lnet/minecraft/world/item/enchantment/TargetedConditionalEffect;Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private static void doPostAttack__862945410(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-862945410L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blockHitContext(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/storage/loot/LootContext;", cancellable = true)
    private static void blockHitContext_2072711753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2072711753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifyArmorEffectivness(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyArmorEffectivness__1779631357(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1779631357L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSupportedItems()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void getSupportedItems_1123249698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123249698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doPostPiercingAttack(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void doPostPiercingAttack_586310037(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(586310037L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyCrossbowChargeTime(Lnet/minecraft/util/RandomSource;ILorg/apache/commons/lang3/mutable/MutableFloat;)V", cancellable = true)
    private void modifyCrossbowChargeTime__1625331722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1625331722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "constantCost(I)Lnet/minecraft/world/item/enchantment/Enchantment$Cost;", cancellable = true)
    private static void constantCost__1519789361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519789361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canEnchant(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canEnchant_959143289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(959143289L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onProjectileSpawned(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void onProjectileSpawned_1084432079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1084432079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPrimaryItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isPrimaryItem__909770377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-909770377L))
            info.setReturnValue(true);
    }


}
