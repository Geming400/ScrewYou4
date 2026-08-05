package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.SoundEngineExecutor.class)
public class SoundEngineExecutor1256235222Mixin {
        @Inject(at = @At("HEAD"), method = "schedule(Ljava/lang/Runnable;)V", cancellable = true)
    private void schedule__1581990393(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1581990393L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shutDown()V", cancellable = true)
    private void shutDown_1294509961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1294509961L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startUp()V", cancellable = true)
    private void startUp_1294509961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1294509961L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "wrapRunnable(Ljava/lang/Runnable;)Ljava/lang/Runnable;", cancellable = true)
    private void wrapRunnable__329981355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329981355L))
            info.setReturnValue(null);
    }


}
