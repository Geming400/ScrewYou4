package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.PreparedRenderType.class)
public class PreparedRenderType_86332297Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__822293972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-822293972L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_856755821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(856755821L))
            info.setReturnValue("A.)pTLZO=ftK6\u02C4DCvd>{burw/r\u145DD\u3871J1+S@A\uD346p2Ew u@zBhGh%&0fxvr\u2590s\u7921$EZ2v\uB996rh)9\u9E01VBy*4ejTCW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_643684387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643684387L))
            info.setReturnValue(-1130242935);
    }

    @Inject(at = @At("HEAD"), method = "dynamicTransforms()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void dynamicTransforms_1895133049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1895133049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textures()Ljava/util/List;", cancellable = true)
    private void textures__674266000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-674266000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "drawFromBuffer(Lnet/minecraft/client/renderer/StagedVertexBuffer$ExecuteInfo;)V", cancellable = true)
    private void drawFromBuffer_827455191(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(827455191L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "drawFromBuffer(Lcom/mojang/blaze3d/buffers/GpuBuffer;Lcom/mojang/blaze3d/buffers/GpuBuffer;Lcom/mojang/blaze3d/IndexType;III)V", cancellable = true)
    private void drawFromBuffer__2124794496(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2124794496L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scissorState()Lcom/mojang/blaze3d/systems/ScissorState;", cancellable = true)
    private void scissorState__1508073524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1508073524L))
            info.setReturnValue(new com.mojang.blaze3d.systems.ScissorState());
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline__1815957506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815957506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outputTarget()Lnet/minecraft/client/renderer/rendertype/OutputTarget;", cancellable = true)
    private void outputTarget_1018243205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018243205L))
            info.setReturnValue(null);
    }


}
