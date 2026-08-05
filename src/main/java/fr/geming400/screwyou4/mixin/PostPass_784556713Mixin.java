package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostPass.class)
public class PostPass_784556713Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1330018717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1330018717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addToFrame(Lcom/mojang/blaze3d/framegraph/FrameGraphBuilder;Ljava/util/Map;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V", cancellable = true)
    private void addToFrame__39673093(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-39673093L))
            info.cancel();
    }


}
