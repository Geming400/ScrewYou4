package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostChain.class)
public class PostChain82010515Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/client/renderer/PostChainConfig;Lnet/minecraft/client/renderer/texture/TextureManager;Ljava/util/Set;Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/renderer/Projection;Lnet/minecraft/client/renderer/ProjectionMatrixBuffer;)Lnet/minecraft/client/renderer/PostChain;", cancellable = true)
    private static void load__628333621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-628333621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__2032564914(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2032564914L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "process(Lcom/mojang/blaze3d/pipeline/RenderTarget;Lcom/mojang/blaze3d/resource/GraphicsResourceAllocator;)V", cancellable = true)
    private void process_1471220522(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1471220522L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addToFrame(Lcom/mojang/blaze3d/framegraph/FrameGraphBuilder;IILnet/minecraft/client/renderer/PostChain$TargetBundle;)V", cancellable = true)
    private void addToFrame__1656389164(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1656389164L))
            info.cancel();
    }


}
