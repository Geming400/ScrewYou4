package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.SummaryReporter.class)
public class SummaryReporter_629520327Mixin {
        @Inject(at = @At("HEAD"), method = "recordingStopped(Ljava/nio/file/Path;)V", cancellable = true)
    private void recordingStopped__2058160168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2058160168L))
            info.cancel();
    }


}
