package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.Eula.class)
public class Eula1575682665Mixin {
        @Inject(at = @At("HEAD"), method = "hasAgreedToEULA()Z", cancellable = true)
    private void hasAgreedToEULA_1613961248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613961248L))
            info.setReturnValue(null);
    }


}
