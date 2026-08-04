package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.TradeRebalanceLootTableProvider.class)
public class TradeRebalanceLootTableProvider_11930396Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/data/PackOutput;Ljava/util/concurrent/CompletableFuture;)Lnet/minecraft/data/loot/LootTableProvider;", cancellable = true)
    private static void create_291009280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291009280L))
            info.setReturnValue(null);
    }


}
