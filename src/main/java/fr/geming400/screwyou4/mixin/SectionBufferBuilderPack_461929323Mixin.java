package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SectionBufferBuilderPack.class)
public class SectionBufferBuilderPack_461929323Mixin {
        @Inject(at = @At("HEAD"), method = "buffer(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)Lcom/mojang/blaze3d/vertex/ByteBufferBuilder;", cancellable = true)
    private void buffer_2085107671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085107671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_500204061(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(500204061L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearAll()V", cancellable = true)
    private void clearAll_500204061(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(500204061L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "discardAll()V", cancellable = true)
    private void discardAll_500204061(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(500204061L))
            info.cancel();
    }


}
