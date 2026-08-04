package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.DynamicUniforms.class)
public class DynamicUniforms880245360Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_918520099(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(918520099L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_918520099(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(918520099L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeTransform(Lorg/joml/Matrix4f;Lorg/joml/Vector4f;Lorg/joml/Vector3f;Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeTransform__1770318168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1770318168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeTransform(Lnet/minecraft/client/renderer/DynamicUniforms$Transform;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeTransform__1619098316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619098316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeTransform(Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeTransform_380260551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(380260551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeTransform(Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeTransform__1098876821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1098876821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeTransform(Lorg/joml/Matrix4f;Lorg/joml/Vector4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeTransform__651983995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-651983995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeChunkSections([Lnet/minecraft/client/renderer/DynamicUniforms$ChunkSectionInfo;)[Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeChunkSections__411515236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-411515236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeTransforms([Lnet/minecraft/client/renderer/DynamicUniforms$Transform;)[Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeTransforms_1104903852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104903852L))
            info.setReturnValue(null);
    }


}
