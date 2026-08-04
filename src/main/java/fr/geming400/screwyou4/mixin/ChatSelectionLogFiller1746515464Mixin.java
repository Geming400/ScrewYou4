package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ChatSelectionLogFiller.class)
public class ChatSelectionLogFiller1746515464Mixin {
        @Inject(at = @At("HEAD"), method = "fillNextPage(ILnet/minecraft/client/gui/screens/reporting/ChatSelectionLogFiller$Output;)V", cancellable = true)
    private void fillNextPage__940493621(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-940493621L))
            info.cancel();
    }


}
