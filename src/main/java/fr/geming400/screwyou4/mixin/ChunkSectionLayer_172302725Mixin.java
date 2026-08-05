package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.ChunkSectionLayer.class)
public class ChunkSectionLayer_172302725Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;", cancellable = true)
    private static void values__1020610228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1020610228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;", cancellable = true)
    private static void valueOf_1274319407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274319407L))
            info.setReturnValue(net.minecraft.client.renderer.chunk.ChunkSectionLayer.TRANSLUCENT);
    }

    @Inject(at = @At("HEAD"), method = "label()Ljava/lang/String;", cancellable = true)
    private void label__963157747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963157747L))
            info.setReturnValue("!@K7'Z[\uAB67 \u9F3F\"u(O\uFA96QX\uACE3/n?LBMr\\"");
    }

    @Inject(at = @At("HEAD"), method = "bufferSize()I", cancellable = true)
    private void bufferSize_210564970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(210564970L))
            info.setReturnValue(-143051141);
    }

    @Inject(at = @At("HEAD"), method = "vertexFormat()Lcom/mojang/blaze3d/vertex/VertexFormat;", cancellable = true)
    private void vertexFormat__657505321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-657505321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translucent()Z", cancellable = true)
    private void translucent_210581307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(210581307L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline_1169710936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169710936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byTransparency(Lcom/mojang/blaze3d/platform/Transparency;)Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;", cancellable = true)
    private static void byTransparency_1128571659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1128571659L))
            info.setReturnValue(net.minecraft.client.renderer.chunk.ChunkSectionLayer.CUTOUT);
    }


}
