package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.ChunkedSampleByteBuf.class)
public class ChunkedSampleByteBuf336391385Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_780122974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(780122974L))
            info.setReturnValue(-421455606);
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/nio/ByteBuffer;", cancellable = true)
    private void get__930568841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930568841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accept(F)V", cancellable = true)
    private void accept_1027300490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1027300490L))
            info.cancel();
    }


}
