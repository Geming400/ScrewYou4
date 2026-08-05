package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.DefaultUncaughtExceptionHandlerWithName.class)
public class DefaultUncaughtExceptionHandlerWithName_171160268Mixin {
        @Inject(at = @At("HEAD"), method = "uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V", cancellable = true)
    private void uncaughtException__788990382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-788990382L))
            info.cancel();
    }


}
