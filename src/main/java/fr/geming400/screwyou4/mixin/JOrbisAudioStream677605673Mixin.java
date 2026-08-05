package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.JOrbisAudioStream.class)
public class JOrbisAudioStream677605673Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_715880412(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(715880412L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFormat()Ljavax/sound/sampled/AudioFormat;", cancellable = true)
    private void getFormat_500549102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500549102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readChunk(Lit/unimi/dsi/fastutil/floats/FloatConsumer;)Z", cancellable = true)
    private void readChunk_625428352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625428352L))
            info.setReturnValue(false);
    }


}
