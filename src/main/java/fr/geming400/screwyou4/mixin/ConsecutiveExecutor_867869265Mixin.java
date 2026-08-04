package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.thread.ConsecutiveExecutor.class)
public class ConsecutiveExecutor_867869265Mixin {
        @Inject(at = @At("HEAD"), method = "wrapRunnable(Ljava/lang/Runnable;)Ljava/lang/Runnable;", cancellable = true)
    private void wrapRunnable__718347313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-718347313L))
            info.setReturnValue(null);
    }


}
