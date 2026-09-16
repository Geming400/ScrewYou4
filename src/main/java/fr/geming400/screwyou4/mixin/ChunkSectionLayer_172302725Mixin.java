package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.ChunkSectionLayer.class)
public class ChunkSectionLayer_172302725Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;", cancellable = true)
    private static void values_194914158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194914158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;", cancellable = true)
    private static void valueOf__116379641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-116379641L))
            info.setReturnValue(net.minecraft.client.renderer.chunk.ChunkSectionLayer.TRANSLUCENT);
    }

    @Inject(at = @At("HEAD"), method = "label()Ljava/lang/String;", cancellable = true)
    private void label__64327423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-64327423L))
            info.setReturnValue("7Sb_");
    }

    @Inject(at = @At("HEAD"), method = "bufferSize()I", cancellable = true)
    private void bufferSize__596556887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-596556887L))
            info.setReturnValue(147690577);
    }

    @Inject(at = @At("HEAD"), method = "translucent()Z", cancellable = true)
    private void translucent_364373890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(364373890L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "vertexFormat()Lcom/mojang/blaze3d/vertex/VertexFormat;", cancellable = true)
    private void vertexFormat_236003858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236003858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byTransparency(Lcom/mojang/blaze3d/platform/Transparency;)Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;", cancellable = true)
    private static void byTransparency__1798131940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1798131940L))
            info.setReturnValue(net.minecraft.client.renderer.chunk.ChunkSectionLayer.SOLID);
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline__1729987078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729987078L))
            info.setReturnValue(null);
    }


}
