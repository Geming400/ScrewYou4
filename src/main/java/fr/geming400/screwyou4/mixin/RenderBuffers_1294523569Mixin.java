package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.RenderBuffers.class)
public class RenderBuffers_1294523569Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__820051861(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-820051861L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_1108239697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1108239697L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sectionBufferPool()Lnet/minecraft/client/renderer/SectionBufferBuilderPool;", cancellable = true)
    private void sectionBufferPool__802116463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802116463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixedBufferPack()Lnet/minecraft/client/renderer/SectionBufferBuilderPack;", cancellable = true)
    private void fixedBufferPack_1942075200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1942075200L))
            info.setReturnValue(new net.minecraft.client.renderer.SectionBufferBuilderPack());
    }

    @Inject(at = @At("HEAD"), method = "stagedVertexBuffer()Lnet/minecraft/client/renderer/StagedVertexBuffer;", cancellable = true)
    private void stagedVertexBuffer__196449118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-196449118L))
            info.setReturnValue(null);
    }


}
