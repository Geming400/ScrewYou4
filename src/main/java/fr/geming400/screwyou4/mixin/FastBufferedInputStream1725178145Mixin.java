package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.FastBufferedInputStream.class)
public class FastBufferedInputStream1725178145Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__389397284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-389397284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read([BII)I", cancellable = true)
    private void read__1185061544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1185061544L))
            info.setReturnValue(677986398);
    }

    @Inject(at = @At("HEAD"), method = "read()I", cancellable = true)
    private void read_558705457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558705457L))
            info.setReturnValue(2087715393);
    }

    @Inject(at = @At("HEAD"), method = "skip(J)J", cancellable = true)
    private void skip_619347201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(619347201L))
            info.setReturnValue(-6690004874296930687L);
    }

    @Inject(at = @At("HEAD"), method = "available()I", cancellable = true)
    private void available__381763106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381763106L))
            info.setReturnValue(1619335733);
    }


}
