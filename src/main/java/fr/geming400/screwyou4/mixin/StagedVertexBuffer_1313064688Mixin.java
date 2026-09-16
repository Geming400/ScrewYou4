package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.StagedVertexBuffer.class)
public class StagedVertexBuffer_1313064688Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__801510742(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-801510742L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVertexBuilder(Lnet/minecraft/client/renderer/StagedVertexBuffer$Draw;)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void getVertexBuilder__913143859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-913143859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExecuteInfo(Lnet/minecraft/client/renderer/StagedVertexBuffer$Draw;)Lnet/minecraft/client/renderer/StagedVertexBuffer$ExecuteInfo;", cancellable = true)
    private void getExecuteInfo__1766169098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1766169098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_1126780816(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1126780816L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "upload()V", cancellable = true)
    private void upload__1969924031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1969924031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endDraw()V", cancellable = true)
    private void endDraw_995600451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(995600451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "appendDraw(Lcom/mojang/blaze3d/vertex/VertexFormat;Lcom/mojang/blaze3d/PrimitiveTopology;Lcom/mojang/blaze3d/vertex/VertexSorting;)Lnet/minecraft/client/renderer/StagedVertexBuffer$Draw;", cancellable = true)
    private void appendDraw_1281667022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1281667022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "appendDraw(Lcom/mojang/blaze3d/vertex/VertexFormat;Lcom/mojang/blaze3d/PrimitiveTopology;)Lnet/minecraft/client/renderer/StagedVertexBuffer$Draw;", cancellable = true)
    private void appendDraw_25564107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(25564107L))
            info.setReturnValue(null);
    }


}
