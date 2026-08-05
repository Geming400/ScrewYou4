package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dedicated.ServerWatchdog.class)
public class ServerWatchdog1924491378Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run__1607363718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1607363718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createWatchdogCrashReport(Ljava/lang/String;J)Lnet/minecraft/CrashReport;", cancellable = true)
    private static void createWatchdogCrashReport_1062272297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062272297L))
            info.setReturnValue(null);
    }


}
