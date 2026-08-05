package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.DefaultUncaughtExceptionHandler.class)
public class DefaultUncaughtExceptionHandler_1882584093Mixin {
        @Inject(at = @At("HEAD"), method = "uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V", cancellable = true)
    private void uncaughtException_922433443(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(922433443L))
            info.cancel();
    }


}
