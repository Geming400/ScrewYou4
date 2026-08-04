package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.server.LanServerDetection.LanServerDetector.class)
public class LanServerDetector1110925397Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_1149200136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1149200136L))
            info.cancel();
    }


}
