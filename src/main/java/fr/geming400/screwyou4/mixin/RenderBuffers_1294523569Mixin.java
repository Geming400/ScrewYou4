package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.RenderBuffers.class)
public class RenderBuffers_1294523569Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1332798307(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1332798307L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_1332798307(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1332798307L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sectionBufferPool()Lnet/minecraft/client/renderer/SectionBufferBuilderPool;", cancellable = true)
    private void sectionBufferPool_1147480784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1147480784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stagedVertexBuffer()Lnet/minecraft/client/renderer/StagedVertexBuffer;", cancellable = true)
    private void stagedVertexBuffer_924596440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924596440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixedBufferPack()Lnet/minecraft/client/renderer/SectionBufferBuilderPack;", cancellable = true)
    private void fixedBufferPack_735560627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735560627L))
            info.setReturnValue(new net.minecraft.client.renderer.SectionBufferBuilderPack());
    }


}
