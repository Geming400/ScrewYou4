package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.providers.EnchantmentsByCost.class)
public class EnchantmentsByCost_1956965310Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1048339041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1048339041L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1567578462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1567578462L))
            info.setReturnValue("\u1D27CKva?{pr$8eFdnve'UJOq>;S(Ws]E\u5C6B\u421C6'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1780649896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1780649896L))
            info.setReturnValue(1037895184);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1271556733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1271556733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cost()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void cost_1719471193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1719471193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantments()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void enchantments__145619859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-145619859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchant(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/enchantment/ItemEnchantments$Mutable;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/DifficultyInstance;)V", cancellable = true)
    private void enchant__1284979257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1284979257L))
            info.cancel();
    }


}
