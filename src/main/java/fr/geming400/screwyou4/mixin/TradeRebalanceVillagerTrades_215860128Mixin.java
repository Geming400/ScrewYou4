package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.TradeRebalanceVillagerTrades.class)
public class TradeRebalanceVillagerTrades_215860128Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void bootstrap_1897915393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897915393L))
            info.setReturnValue(null);
    }


}
