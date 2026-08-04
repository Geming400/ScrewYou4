package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.TradeSet.class)
public class TradeSet2016815268Mixin {
        @Inject(at = @At("HEAD"), method = "allowDuplicates()Z", cancellable = true)
    private void allowDuplicates_2055093851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055093851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTrades()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void getTrades__658198984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-658198984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomSequence()Ljava/util/Optional;", cancellable = true)
    private void randomSequence__2032690606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2032690606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculateNumberOfTrades(Lnet/minecraft/world/level/storage/loot/LootContext;)I", cancellable = true)
    private void calculateNumberOfTrades__360150167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-360150167L))
            info.setReturnValue(null);
    }


}
