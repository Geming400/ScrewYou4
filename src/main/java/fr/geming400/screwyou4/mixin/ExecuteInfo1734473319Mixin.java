package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.StagedVertexBuffer.ExecuteInfo.class)
public class ExecuteInfo1734473319Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1174981718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1174981718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_599013344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(599013344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1772736061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1772736061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "firstIndex()I", cancellable = true)
    private void firstIndex_1772735565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1772735565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vertexBuffer()Lcom/mojang/blaze3d/buffers/GpuBuffer;", cancellable = true)
    private void vertexBuffer_1506637008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1506637008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indexBuffer()Lcom/mojang/blaze3d/buffers/GpuBuffer;", cancellable = true)
    private void indexBuffer_1506637008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1506637008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indexCount()I", cancellable = true)
    private void indexCount_1772735565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1772735565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indexType()Lcom/mojang/blaze3d/IndexType;", cancellable = true)
    private void indexType__1231608492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1231608492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseVertex()I", cancellable = true)
    private void baseVertex_1772735565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1772735565L))
            info.setReturnValue(null);
    }


}
