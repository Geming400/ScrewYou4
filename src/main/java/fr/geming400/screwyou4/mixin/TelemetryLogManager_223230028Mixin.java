package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryLogManager.class)
public class TelemetryLogManager_223230028Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1891345402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1891345402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "open(Ljava/nio/file/Path;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void open__563863189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-563863189L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "openLogger()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void openLogger__1028089374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028089374L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
