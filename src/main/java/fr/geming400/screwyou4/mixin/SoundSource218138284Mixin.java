package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.sounds.SoundSource.class)
public class SoundSource218138284Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1670708618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1670708618L))
            info.setReturnValue("Ldi#(vSPq>!\u386Cgp+eEUbC\"m5\u1EF8bP{bJ@v\u9F86");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private static void values__54414442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-54414442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private static void valueOf_278355293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(278355293L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.AMBIENT);
    }


}
