package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UiLightmap.class)
public class UiLightmap_1172678912Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1210953650(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1210953650L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureView()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void getTextureView__1227935699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1227935699L))
            info.setReturnValue(null);
    }


}
