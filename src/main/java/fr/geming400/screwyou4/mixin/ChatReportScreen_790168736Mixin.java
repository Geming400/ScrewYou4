package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ChatReportScreen.class)
public class ChatReportScreen_790168736Mixin {
        @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased_1013791029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013791029L))
            info.setReturnValue(false);
    }


}
