package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.TargetedConditionalEffect.class)
public class TargetedConditionalEffect_1698111607Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_789485338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789485338L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1826432165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826432165L))
            info.setReturnValue("JKN#\u45F0(.ZnZ%\u87CDeN7h-][Lqo)s=\u6A54W)\u2BF73|\u2EC6kK|nCa\uBF14HrPS#\u8B7C!y\uB4FA72&3&\uCE36S?GYmeZi\u9ABB\u1DC5l`qU;\"w*ORo\u985C0?g");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2039503599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2039503599L))
            info.setReturnValue(-559674531);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__1882786503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1882786503L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_679392835(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(679392835L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "affected()Lnet/minecraft/world/item/enchantment/EnchantmentTarget;", cancellable = true)
    private void affected_1486431123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1486431123L))
            info.setReturnValue(net.minecraft.world.item.enchantment.EnchantmentTarget.DAMAGING_ENTITY);
    }

    @Inject(at = @At("HEAD"), method = "effect()Ljava/lang/Object;", cancellable = true)
    private void effect__1551504158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551504158L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_2049760419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049760419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchanted()Lnet/minecraft/world/item/enchantment/EnchantmentTarget;", cancellable = true)
    private void enchanted__140215849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-140215849L))
            info.setReturnValue(net.minecraft.world.item.enchantment.EnchantmentTarget.DAMAGING_ENTITY);
    }

    @Inject(at = @At("HEAD"), method = "equipmentDropsCodec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void equipmentDropsCodec_16117453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(16117453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requirements()Ljava/util/Optional;", cancellable = true)
    private void requirements_741510836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741510836L))
            info.setReturnValue(null);
    }


}
