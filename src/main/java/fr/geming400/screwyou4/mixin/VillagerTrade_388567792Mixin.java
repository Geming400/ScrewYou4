package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.VillagerTrade.class)
public class VillagerTrade_388567792Mixin {
        @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__630150980(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-630150980L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOffer(Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/trading/MerchantOffer;", cancellable = true)
    private void getOffer_83741577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(83741577L))
            info.setReturnValue(null);
    }


}
