package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ExceptionCollector.class)
public class ExceptionCollector2146365956Mixin {
        @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Throwable;)V", cancellable = true)
    private void add_1953595938(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1953595938L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "throwIfPresent()V", cancellable = true)
    private void throwIfPresent__2110326601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2110326601L))
            info.cancel();
    }


}
