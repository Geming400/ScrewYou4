package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.quickplay.QuickPlayLog.class)
public class QuickPlayLog2072949137Mixin {
        @Inject(at = @At("HEAD"), method = "log(Lnet/minecraft/client/Minecraft;)V", cancellable = true)
    private void log__1978273482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1978273482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/String;)Lnet/minecraft/client/quickplay/QuickPlayLog;", cancellable = true)
    private static void of__1511319274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1511319274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setWorldData(Lnet/minecraft/client/quickplay/QuickPlayLog$Type;Ljava/lang/String;Ljava/lang/String;)V", cancellable = true)
    private void setWorldData__769489462(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-769489462L))
            info.cancel();
    }


}
