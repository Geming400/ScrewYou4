package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.ChunkedSampleByteBuf.class)
public class ChunkedSampleByteBuf336391385Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_374653631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(374653631L))
            info.setReturnValue(-1026325336);
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/nio/ByteBuffer;", cancellable = true)
    private void get_1895393293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1895393293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accept(F)V", cancellable = true)
    private void accept_1547537794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1547537794L))
            info.cancel();
    }


}
