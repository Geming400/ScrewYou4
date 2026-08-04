package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.FutureChain.class)
public class FutureChain1590063504Mixin {
        @Inject(at = @At("HEAD"), method = "append(Ljava/util/concurrent/CompletableFuture;Ljava/util/function/Consumer;)V", cancellable = true)
    private void append__1385866673(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1385866673L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1628338243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1628338243L))
            info.cancel();
    }


}
