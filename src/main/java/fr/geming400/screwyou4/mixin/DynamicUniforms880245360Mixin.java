package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.DynamicUniforms.class)
public class DynamicUniforms880245360Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__849191628(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-849191628L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1234330069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1234330069L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeTransform(Lorg/joml/Matrix4f;Lorg/joml/Vector4f;Lorg/joml/Vector3f;Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeTransform__831206341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831206341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeTransform(Lnet/minecraft/client/renderer/DynamicUniforms$Transform;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeTransform_1006512769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1006512769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeTransform(Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeTransform_97549466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(97549466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeTransform(Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeTransform__2098409608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2098409608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeTransform(Lorg/joml/Matrix4f;Lorg/joml/Vector4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeTransform__934695080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-934695080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeTransforms([Lnet/minecraft/client/renderer/DynamicUniforms$Transform;)[Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeTransforms__10067214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-10067214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeChunkSections([Lnet/minecraft/client/renderer/DynamicUniforms$ChunkSectionInfo;)[Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeChunkSections_323031040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(323031040L))
            info.setReturnValue(null);
    }


}
