package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.pip.OversizedItemRenderer.class)
public class OversizedItemRenderer_122045129Mixin {
        @Inject(at = @At("HEAD"), method = "resetUsedOnThisFrame()V", cancellable = true)
    private void resetUsedOnThisFrame_160319867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(160319867L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "invalidateTexture()V", cancellable = true)
    private void invalidateTexture_160319867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(160319867L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "usedOnThisFrame()Z", cancellable = true)
    private void usedOnThisFrame_160323711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160323711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderStateClass()Ljava/lang/Class;", cancellable = true)
    private void getRenderStateClass__878618392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878618392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blitTexture(Lnet/minecraft/client/renderer/state/gui/pip/OversizedItemRenderState;Lnet/minecraft/client/renderer/state/gui/GuiRenderState;)V", cancellable = true)
    private void blitTexture_1889173932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1889173932L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blitTexture(Lnet/minecraft/client/renderer/state/gui/pip/PictureInPictureRenderState;Lnet/minecraft/client/renderer/state/gui/GuiRenderState;)V", cancellable = true)
    private void blitTexture__129927847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-129927847L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textureIsReadyToBlit(Lnet/minecraft/client/renderer/state/gui/pip/PictureInPictureRenderState;)Z", cancellable = true)
    private void textureIsReadyToBlit__1387640804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1387640804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureIsReadyToBlit(Lnet/minecraft/client/renderer/state/gui/pip/OversizedItemRenderState;)Z", cancellable = true)
    private void textureIsReadyToBlit__1081759377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1081759377L))
            info.setReturnValue(null);
    }


}
