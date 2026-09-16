package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.MappableRingBuffer.class)
public class MappableRingBuffer_337426460Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_781158048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(781158048L))
            info.setReturnValue(945181836);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1777148970(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1777148970L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rotate()V", cancellable = true)
    private void rotate__2146106797(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2146106797L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "currentBuffer()Lcom/mojang/blaze3d/buffers/GpuBuffer;", cancellable = true)
    private void currentBuffer__1650866595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1650866595L))
            info.setReturnValue(null);
    }


}
