package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.Lightmap.class)
public class Lightmap1798484940Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__316090489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-316090489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(Lnet/minecraft/client/renderer/state/LightmapRenderState;)V", cancellable = true)
    private void render__2014804623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2014804623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrightness(Lnet/minecraft/world/level/dimension/DimensionType;I)F", cancellable = true)
    private static void getBrightness__1602962307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1602962307L))
            info.setReturnValue(877500.6F);
    }

    @Inject(at = @At("HEAD"), method = "getTextureView()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void getTextureView__2110241756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110241756L))
            info.setReturnValue(null);
    }


}
