package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.Enchantment.Builder.class)
public class Builder366720040Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/item/enchantment/Enchantment;", cancellable = true)
    private void build_98407496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98407496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exclusiveWith(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void exclusiveWith__1125865734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1125865734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSpecialEffect(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void withSpecialEffect_1893489859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1893489859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEffect(Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void withEffect__458799086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-458799086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEffect(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/enchantment/effects/EnchantmentAttributeEffect;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void withEffect__320433101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-320433101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEffect(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void withEffect__1254158524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1254158524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEffect(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void withEffect__928109002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-928109002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEffect(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/enchantment/EnchantmentTarget;Lnet/minecraft/world/item/enchantment/EnchantmentTarget;Ljava/lang/Object;Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void withEffect_2016697112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2016697112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEffect(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/enchantment/EnchantmentTarget;Lnet/minecraft/world/item/enchantment/EnchantmentTarget;Ljava/lang/Object;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void withEffect__845571614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845571614L))
            info.setReturnValue(null);
    }


}
