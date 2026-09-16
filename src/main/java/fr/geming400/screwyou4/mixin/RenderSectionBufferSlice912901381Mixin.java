package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionRenderDispatcher.RenderSectionBufferSlice.class)
public class RenderSectionBufferSlice912901381Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_4275113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(4275113L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1683324906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683324906L))
            info.setReturnValue("f\uA5F0MI");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1470253472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470253472L))
            info.setReturnValue(1464576887);
    }

    @Inject(at = @At("HEAD"), method = "vertexBuffer()Lcom/mojang/blaze3d/buffers/GpuBuffer;", cancellable = true)
    private void vertexBuffer_650159474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650159474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indexBuffer()Lcom/mojang/blaze3d/buffers/GpuBuffer;", cancellable = true)
    private void indexBuffer_1659553952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659553952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indexBufferOffset()J", cancellable = true)
    private void indexBufferOffset_1932369639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932369639L))
            info.setReturnValue(7789988087223897861L);
    }

    @Inject(at = @At("HEAD"), method = "vertexBufferOffset()J", cancellable = true)
    private void vertexBufferOffset_947164245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947164245L))
            info.setReturnValue(5935182622475746866L);
    }


}
