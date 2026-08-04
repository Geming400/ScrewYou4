package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.LoopingAudioStream.class)
public class LoopingAudioStream_220558116Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_258832854(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(258832854L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(I)Ljava/nio/ByteBuffer;", cancellable = true)
    private void read__1103046576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1103046576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFormat()Ljavax/sound/sampled/AudioFormat;", cancellable = true)
    private void getFormat_43501544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43501544L))
            info.setReturnValue(null);
    }


}
