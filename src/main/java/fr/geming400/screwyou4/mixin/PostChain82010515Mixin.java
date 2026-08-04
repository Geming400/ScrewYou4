package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostChain.class)
public class PostChain82010515Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/client/renderer/PostChainConfig;Lnet/minecraft/client/renderer/texture/TextureManager;Ljava/util/Set;Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/renderer/Projection;Lnet/minecraft/client/renderer/ProjectionMatrixBuffer;)Lnet/minecraft/client/renderer/PostChain;", cancellable = true)
    private static void load__1972686607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1972686607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_120285254(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(120285254L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "process(Lcom/mojang/blaze3d/pipeline/RenderTarget;Lcom/mojang/blaze3d/resource/GraphicsResourceAllocator;)V", cancellable = true)
    private void process__1452265477(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1452265477L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addToFrame(Lcom/mojang/blaze3d/framegraph/FrameGraphBuilder;IILnet/minecraft/client/renderer/PostChain$TargetBundle;)V", cancellable = true)
    private void addToFrame__1870940221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1870940221L))
            info.cancel();
    }


}
