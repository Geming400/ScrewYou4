package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.MerchantOffers.class)
public class MerchantOffers1856508421Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/item/trading/MerchantOffers;", cancellable = true)
    private void copy_1053197105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1053197105L))
            info.setReturnValue(new net.minecraft.world.item.trading.MerchantOffers());
    }

    @Inject(at = @At("HEAD"), method = "getRecipeFor(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;I)Lnet/minecraft/world/item/trading/MerchantOffer;", cancellable = true)
    private void getRecipeFor__618414359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-618414359L))
            info.setReturnValue(null);
    }


}
