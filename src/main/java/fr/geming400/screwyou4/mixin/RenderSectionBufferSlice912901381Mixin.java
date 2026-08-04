package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionRenderDispatcher.RenderSectionBufferSlice.class)
public class RenderSectionBufferSlice912901381Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1996553656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996553656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__222558594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-222558594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_951164123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951164123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indexBufferOffset()J", cancellable = true)
    private void indexBufferOffset_951164588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951164588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vertexBufferOffset()J", cancellable = true)
    private void vertexBufferOffset_951164588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951164588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vertexBuffer()Lcom/mojang/blaze3d/buffers/GpuBuffer;", cancellable = true)
    private void vertexBuffer_685065070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(685065070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indexBuffer()Lcom/mojang/blaze3d/buffers/GpuBuffer;", cancellable = true)
    private void indexBuffer_685065070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(685065070L))
            info.setReturnValue(null);
    }


}
