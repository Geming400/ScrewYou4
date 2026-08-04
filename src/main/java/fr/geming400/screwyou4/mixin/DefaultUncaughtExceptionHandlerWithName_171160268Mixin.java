package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.DefaultUncaughtExceptionHandlerWithName.class)
public class DefaultUncaughtExceptionHandlerWithName_171160268Mixin {
        @Inject(at = @At("HEAD"), method = "uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V", cancellable = true)
    private void uncaughtException__753391144(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-753391144L))
            info.cancel();
    }


}
