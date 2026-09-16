package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.StagedVertexBuffer.ExecuteInfo.class)
public class ExecuteInfo1734473319Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_825847051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(825847051L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1790070452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790070452L))
            info.setReturnValue("4BChY9z\u10EDiu!p6a@iv;-k\u57B1`W!@'\u25B5\uCD9E3eHB8\"N\u2968./3])z%@qCk(3\u562E}S\u982B\u9CB1lNI\u6808-\u5DF1X#*ZE Mg\u3527qR13q,\u635D,9Y\u4A24ku");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2003141886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2003141886L))
            info.setReturnValue(-1136982554);
    }

    @Inject(at = @At("HEAD"), method = "vertexBuffer()Lcom/mojang/blaze3d/buffers/GpuBuffer;", cancellable = true)
    private void vertexBuffer_1471731412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471731412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indexBuffer()Lcom/mojang/blaze3d/buffers/GpuBuffer;", cancellable = true)
    private void indexBuffer__1813841406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1813841406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "firstIndex()I", cancellable = true)
    private void firstIndex__1682019957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682019957L))
            info.setReturnValue(1478954263);
    }

    @Inject(at = @At("HEAD"), method = "indexType()Lcom/mojang/blaze3d/IndexType;", cancellable = true)
    private void indexType_442092928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(442092928L))
            info.setReturnValue(com.mojang.blaze3d.IndexType.SHORT);
    }

    @Inject(at = @At("HEAD"), method = "indexCount()I", cancellable = true)
    private void indexCount__2061798640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061798640L))
            info.setReturnValue(-2089415276);
    }

    @Inject(at = @At("HEAD"), method = "baseVertex()I", cancellable = true)
    private void baseVertex__1131518568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1131518568L))
            info.setReturnValue(-688602628);
    }


}
