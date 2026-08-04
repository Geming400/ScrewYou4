package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.sounds.SoundSource.class)
public class SoundSource218138284Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__917322187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-917322187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private static void values_613675768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613675768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private static void valueOf_697102901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(697102901L))
            info.setReturnValue(null);
    }


}
