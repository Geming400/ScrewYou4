package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.Lightmap.class)
public class Lightmap1798484940Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1836759679(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1836759679L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(Lnet/minecraft/client/renderer/state/LightmapRenderState;)V", cancellable = true)
    private void render__634288549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-634288549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrightness(Lnet/minecraft/world/level/dimension/DimensionType;I)F", cancellable = true)
    private static void getBrightness__1933723932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933723932L))
            info.setReturnValue(2.156025E8F);
    }

    @Inject(at = @At("HEAD"), method = "getTextureView()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void getTextureView__602129670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-602129670L))
            info.setReturnValue(null);
    }


}
