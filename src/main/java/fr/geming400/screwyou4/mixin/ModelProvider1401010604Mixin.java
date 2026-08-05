package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.ModelProvider.class)
public class ModelProvider1401010604Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__487836298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-487836298L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1500736347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1500736347L))
            info.setReturnValue(null);
    }


}
