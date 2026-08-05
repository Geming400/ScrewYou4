package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.ArmorMaterial.class)
public class ArmorMaterial_1605523832Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_696897563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(696897563L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1919019940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1919019940L))
            info.setReturnValue("\u832Eo \u14B03\u4A75}Xkq,y!v\u6E07T2X\uC4CEWT7yUq\u489Df\u53C6K@v,^\uCDD8\uFB8D\uC740?qu{%\u6033W9]zs:\u36C9wELi=T\u8E30s x)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2132091374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2132091374L))
            info.setReturnValue(684959932);
    }

    @Inject(at = @At("HEAD"), method = "durability()I", cancellable = true)
    private void durability__144133900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-144133900L))
            info.setReturnValue(-2039420814);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes(Lnet/minecraft/world/item/equipment/ArmorType;)Lnet/minecraft/world/item/component/ItemAttributeModifiers;", cancellable = true)
    private void createAttributes__788796838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-788796838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assetId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void assetId_603711197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(603711197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defense()Ljava/util/Map;", cancellable = true)
    private void defense_1331659295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1331659295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toughness()F", cancellable = true)
    private void toughness_138156744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(138156744L))
            info.setReturnValue(2.272016E8F);
    }

    @Inject(at = @At("HEAD"), method = "equipSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void equipSound__1967707436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1967707436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knockbackResistance()F", cancellable = true)
    private void knockbackResistance_58160710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(58160710L))
            info.setReturnValue(2.272016E8F);
    }

    @Inject(at = @At("HEAD"), method = "repairIngredient()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void repairIngredient__516760810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-516760810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantmentValue()I", cancellable = true)
    private void enchantmentValue_1891462435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1891462435L))
            info.setReturnValue(1293114888);
    }


}
