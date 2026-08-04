package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ClientBootstrap.class)
public class ClientBootstrap915826261Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap()V", cancellable = true)
    private static void bootstrap_954101248(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(954101248L))
            info.cancel();
    }


}
