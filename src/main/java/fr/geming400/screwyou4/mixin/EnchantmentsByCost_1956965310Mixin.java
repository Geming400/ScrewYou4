package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.providers.EnchantmentsByCost.class)
public class EnchantmentsByCost_1956965310Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__952489728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-952489728L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_821505334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821505334L))
            info.setReturnValue("╶K05Q.{C䯭:Bf_SO꼦%sBI6Vcy 4Ye(|J7VMEXF㝞TwCum{)I|OY2a.K_5Vn#㕂]-eueU9LIGea㼄yT蕊.=00W*+n@㥦lT]염oA)ns");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1995228051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1995228051L))
            info.setReturnValue(-434073254);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__602148263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-602148263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantments()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void enchantments__718048943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-718048943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cost()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void cost__512721594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-512721594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchant(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/enchantment/ItemEnchantments$Mutable;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/DifficultyInstance;)V", cancellable = true)
    private void enchant__497139456(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-497139456L))
            info.cancel();
    }


}
