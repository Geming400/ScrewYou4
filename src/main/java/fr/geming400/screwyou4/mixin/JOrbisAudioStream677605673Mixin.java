package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.JOrbisAudioStream.class)
public class JOrbisAudioStream677605673Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1436969756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1436969756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFormat()Ljavax/sound/sampled/AudioFormat;", cancellable = true)
    private void getFormat__266212575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-266212575L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readChunk(Lit/unimi/dsi/fastutil/floats/FloatConsumer;)Z", cancellable = true)
    private void readChunk__2055087639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2055087639L))
            info.setReturnValue(false);
    }


}
