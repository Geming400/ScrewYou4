package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.Toast.Visibility.class)
public class Visibility137885909Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private static void values__2009232389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2009232389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private static void valueOf__1066668386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1066668386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playSound(Lnet/minecraft/client/sounds/SoundManager;)V", cancellable = true)
    private void playSound__115303970(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-115303970L))
            info.cancel();
    }


}
