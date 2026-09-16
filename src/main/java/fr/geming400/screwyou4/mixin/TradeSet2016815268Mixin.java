package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.TradeSet.class)
public class TradeSet2016815268Mixin {
        @Inject(at = @At("HEAD"), method = "allowDuplicates()Z", cancellable = true)
    private void allowDuplicates__489054198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-489054198L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTrades()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void getTrades_1879452541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1879452541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculateNumberOfTrades(Lnet/minecraft/world/level/storage/loot/LootContext;)I", cancellable = true)
    private void calculateNumberOfTrades__194297516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-194297516L))
            info.setReturnValue(-279784225);
    }

    @Inject(at = @At("HEAD"), method = "randomSequence()Ljava/util/Optional;", cancellable = true)
    private void randomSequence__1672725514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672725514L))
            info.setReturnValue(null);
    }


}
