package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.Eula.class)
public class Eula1575682665Mixin {
        @Inject(at = @At("HEAD"), method = "hasAgreedToEULA()Z", cancellable = true)
    private void hasAgreedToEULA__1954245842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1954245842L))
            info.setReturnValue(true);
    }


}
