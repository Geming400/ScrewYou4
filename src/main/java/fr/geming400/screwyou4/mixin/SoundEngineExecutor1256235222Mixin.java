package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.SoundEngineExecutor.class)
public class SoundEngineExecutor1256235222Mixin {
        @Inject(at = @At("HEAD"), method = "schedule(Ljava/lang/Runnable;)V", cancellable = true)
    private void schedule__1297714352(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1297714352L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "wrapRunnable(Ljava/lang/Runnable;)Ljava/lang/Runnable;", cancellable = true)
    private void wrapRunnable__492957348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-492957348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shutDown()V", cancellable = true)
    private void shutDown_260523731(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(260523731L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startUp()V", cancellable = true)
    private void startUp_830276364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(830276364L))
            info.cancel();
    }


}
