package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ExceptionCollector.class)
public class ExceptionCollector2146365956Mixin {
        @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Throwable;)V", cancellable = true)
    private void add__1861713021(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1861713021L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "throwIfPresent()V", cancellable = true)
    private void throwIfPresent__1412578529(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1412578529L))
            info.cancel();
    }


}
