package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.ChunkSectionsToRender.class)
public class ChunkSectionsToRender744761230Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__163865038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-163865038L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1515184755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1515184755L))
            info.setReturnValue("-*Z0\uB7D6y\u3410m\u3DF4#1\u300BQzH\uB39F!Ns[I5X}=ag@MKMoZQsL\u62FB&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1302113321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302113321L))
            info.setReturnValue(-998441768);
    }

    @Inject(at = @At("HEAD"), method = "maxIndicesRequired()I", cancellable = true)
    private void maxIndicesRequired__2144581550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144581550L))
            info.setReturnValue(-954688182);
    }

    @Inject(at = @At("HEAD"), method = "drawGroupsPerLayer()Ljava/util/EnumMap;", cancellable = true)
    private void drawGroupsPerLayer_621808971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621808971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkSectionInfos()[Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void chunkSectionInfos__200562375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-200562375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderGroup(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayerGroup;Lcom/mojang/blaze3d/textures/GpuSampler;)V", cancellable = true)
    private void renderGroup__1203800214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1203800214L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textureView()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void textureView_1793322268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1793322268L))
            info.setReturnValue(null);
    }


}
