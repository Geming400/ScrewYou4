package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.Toast.Visibility.class)
public class Visibility137885909Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private static void values_1652185245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1652185245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private static void valueOf__1042298250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042298250L))
            info.setReturnValue(net.minecraft.client.gui.components.toasts.Toast.Visibility.HIDE);
    }

    @Inject(at = @At("HEAD"), method = "playSound(Lnet/minecraft/client/sounds/SoundManager;)V", cancellable = true)
    private void playSound__1895957949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1895957949L))
            info.cancel();
    }


}
