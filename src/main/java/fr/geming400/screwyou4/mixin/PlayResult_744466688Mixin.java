package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.SoundEngine.PlayResult.class)
public class PlayResult_744466688Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/sounds/SoundEngine$PlayResult;", cancellable = true)
    private static void values_883249437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(883249437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/sounds/SoundEngine$PlayResult;", cancellable = true)
    private static void valueOf_926201636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(926201636L))
            info.setReturnValue(net.minecraft.client.sounds.SoundEngine.PlayResult.NOT_STARTED);
    }


}
