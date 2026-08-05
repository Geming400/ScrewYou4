package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.OverlayTexture.class)
public class OverlayTexture_1556757481Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1595032219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1595032219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "v(Z)I", cancellable = true)
    private static void v__1508605232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1508605232L))
            info.setReturnValue(-159420368);
    }

    @Inject(at = @At("HEAD"), method = "u(F)I", cancellable = true)
    private static void u__1527075652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1527075652L))
            info.setReturnValue(1794783505);
    }

    @Inject(at = @At("HEAD"), method = "pack(II)I", cancellable = true)
    private static void pack_560865766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(560865766L))
            info.setReturnValue(1301268425);
    }

    @Inject(at = @At("HEAD"), method = "pack(FZ)I", cancellable = true)
    private static void pack_490678170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(490678170L))
            info.setReturnValue(801350353);
    }

    @Inject(at = @At("HEAD"), method = "getTextureView()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void getTextureView__843857130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-843857130L))
            info.setReturnValue(null);
    }


}
