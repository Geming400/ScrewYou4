package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.WaypointStyleProvider.class)
public class WaypointStyleProvider_757964557Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__377495915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377495915L))
            info.setReturnValue("m9}5T:=O)||*+rFE E^kLS:uh\uBCB6:\u0397\uD135.zU+g");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1484487014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1484487014L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
