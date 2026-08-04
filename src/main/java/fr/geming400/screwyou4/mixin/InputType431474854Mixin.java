package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.InputType.class)
public class InputType431474854Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/InputType;", cancellable = true)
    private static void values_1115362481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115362481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/InputType;", cancellable = true)
    private static void valueOf__1892368594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892368594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isKeyboard()Z", cancellable = true)
    private void isKeyboard_469753437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(469753437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isMouse()Z", cancellable = true)
    private void isMouse_469753437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(469753437L))
            info.setReturnValue(null);
    }


}
