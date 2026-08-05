package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.ArmorMaterial.class)
public class ArmorMaterial_1605523832Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1303931206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1303931206L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_470063856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(470063856L))
            info.setReturnValue(":\uB83F7g\u6F97YNB'\uCF8C$XZ\uD735_XAiCn2o\u5219#&/,|kvAM?Px5B17z1S)Y\u2B9D7yx>6'Fi:H1n\u87D60A&Iwq39N#d%\u0533\uD37E\uACA810N&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1643786573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643786573L))
            info.setReturnValue(1748736140);
    }

    @Inject(at = @At("HEAD"), method = "defense()Ljava/util/Map;", cancellable = true)
    private void defense__399099809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399099809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toughness()F", cancellable = true)
    private void toughness_1643783194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643783194L))
            info.setReturnValue(2.830267E8F);
    }

    @Inject(at = @At("HEAD"), method = "assetId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void assetId__1880952152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1880952152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "durability()I", cancellable = true)
    private void durability_1643786077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643786077L))
            info.setReturnValue(375952064);
    }

    @Inject(at = @At("HEAD"), method = "equipSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void equipSound__1140567693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1140567693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes(Lnet/minecraft/world/item/equipment/ArmorType;)Lnet/minecraft/world/item/component/ItemAttributeModifiers;", cancellable = true)
    private void createAttributes__2075758867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2075758867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantmentValue()I", cancellable = true)
    private void enchantmentValue_1643786077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643786077L))
            info.setReturnValue(375952064);
    }

    @Inject(at = @At("HEAD"), method = "repairIngredient()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void repairIngredient__1842109420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1842109420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knockbackResistance()F", cancellable = true)
    private void knockbackResistance_1643783194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643783194L))
            info.setReturnValue(2.830267E8F);
    }


}
