package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.OverlayTexture.class)
public class OverlayTexture_1556757481Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__557817949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-557817949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "v(Z)I", cancellable = true)
    private static void v_137614022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(137614022L))
            info.setReturnValue(125449723);
    }

    @Inject(at = @At("HEAD"), method = "u(F)I", cancellable = true)
    private static void u__768360079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-768360079L))
            info.setReturnValue(-480270862);
    }

    @Inject(at = @At("HEAD"), method = "pack(II)I", cancellable = true)
    private static void pack__1763384915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1763384915L))
            info.setReturnValue(2018565981);
    }

    @Inject(at = @At("HEAD"), method = "pack(FZ)I", cancellable = true)
    private static void pack__1833572511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833572511L))
            info.setReturnValue(-1920651294);
    }

    @Inject(at = @At("HEAD"), method = "getTextureView()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void getTextureView_1942998080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1942998080L))
            info.setReturnValue(null);
    }


}
