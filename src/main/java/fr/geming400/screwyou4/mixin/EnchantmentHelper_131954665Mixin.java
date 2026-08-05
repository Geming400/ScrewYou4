package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.EnchantmentHelper.class)
public class EnchantmentHelper_131954665Mixin {
        @Inject(at = @At("HEAD"), method = "getComponentType(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private static void getComponentType_1378799274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378799274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "has(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/component/DataComponentType;)Z", cancellable = true)
    private static void has_107661836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107661836L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTridentReturnToOwnerAcceleration(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;)I", cancellable = true)
    private static void getTridentReturnToOwnerAcceleration_328171369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(328171369L))
            info.setReturnValue(-14777967);
    }

    @Inject(at = @At("HEAD"), method = "doPostAttackEffectsWithItemSourceOnBreak(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void doPostAttackEffectsWithItemSourceOnBreak_2116940519(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2116940519L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTridentSpinAttackStrength(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)F", cancellable = true)
    private static void getTridentSpinAttackStrength__765228626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-765228626L))
            info.setReturnValue(3.109056E8F);
    }

    @Inject(at = @At("HEAD"), method = "selectEnchantment(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/item/ItemStack;ILjava/util/stream/Stream;)Ljava/util/List;", cancellable = true)
    private static void selectEnchantment_156211996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(156211996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEnchantmentCost(Lnet/minecraft/util/RandomSource;IILnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private static void getEnchantmentCost__253172309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-253172309L))
            info.setReturnValue(-818123615);
    }

    @Inject(at = @At("HEAD"), method = "createBook(Lnet/minecraft/world/item/enchantment/EnchantmentInstance;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void createBook_1047779294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1047779294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEnchantments(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/enchantment/ItemEnchantments;)V", cancellable = true)
    private static void setEnchantments_1680329491(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1680329491L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canStoreEnchantments(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void canStoreEnchantments_1866490044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866490044L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getEnchantmentsForCrafting(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/enchantment/ItemEnchantments;", cancellable = true)
    private static void getEnchantmentsForCrafting__535908937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535908937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stopLocationBasedEffects(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void stopLocationBasedEffects_453618243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(453618243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopLocationBasedEffects(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private static void stopLocationBasedEffects_1144382972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1144382972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyDamage(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;F)F", cancellable = true)
    private static void modifyDamage__211595933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-211595933L))
            info.setReturnValue(3.109056E8F);
    }

    @Inject(at = @At("HEAD"), method = "forEachModifier(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/EquipmentSlotGroup;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void forEachModifier_1966688818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1966688818L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachModifier(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/EquipmentSlot;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void forEachModifier_1571524275(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1571524275L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isImmuneToDamage(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private static void isImmuneToDamage_1815473809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1815473809L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "doPostAttackEffects(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private static void doPostAttackEffects__286960636(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-286960636L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickEffects(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void tickEffects__1838381166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1838381166L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "processMobExperience(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;I)I", cancellable = true)
    private static void processMobExperience__1055171858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055171858L))
            info.setReturnValue(-987062884);
    }

    @Inject(at = @At("HEAD"), method = "runLocationChangedEffects(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void runLocationChangedEffects__1838381166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1838381166L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runLocationChangedEffects(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private static void runLocationChangedEffects__1727539957(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1727539957L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyKnockback(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;F)F", cancellable = true)
    private static void modifyKnockback__211595933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-211595933L))
            info.setReturnValue(3.109056E8F);
    }

    @Inject(at = @At("HEAD"), method = "getDamageProtection(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/damagesource/DamageSource;)F", cancellable = true)
    private static void getDamageProtection_1815454589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1815454589L))
            info.setReturnValue(3.109056E8F);
    }

    @Inject(at = @At("HEAD"), method = "getFishingTimeReduction(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;)F", cancellable = true)
    private static void getFishingTimeReduction_328168486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(328168486L))
            info.setReturnValue(3.109056E8F);
    }

    @Inject(at = @At("HEAD"), method = "getFishingLuckBonus(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;)I", cancellable = true)
    private static void getFishingLuckBonus_328171369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(328171369L))
            info.setReturnValue(-14777967);
    }

    @Inject(at = @At("HEAD"), method = "modifyFallBasedDamage(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;F)F", cancellable = true)
    private static void modifyFallBasedDamage__211595933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-211595933L))
            info.setReturnValue(3.109056E8F);
    }

    @Inject(at = @At("HEAD"), method = "modifyCrossbowChargingTime(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;F)F", cancellable = true)
    private static void modifyCrossbowChargingTime__1885840210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1885840210L))
            info.setReturnValue(3.109056E8F);
    }

    @Inject(at = @At("HEAD"), method = "pickHighestLevel(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/component/DataComponentType;)Ljava/util/Optional;", cancellable = true)
    private static void pickHighestLevel__1955018503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1955018503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "processProjectileCount(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;I)I", cancellable = true)
    private static void processProjectileCount_1947472636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947472636L))
            info.setReturnValue(1962522214);
    }

    @Inject(at = @At("HEAD"), method = "processAmmoUse(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;I)I", cancellable = true)
    private static void processAmmoUse__1991601148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1991601148L))
            info.setReturnValue(1536454261);
    }

    @Inject(at = @At("HEAD"), method = "processProjectileSpread(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;F)F", cancellable = true)
    private static void processProjectileSpread_1944699190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944699190L))
            info.setReturnValue(3.109056E8F);
    }

    @Inject(at = @At("HEAD"), method = "processBlockExperience(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;I)I", cancellable = true)
    private static void processBlockExperience_2076409481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076409481L))
            info.setReturnValue(-1304244784);
    }

    @Inject(at = @At("HEAD"), method = "doPostAttackEffectsWithItemSource(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void doPostAttackEffectsWithItemSource__927301207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-927301207L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doPostPiercingAttackEffects(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void doPostPiercingAttackEffects__1838381166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1838381166L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onHitBlock(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void onHitBlock_132602623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(132602623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyDurabilityToRepairFromXp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;I)I", cancellable = true)
    private static void modifyDurabilityToRepairFromXp_2076409481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076409481L))
            info.setReturnValue(-1304244784);
    }

    @Inject(at = @At("HEAD"), method = "getPiercingCount(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private static void getPiercingCount_478199137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478199137L))
            info.setReturnValue(1002275839);
    }

    @Inject(at = @At("HEAD"), method = "onProjectileSpawned(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/projectile/Projectile;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void onProjectileSpawned_1760645484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1760645484L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "processEquipmentDropChance(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/damagesource/DamageSource;F)F", cancellable = true)
    private static void processEquipmentDropChance_805928127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805928127L))
            info.setReturnValue(3.109056E8F);
    }

    @Inject(at = @At("HEAD"), method = "enchantItemFromProvider(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void enchantItemFromProvider_1945502710(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1945502710L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runIterationOnEquipment(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/enchantment/EnchantmentHelper$EnchantmentInSlotVisitor;)V", cancellable = true)
    private static void runIterationOnEquipment_1052787684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1052787684L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHighestLevel(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/component/DataComponentType;)Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private static void getHighestLevel_519587319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519587319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runIterationOnItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/enchantment/EnchantmentHelper$EnchantmentVisitor;)V", cancellable = true)
    private static void runIterationOnItem__1373365332(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1373365332L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runIterationOnItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/enchantment/EnchantmentHelper$EnchantmentInSlotVisitor;)V", cancellable = true)
    private static void runIterationOnItem_751195143(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(751195143L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEnchantmentLevel(Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private static void getEnchantmentLevel__1661010297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1661010297L))
            info.setReturnValue(-28421426);
    }

    @Inject(at = @At("HEAD"), method = "enchantItem(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/item/ItemStack;ILnet/minecraft/core/RegistryAccess;Ljava/util/Optional;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void enchantItem__1598532625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1598532625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantItem(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/item/ItemStack;ILjava/util/stream/Stream;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void enchantItem_463203088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(463203088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemEnchantmentLevel(Lnet/minecraft/core/Holder;Lnet/minecraft/world/item/ItemInstance;)I", cancellable = true)
    private static void getItemEnchantmentLevel__640592933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-640592933L))
            info.setReturnValue(1870915919);
    }

    @Inject(at = @At("HEAD"), method = "hasTag(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private static void hasTag__325579902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-325579902L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "updateEnchantments(Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)Lnet/minecraft/world/item/enchantment/ItemEnchantments;", cancellable = true)
    private static void updateEnchantments_1364454711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364454711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAnyEnchantments(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void hasAnyEnchantments_1866490044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866490044L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "processDurabilityChange(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;I)I", cancellable = true)
    private static void processDurabilityChange_2076409481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076409481L))
            info.setReturnValue(-1304244784);
    }

    @Inject(at = @At("HEAD"), method = "getRandomItemWith(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/entity/LivingEntity;Ljava/util/function/Predicate;)Ljava/util/Optional;", cancellable = true)
    private static void getRandomItemWith__985976513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-985976513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnchantmentCompatible(Ljava/util/Collection;Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private static void isEnchantmentCompatible_1182021653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1182021653L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "modifyArmorEffectiveness(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;F)F", cancellable = true)
    private static void modifyArmorEffectiveness__211595933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-211595933L))
            info.setReturnValue(3.109056E8F);
    }

    @Inject(at = @At("HEAD"), method = "getAvailableEnchantmentResults(ILnet/minecraft/world/item/ItemStack;Ljava/util/stream/Stream;)Ljava/util/List;", cancellable = true)
    private static void getAvailableEnchantmentResults_1408031206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1408031206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filterCompatibleEnchantments(Ljava/util/List;Lnet/minecraft/world/item/enchantment/EnchantmentInstance;)V", cancellable = true)
    private static void filterCompatibleEnchantments_2072874602(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2072874602L))
            info.cancel();
    }


}
