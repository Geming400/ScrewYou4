package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dedicated.ServerWatchdog.class)
public class ServerWatchdog1924491378Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_1962766117(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1962766117L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createWatchdogCrashReport(Ljava/lang/String;J)Lnet/minecraft/CrashReport;", cancellable = true)
    private static void createWatchdogCrashReport_1412688087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1412688087L))
            info.setReturnValue(null);
    }


}
