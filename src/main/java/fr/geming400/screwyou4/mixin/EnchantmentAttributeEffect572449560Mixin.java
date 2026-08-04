package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.EnchantmentAttributeEffect.class)
public class EnchantmentAttributeEffect572449560Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1957961819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957961819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__563010415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-563010415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_610712302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610712302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1870616993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1870616993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/core/Holder;", cancellable = true)
    private void attribute_2121325332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2121325332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "amount()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void amount_704529159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704529159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operation()Lnet/minecraft/world/entity/ai/attributes/AttributeModifier$Operation;", cancellable = true)
    private void operation__871185892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-871185892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1986664012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1986664012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onChangedBlock(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Z)V", cancellable = true)
    private void onChangedBlock_424148717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(424148717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getModifier(ILnet/minecraft/util/StringRepresentable;)Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;", cancellable = true)
    private void getModifier__548822321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-548822321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onDeactivated(Lnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private void onDeactivated__654257516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-654257516L))
            info.cancel();
    }


}
