package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.registries.TradeRebalanceRegistries.class)
public class TradeRebalanceRegistries545193556Mixin {
        @Inject(at = @At("HEAD"), method = "createLookup(Ljava/util/concurrent/CompletableFuture;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void createLookup__582085663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-582085663L))
            info.setReturnValue(null);
    }


}
