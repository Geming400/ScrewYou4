package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.sounds.Musics.class)
public class Musics306038768Mixin {
        @Inject(at = @At("HEAD"), method = "createGameMusic(Lnet/minecraft/core/Holder;)Lnet/minecraft/sounds/Music;", cancellable = true)
    private static void createGameMusic__1728918503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1728918503L))
            info.setReturnValue(null);
    }


}
