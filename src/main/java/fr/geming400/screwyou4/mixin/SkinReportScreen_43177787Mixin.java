package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.SkinReportScreen.class)
public class SkinReportScreen_43177787Mixin {
        @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased_266800080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(266800080L))
            info.setReturnValue(null);
    }


}
