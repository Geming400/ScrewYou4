package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.RemoteFriendListUpdateHandler.State.class)
public class State_434232682Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/social/RemoteFriendListUpdateHandler$State;", cancellable = true)
    private static void values__1952256616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952256616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/social/RemoteFriendListUpdateHandler$State;", cancellable = true)
    private static void valueOf__603746959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603746959L))
            info.setReturnValue(net.minecraft.client.gui.screens.social.RemoteFriendListUpdateHandler.State.LOADING);
    }


}
