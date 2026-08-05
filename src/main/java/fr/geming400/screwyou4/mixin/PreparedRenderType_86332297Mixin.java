package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.PreparedRenderType.class)
public class PreparedRenderType_86332297Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1471844555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471844555L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1049127679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1049127679L))
            info.setReturnValue("&R6c\u3C92");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_124595038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(124595038L))
            info.setReturnValue(1519696072);
    }

    @Inject(at = @At("HEAD"), method = "textures()Ljava/util/List;", cancellable = true)
    private void textures_1712669112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712669112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "drawFromBuffer(Lcom/mojang/blaze3d/buffers/GpuBuffer;Lcom/mojang/blaze3d/buffers/GpuBuffer;Lcom/mojang/blaze3d/IndexType;III)V", cancellable = true)
    private void drawFromBuffer_1564018706(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1564018706L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "drawFromBuffer(Lnet/minecraft/client/renderer/StagedVertexBuffer$ExecuteInfo;)V", cancellable = true)
    private void drawFromBuffer_467192453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(467192453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scissorState()Lcom/mojang/blaze3d/systems/ScissorState;", cancellable = true)
    private void scissorState__959999039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-959999039L))
            info.setReturnValue(new com.mojang.blaze3d.systems.ScissorState());
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline_1083740508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083740508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dynamicTransforms()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void dynamicTransforms__1857608609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857608609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outputTarget()Lnet/minecraft/client/renderer/rendertype/OutputTarget;", cancellable = true)
    private void outputTarget__1654031945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654031945L))
            info.setReturnValue(null);
    }


}
