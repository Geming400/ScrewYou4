package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.InputType.class)
public class InputType431474854Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/InputType;", cancellable = true)
    private static void values__440638257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-440638257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/InputType;", cancellable = true)
    private static void valueOf__391130026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391130026L))
            info.setReturnValue(net.minecraft.client.InputType.NONE);
    }

    @Inject(at = @At("HEAD"), method = "isMouse()Z", cancellable = true)
    private void isMouse__737428062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-737428062L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isKeyboard()Z", cancellable = true)
    private void isKeyboard_444078540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(444078540L))
            info.setReturnValue(true);
    }


}
