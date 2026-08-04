package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryLogManager.class)
public class TelemetryLogManager_223230028Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_261504766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(261504766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "open(Ljava/nio/file/Path;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void open__1727575263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1727575263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openLogger()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void openLogger_1936605288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1936605288L))
            info.setReturnValue(null);
    }


}
