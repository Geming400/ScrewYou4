package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.Item.Properties.class)
public class Properties_1847849410Mixin {
        @Inject(at = @At("HEAD"), method = "component(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void component__651711542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-651711542L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "attributes(Lnet/minecraft/world/item/component/ItemAttributeModifiers;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void attributes__2077830673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2077830673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setId(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void setId__922674382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-922674382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantable(I)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void enchantable__761133347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-761133347L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures(Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void requiredFeatures__905229519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-905229519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures([Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void requiredFeatures_643408300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643408300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideDescription(Ljava/lang/String;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void overrideDescription__487669140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-487669140L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "durability(I)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void durability__761133347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-761133347L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "food(Lnet/minecraft/world/food/FoodProperties;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void food__499231632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499231632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "food(Lnet/minecraft/world/food/FoodProperties;Lnet/minecraft/world/item/component/Consumable;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void food_995784613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995784613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rarity(Lnet/minecraft/world/item/Rarity;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void rarity__55372587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-55372587L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "tool(Lnet/minecraft/world/item/ToolMaterial;Lnet/minecraft/tags/TagKey;FFF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void tool_788993603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788993603L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "equippable(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void equippable_1141578488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141578488L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "repairable(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void repairable_603456262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(603456262L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "repairable(Lnet/minecraft/world/item/Item;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void repairable__131039747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131039747L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "stacksTo(I)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void stacksTo__761133347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-761133347L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "sword(Lnet/minecraft/world/item/ToolMaterial;FF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void sword__14532023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-14532023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pickaxe(Lnet/minecraft/world/item/ToolMaterial;FF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void pickaxe__14532023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-14532023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnEgg(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void spawnEgg__879105961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-879105961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wolfArmor(Lnet/minecraft/world/item/equipment/ArmorMaterial;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void wolfArmor_1874031745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874031745L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "spear(Lnet/minecraft/world/item/ToolMaterial;FFFFFFFFF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void spear_52082637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(52082637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horseArmor(Lnet/minecraft/world/item/equipment/ArmorMaterial;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void horseArmor_1874031745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874031745L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "hoe(Lnet/minecraft/world/item/ToolMaterial;FF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void hoe__14532023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-14532023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shovel(Lnet/minecraft/world/item/ToolMaterial;FF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void shovel__14532023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-14532023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "axe(Lnet/minecraft/world/item/ToolMaterial;FF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void axe__14532023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-14532023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useCooldown(F)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void useCooldown__1506058752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506058752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usingConvertsTo(Lnet/minecraft/world/item/Item;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void usingConvertsTo__131039747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131039747L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "trimMaterial(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void trimMaterial__922674382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-922674382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useItemDescriptionPrefix()Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void useItemDescriptionPrefix__1893545162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1893545162L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "humanoidArmor(Lnet/minecraft/world/item/equipment/ArmorMaterial;Lnet/minecraft/world/item/equipment/ArmorType;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void humanoidArmor__797673761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-797673761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "delayedHolderComponent(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void delayedHolderComponent__420301182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-420301182L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "fireResistant()Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void fireResistant__1893545162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1893545162L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "useBlockDescriptionPrefix()Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void useBlockDescriptionPrefix__1893545162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1893545162L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "craftRemainder(Lnet/minecraft/world/item/ItemStackTemplate;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void craftRemainder_1071942603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1071942603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftRemainder(Lnet/minecraft/world/item/Item;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void craftRemainder__131039747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131039747L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "itemIdOrThrow()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void itemIdOrThrow__1638626078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1638626078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jukeboxPlayable(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void jukeboxPlayable__922674382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-922674382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equippableUnswappable(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void equippableUnswappable_1141578488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141578488L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "nautilusArmor(Lnet/minecraft/world/item/equipment/ArmorMaterial;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void nautilusArmor_1874031745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874031745L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "delayedComponent(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/core/component/DataComponentInitializers$SingleComponentInitializer;)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void delayedComponent_976950122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(976950122L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "effectiveModel()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void effectiveModel__595217144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595217144L))
            info.setReturnValue(null);
    }


}
