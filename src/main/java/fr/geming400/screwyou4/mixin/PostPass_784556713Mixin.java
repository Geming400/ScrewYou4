package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostPass.class)
public class PostPass_784556713Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_822831451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(822831451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addToFrame(Lcom/mojang/blaze3d/framegraph/FrameGraphBuilder;Ljava/util/Map;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V", cancellable = true)
    private void addToFrame__64808662(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-64808662L))
            info.cancel();
    }


}
