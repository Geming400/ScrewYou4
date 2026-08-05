package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.EnchantmentAttributeEffect.class)
public class EnchantmentAttributeEffect572449560Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__336176708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-336176708L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1342873085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342873085L))
            info.setReturnValue("x>4UqG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1129801651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129801651L))
            info.setReturnValue(-890560945);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__2020328326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2020328326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/core/Holder;", cancellable = true)
    private void attribute_748346616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(748346616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "amount()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void amount_1739781471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1739781471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1638894814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1638894814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModifier(ILnet/minecraft/util/StringRepresentable;)Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;", cancellable = true)
    private void getModifier__2007218910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007218910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onChangedBlock(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Z)V", cancellable = true)
    private void onChangedBlock__555915611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-555915611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDeactivated(Lnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private void onDeactivated_1124924835(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1124924835L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "operation()Lnet/minecraft/world/entity/ai/attributes/AttributeModifier$Operation;", cancellable = true)
    private void operation_2069007043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2069007043L))
            info.setReturnValue(net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
    }


}
