package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.providers.EnchantmentsByCostWithDifficulty.class)
public class EnchantmentsByCostWithDifficulty_1610859197Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1298595841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298595841L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_475399221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(475399221L))
            info.setReturnValue("cOo=%}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1649121938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649121938L))
            info.setReturnValue(-966067959);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__948254376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-948254376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantments()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void enchantments__1064155056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1064155056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minCost()I", cancellable = true)
    private void minCost_1649121442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649121442L))
            info.setReturnValue(-787544470);
    }

    @Inject(at = @At("HEAD"), method = "enchant(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/enchantment/ItemEnchantments$Mutable;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/DifficultyInstance;)V", cancellable = true)
    private void enchant__843245569(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-843245569L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "maxCostSpan()I", cancellable = true)
    private void maxCostSpan_1649121442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649121442L))
            info.setReturnValue(-787544470);
    }


}
