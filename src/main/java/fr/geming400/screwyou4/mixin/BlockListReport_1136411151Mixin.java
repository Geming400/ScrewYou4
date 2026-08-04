package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.info.BlockListReport.class)
public class BlockListReport_1136411151Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_950679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1862933608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862933608L))
            info.setReturnValue(null);
    }


}
