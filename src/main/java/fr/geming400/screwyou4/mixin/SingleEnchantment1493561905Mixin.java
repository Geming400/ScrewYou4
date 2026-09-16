package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.providers.SingleEnchantment.class)
public class SingleEnchantment1493561905Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_584935637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(584935637L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2030981866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2030981866L))
            info.setReturnValue("fA8$@\u9BB9j9hsbg2/\u3882\uA53B-m");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2050913996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2050913996L))
            info.setReturnValue(-1731618572);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void level__1355308618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1355308618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1734960137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1734960137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantment()Lnet/minecraft/core/Holder;", cancellable = true)
    private void enchantment_360871446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360871446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchant(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/enchantment/ItemEnchantments$Mutable;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/DifficultyInstance;)V", cancellable = true)
    private void enchant__1748382661(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1748382661L))
            info.cancel();
    }


}
