package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.ScopedCollector.class)
public class ScopedCollector_531607853Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_569882591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(569882591L))
            info.cancel();
    }


}
