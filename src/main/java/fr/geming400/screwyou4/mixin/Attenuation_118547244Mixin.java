package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.SoundInstance.Attenuation.class)
public class Attenuation_118547244Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/sounds/SoundInstance$Attenuation;", cancellable = true)
    private static void values_69477621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69477621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/sounds/SoundInstance$Attenuation;", cancellable = true)
    private static void valueOf__481657320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-481657320L))
            info.setReturnValue(null);
    }


}
