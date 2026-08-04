package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.friends.FriendsListConfirmScreen.class)
public class FriendsListConfirmScreen_1069123757Mixin {
        @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_109436384(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(109436384L))
            info.cancel();
    }


}
