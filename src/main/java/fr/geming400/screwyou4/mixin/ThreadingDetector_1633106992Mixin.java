package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ThreadingDetector.class)
public class ThreadingDetector_1633106992Mixin {
        @Inject(at = @At("HEAD"), method = "makeThreadingException(Ljava/lang/String;Ljava/lang/Thread;)Lnet/minecraft/ReportedException;", cancellable = true)
    private static void makeThreadingException_1176367806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1176367806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkAndUnlock()V", cancellable = true)
    private void checkAndUnlock_1671381730(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1671381730L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkAndLock()V", cancellable = true)
    private void checkAndLock_1671381730(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1671381730L))
            info.cancel();
    }


}
