package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.RenderPipelines.class)
public class RenderPipelines969952685Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/blaze3d/pipeline/RenderPipeline;)Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private static void register_1842784388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1842784388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStaticPipelines()Ljava/util/List;", cancellable = true)
    private static void getStaticPipelines__1698677547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1698677547L))
            info.setReturnValue(null);
    }


}
