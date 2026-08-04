package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.providers.SingleEnchantment.class)
public class SingleEnchantment1493561905Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1415893132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415893132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_358101930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(358101930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1531824647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1531824647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void level__976124998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-976124998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantment()Lnet/minecraft/core/Holder;", cancellable = true)
    private void enchantment__1252529619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1252529619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchant(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/enchantment/ItemEnchantments$Mutable;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/DifficultyInstance;)V", cancellable = true)
    private void enchant__960542860(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-960542860L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1065551667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1065551667L))
            info.setReturnValue(null);
    }


}
