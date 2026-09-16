package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.EnchantmentHelper.class)
public class EnchantmentHelper_131954665Mixin {
        @Inject(at = @At("HEAD"), method = "getComponentType(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private static void getComponentType_406014411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406014411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "has(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/component/DataComponentType;)Z", cancellable = true)
    private static void has__446347086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-446347086L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "processMobExperience(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;I)I", cancellable = true)
    private static void processMobExperience_1504540105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1504540105L))
            info.setReturnValue(-1976027887);
    }

    @Inject(at = @At("HEAD"), method = "tickEffects(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void tickEffects__1666856329(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1666856329L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runLocationChangedEffects(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void runLocationChangedEffects__2145139648(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2145139648L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runLocationChangedEffects(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private static void runLocationChangedEffects__179316423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-179316423L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyKnockback(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;F)F", cancellable = true)
    private static void modifyKnockback_619402500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(619402500L))
            info.setReturnValue(5.311284E8F);
    }

    @Inject(at = @At("HEAD"), method = "doPostAttackEffects(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private static void doPostAttackEffects__2111275371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2111275371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doPostAttackEffectsWithItemSource(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void doPostAttackEffectsWithItemSource__300511514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-300511514L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doPostPiercingAttackEffects(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void doPostPiercingAttackEffects_1896714396(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1896714396L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopLocationBasedEffects(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private static void stopLocationBasedEffects__1449555390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1449555390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopLocationBasedEffects(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void stopLocationBasedEffects__881274615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-881274615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyDamage(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;F)F", cancellable = true)
    private static void modifyDamage__2110207572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110207572L))
            info.setReturnValue(5.311284E8F);
    }

    @Inject(at = @At("HEAD"), method = "forEachModifier(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/EquipmentSlot;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void forEachModifier_2144124884(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2144124884L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachModifier(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/EquipmentSlotGroup;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void forEachModifier_1434363313(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1434363313L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDamageProtection(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/damagesource/DamageSource;)F", cancellable = true)
    private static void getDamageProtection__1556473057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1556473057L))
            info.setReturnValue(5.311284E8F);
    }

    @Inject(at = @At("HEAD"), method = "isImmuneToDamage(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private static void isImmuneToDamage__548641350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-548641350L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getEnchantmentsForCrafting(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/enchantment/ItemEnchantments;", cancellable = true)
    private static void getEnchantmentsForCrafting__1218438946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218438946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEnchantments(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/enchantment/ItemEnchantments;)V", cancellable = true)
    private static void setEnchantments_1213303473(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1213303473L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canStoreEnchantments(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void canStoreEnchantments__714887249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714887249L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRandomItemWith(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/entity/LivingEntity;Ljava/util/function/Predicate;)Ljava/util/Optional;", cancellable = true)
    private static void getRandomItemWith_534430125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534430125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBook(Lnet/minecraft/world/item/enchantment/EnchantmentInstance;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void createBook_293527715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293527715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantItemFromProvider(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void enchantItemFromProvider_2124420637(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2124420637L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "processEquipmentDropChance(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/damagesource/DamageSource;F)F", cancellable = true)
    private static void processEquipmentDropChance_361899905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(361899905L))
            info.setReturnValue(5.311284E8F);
    }

    @Inject(at = @At("HEAD"), method = "getPiercingCount(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private static void getPiercingCount__1854240883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1854240883L))
            info.setReturnValue(-1314924090);
    }

    @Inject(at = @At("HEAD"), method = "onProjectileSpawned(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/projectile/Projectile;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void onProjectileSpawned_1352452222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1352452222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "processDurabilityChange(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;I)I", cancellable = true)
    private static void processDurabilityChange_896629297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(896629297L))
            info.setReturnValue(1686976950);
    }

    @Inject(at = @At("HEAD"), method = "processBlockExperience(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;I)I", cancellable = true)
    private static void processBlockExperience_1966714865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1966714865L))
            info.setReturnValue(150294034);
    }

    @Inject(at = @At("HEAD"), method = "selectEnchantment(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/item/ItemStack;ILjava/util/stream/Stream;)Ljava/util/List;", cancellable = true)
    private static void selectEnchantment__240918367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-240918367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEnchantmentCost(Lnet/minecraft/util/RandomSource;IILnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private static void getEnchantmentCost__1203187687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203187687L))
            info.setReturnValue(744253463);
    }

    @Inject(at = @At("HEAD"), method = "updateEnchantments(Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)Lnet/minecraft/world/item/enchantment/ItemEnchantments;", cancellable = true)
    private static void updateEnchantments_815130940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(815130940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAnyEnchantments(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void hasAnyEnchantments__894916530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-894916530L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getEnchantmentLevel(Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private static void getEnchantmentLevel_977779172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(977779172L))
            info.setReturnValue(-1239509656);
    }

    @Inject(at = @At("HEAD"), method = "enchantItem(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/item/ItemStack;ILnet/minecraft/core/RegistryAccess;Ljava/util/Optional;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void enchantItem_948921443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948921443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantItem(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/item/ItemStack;ILjava/util/stream/Stream;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void enchantItem_1866169988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866169988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemEnchantmentLevel(Lnet/minecraft/core/Holder;Lnet/minecraft/world/item/ItemInstance;)I", cancellable = true)
    private static void getItemEnchantmentLevel__886899483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-886899483L))
            info.setReturnValue(644168263);
    }

    @Inject(at = @At("HEAD"), method = "hasTag(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private static void hasTag__860147166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-860147166L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFishingTimeReduction(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;)F", cancellable = true)
    private static void getFishingTimeReduction_919461720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(919461720L))
            info.setReturnValue(5.311284E8F);
    }

    @Inject(at = @At("HEAD"), method = "getFishingLuckBonus(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;)I", cancellable = true)
    private static void getFishingLuckBonus__1146429085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146429085L))
            info.setReturnValue(1312099935);
    }

    @Inject(at = @At("HEAD"), method = "onHitBlock(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void onHitBlock_1554756838(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1554756838L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runIterationOnEquipment(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/enchantment/EnchantmentHelper$EnchantmentInSlotVisitor;)V", cancellable = true)
    private static void runIterationOnEquipment__455199289(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-455199289L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHighestLevel(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/component/DataComponentType;)Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private static void getHighestLevel__573574399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-573574399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runIterationOnItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/enchantment/EnchantmentHelper$EnchantmentVisitor;)V", cancellable = true)
    private static void runIterationOnItem__1508733328(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1508733328L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runIterationOnItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/enchantment/EnchantmentHelper$EnchantmentInSlotVisitor;)V", cancellable = true)
    private static void runIterationOnItem__493623869(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-493623869L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyDurabilityToRepairFromXp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;I)I", cancellable = true)
    private static void modifyDurabilityToRepairFromXp_317468886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(317468886L))
            info.setReturnValue(1410079739);
    }

    @Inject(at = @At("HEAD"), method = "isEnchantmentCompatible(Ljava/util/Collection;Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private static void isEnchantmentCompatible__1076104778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076104778L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "modifyFallBasedDamage(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;F)F", cancellable = true)
    private static void modifyFallBasedDamage_765353296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(765353296L))
            info.setReturnValue(5.311284E8F);
    }

    @Inject(at = @At("HEAD"), method = "modifyCrossbowChargingTime(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;F)F", cancellable = true)
    private static void modifyCrossbowChargingTime__881117684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-881117684L))
            info.setReturnValue(5.311284E8F);
    }

    @Inject(at = @At("HEAD"), method = "pickHighestLevel(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/component/DataComponentType;)Ljava/util/Optional;", cancellable = true)
    private static void pickHighestLevel_536670074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536670074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "processProjectileSpread(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;F)F", cancellable = true)
    private static void processProjectileSpread__777660213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-777660213L))
            info.setReturnValue(5.311284E8F);
    }

    @Inject(at = @At("HEAD"), method = "processProjectileCount(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;I)I", cancellable = true)
    private static void processProjectileCount_26988837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(26988837L))
            info.setReturnValue(-517142499);
    }

    @Inject(at = @At("HEAD"), method = "processAmmoUse(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;I)I", cancellable = true)
    private static void processAmmoUse__1457736978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457736978L))
            info.setReturnValue(-965353387);
    }

    @Inject(at = @At("HEAD"), method = "doPostAttackEffectsWithItemSourceOnBreak(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void doPostAttackEffectsWithItemSourceOnBreak_1894231012(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1894231012L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTridentReturnToOwnerAcceleration(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;)I", cancellable = true)
    private static void getTridentReturnToOwnerAcceleration__1670717163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1670717163L))
            info.setReturnValue(-1470361418);
    }

    @Inject(at = @At("HEAD"), method = "getTridentSpinAttackStrength(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)F", cancellable = true)
    private static void getTridentSpinAttackStrength_1955003541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955003541L))
            info.setReturnValue(5.311284E8F);
    }

    @Inject(at = @At("HEAD"), method = "getAvailableEnchantmentResults(ILnet/minecraft/world/item/ItemStack;Ljava/util/stream/Stream;)Ljava/util/List;", cancellable = true)
    private static void getAvailableEnchantmentResults__463493736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-463493736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filterCompatibleEnchantments(Ljava/util/List;Lnet/minecraft/world/item/enchantment/EnchantmentInstance;)V", cancellable = true)
    private static void filterCompatibleEnchantments__679628606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-679628606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyArmorEffectiveness(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;F)F", cancellable = true)
    private static void modifyArmorEffectiveness_1345541308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345541308L))
            info.setReturnValue(5.311284E8F);
    }


}
