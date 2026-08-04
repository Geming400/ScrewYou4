package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.StagedVertexBuffer.class)
public class StagedVertexBuffer_1313064688Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1351339426(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1351339426L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endDraw()V", cancellable = true)
    private void endDraw_1351339426(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1351339426L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "appendDraw(Lcom/mojang/blaze3d/vertex/VertexFormat;Lcom/mojang/blaze3d/PrimitiveTopology;)Lnet/minecraft/client/renderer/StagedVertexBuffer$Draw;", cancellable = true)
    private void appendDraw__1576175223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576175223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "appendDraw(Lcom/mojang/blaze3d/vertex/VertexFormat;Lcom/mojang/blaze3d/PrimitiveTopology;Lcom/mojang/blaze3d/vertex/VertexSorting;)Lnet/minecraft/client/renderer/StagedVertexBuffer$Draw;", cancellable = true)
    private void appendDraw_449861584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(449861584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upload()V", cancellable = true)
    private void upload_1351339426(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1351339426L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_1351339426(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1351339426L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVertexBuilder(Lnet/minecraft/client/renderer/StagedVertexBuffer$Draw;)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void getVertexBuilder__84012850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-84012850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExecuteInfo(Lnet/minecraft/client/renderer/StagedVertexBuffer$Draw;)Lnet/minecraft/client/renderer/StagedVertexBuffer$ExecuteInfo;", cancellable = true)
    private void getExecuteInfo__1171810845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1171810845L))
            info.setReturnValue(null);
    }


}
