package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.info.RegistryComponentsReport.class)
public class RegistryComponentsReport_1254439819Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_118979347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(118979347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1980962276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980962276L))
            info.setReturnValue(null);
    }


}
