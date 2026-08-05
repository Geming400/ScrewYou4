package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.OnlineOptionsScreen.class)
public class OnlineOptionsScreen1367238217Mixin {
        @Inject(at = @At("HEAD"), method = "confirmFriendsListEnabled(Lnet/minecraft/client/Minecraft;Ljava/lang/Runnable;Lnet/minecraft/client/gui/screens/Screen;)V", cancellable = true)
    private static void confirmFriendsListEnabled_288882865(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(288882865L))
            info.cancel();
    }


}
