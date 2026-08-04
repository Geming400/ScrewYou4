package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.Enchantment.Builder.class)
public class Builder366720040Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/item/enchantment/Enchantment;", cancellable = true)
    private void build_1744210778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744210778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEffect(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/enchantment/effects/EnchantmentAttributeEffect;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void withEffect_2077456394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077456394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEffect(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/enchantment/EnchantmentTarget;Lnet/minecraft/world/item/enchantment/EnchantmentTarget;Ljava/lang/Object;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void withEffect__422805013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-422805013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEffect(Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void withEffect_1866739291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866739291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEffect(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void withEffect_1438083035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1438083035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEffect(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void withEffect_498299967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498299967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEffect(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/enchantment/EnchantmentTarget;Lnet/minecraft/world/item/enchantment/EnchantmentTarget;Ljava/lang/Object;Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void withEffect_54940079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(54940079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSpecialEffect(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void withSpecialEffect_498299967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498299967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exclusiveWith(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/item/enchantment/Enchantment$Builder;", cancellable = true)
    private void exclusiveWith_1058181238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1058181238L))
            info.setReturnValue(null);
    }


}
