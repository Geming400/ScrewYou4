package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.MappableRingBuffer.class)
public class MappableRingBuffer_337426460Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_375688705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(375688705L))
            info.setReturnValue(-1868782807);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_375701198(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(375701198L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rotate()V", cancellable = true)
    private void rotate_375701198(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(375701198L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "currentBuffer()Lcom/mojang/blaze3d/buffers/GpuBuffer;", cancellable = true)
    private void currentBuffer_109590148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109590148L))
            info.setReturnValue(null);
    }


}
