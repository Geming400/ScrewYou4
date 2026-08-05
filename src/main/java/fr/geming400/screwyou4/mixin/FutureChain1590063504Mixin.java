package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.FutureChain.class)
public class FutureChain1590063504Mixin {
        @Inject(at = @At("HEAD"), method = "append(Ljava/util/concurrent/CompletableFuture;Ljava/util/function/Consumer;)V", cancellable = true)
    private void append__1064582935(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1064582935L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__524511925(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524511925L))
            info.cancel();
    }


}
