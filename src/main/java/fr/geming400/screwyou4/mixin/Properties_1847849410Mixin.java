package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.Item.Properties.class)
public class Properties_1847849410Mixin {
        @Inject(at = @At("HEAD"), method = "component(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void component_810914503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810914503L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "attributes(Lnet/minecraft/world/item/component/ItemAttributeModifiers;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void attributes__1553494408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1553494408L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "setId(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void setId__1300990219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1300990219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tool(Lnet/minecraft/world/item/ToolMaterial;Lnet/minecraft/tags/TagKey;FFF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void tool__1605470805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605470805L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "equippable(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void equippable_2085859474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085859474L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures([Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void requiredFeatures__492875216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-492875216L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures(Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void requiredFeatures__1951995211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1951995211L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "durability(I)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void durability__252208204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-252208204L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "overrideDescription(Ljava/lang/String;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void overrideDescription__1047840004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1047840004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantable(I)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void enchantable__478373558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-478373558L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "repairable(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void repairable_1559353471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1559353471L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "repairable(Lnet/minecraft/world/item/Item;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void repairable__857673994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-857673994L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "food(Lnet/minecraft/world/food/FoodProperties;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void food__1902956974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1902956974L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "food(Lnet/minecraft/world/food/FoodProperties;Lnet/minecraft/world/item/component/Consumable;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void food__190880381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190880381L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "rarity(Lnet/minecraft/world/item/Rarity;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void rarity__2035271734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035271734L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "fireResistant()Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void fireResistant__1071070435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1071070435L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "trimMaterial(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void trimMaterial_1832908073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832908073L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "craftRemainder(Lnet/minecraft/world/item/Item;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void craftRemainder_1419748920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1419748920L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "craftRemainder(Lnet/minecraft/world/item/ItemStackTemplate;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void craftRemainder__2056004752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2056004752L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "humanoidArmor(Lnet/minecraft/world/item/equipment/ArmorMaterial;Lnet/minecraft/world/item/equipment/ArmorType;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void humanoidArmor__2093362911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2093362911L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "usingConvertsTo(Lnet/minecraft/world/item/Item;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void usingConvertsTo_275818750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(275818750L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "delayedComponent(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/core/component/DataComponentInitializers$SingleComponentInitializer;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void delayedComponent_1430258447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430258447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equippableUnswappable(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void equippableUnswappable__538469220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-538469220L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "delayedHolderComponent(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void delayedHolderComponent_1538221363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1538221363L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "itemIdOrThrow()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void itemIdOrThrow_1563238701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563238701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nautilusArmor(Lnet/minecraft/world/item/equipment/ArmorMaterial;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void nautilusArmor__82634771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-82634771L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "jukeboxPlayable(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void jukeboxPlayable_1518958142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518958142L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "effectiveModel()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void effectiveModel_1902582986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902582986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stacksTo(I)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void stacksTo_676884311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676884311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horseArmor(Lnet/minecraft/world/item/equipment/ArmorMaterial;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void horseArmor__1395067933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1395067933L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "spawnEgg(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void spawnEgg__811308019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811308019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sword(Lnet/minecraft/world/item/ToolMaterial;FF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void sword_766764972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766764972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pickaxe(Lnet/minecraft/world/item/ToolMaterial;FF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void pickaxe__771110820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771110820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wolfArmor(Lnet/minecraft/world/item/equipment/ArmorMaterial;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void wolfArmor__918296946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-918296946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spear(Lnet/minecraft/world/item/ToolMaterial;FFFFFFFFF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void spear__919605786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-919605786L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "axe(Lnet/minecraft/world/item/ToolMaterial;FF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void axe_989439867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(989439867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hoe(Lnet/minecraft/world/item/ToolMaterial;FF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void hoe__1857439669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857439669L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "shovel(Lnet/minecraft/world/item/ToolMaterial;FF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void shovel__155469242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155469242L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "useCooldown(F)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void useCooldown__364460626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-364460626L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "useItemDescriptionPrefix()Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void useItemDescriptionPrefix__1150689334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1150689334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useBlockDescriptionPrefix()Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void useBlockDescriptionPrefix__412615618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-412615618L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }


}
