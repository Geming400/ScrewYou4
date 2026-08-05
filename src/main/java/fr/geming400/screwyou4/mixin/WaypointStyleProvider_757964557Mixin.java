package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.WaypointStyleProvider.class)
public class WaypointStyleProvider_757964557Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1130882346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1130882346L))
            info.setReturnValue("a");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_857690299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857690299L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
