package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.CompressionDecoder.class)
public class CompressionDecoder_1584194188Mixin {
        @Inject(at = @At("HEAD"), method = "setThreshold(IZ)V", cancellable = true)
    private void setThreshold__739712602(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-739712602L))
            info.cancel();
    }


}
