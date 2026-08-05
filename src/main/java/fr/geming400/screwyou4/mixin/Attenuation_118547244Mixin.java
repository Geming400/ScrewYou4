package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.SoundInstance.Attenuation.class)
public class Attenuation_118547244Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/sounds/SoundInstance$Attenuation;", cancellable = true)
    private static void values__1543122793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1543122793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/sounds/SoundInstance$Attenuation;", cancellable = true)
    private static void valueOf_222080496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(222080496L))
            info.setReturnValue(net.minecraft.client.resources.sounds.SoundInstance.Attenuation.LINEAR);
    }


}
