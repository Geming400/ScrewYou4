package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.RemoteFriendListUpdateHandler.State.class)
public class State_434232682Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/social/RemoteFriendListUpdateHandler$State;", cancellable = true)
    private static void values_1090495734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090495734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/social/RemoteFriendListUpdateHandler$State;", cancellable = true)
    private static void valueOf__1068342887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1068342887L))
            info.setReturnValue(null);
    }


}
