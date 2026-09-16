package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.pip.OversizedItemRenderer.class)
public class OversizedItemRenderer_122045129Mixin {
        @Inject(at = @At("HEAD"), method = "invalidateTexture()V", cancellable = true)
    private void invalidateTexture__1685261797(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1685261797L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetUsedOnThisFrame()V", cancellable = true)
    private void resetUsedOnThisFrame_1918683895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1918683895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "usedOnThisFrame()Z", cancellable = true)
    private void usedOnThisFrame_1984012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984012L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRenderStateClass()Ljava/lang/Class;", cancellable = true)
    private void getRenderStateClass__1120425547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120425547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blitTexture(Lnet/minecraft/client/renderer/state/gui/pip/PictureInPictureRenderState;Lnet/minecraft/client/renderer/state/gui/GuiRenderState;)V", cancellable = true)
    private void blitTexture__1256382145(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1256382145L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blitTexture(Lnet/minecraft/client/renderer/state/gui/pip/OversizedItemRenderState;Lnet/minecraft/client/renderer/state/gui/GuiRenderState;)V", cancellable = true)
    private void blitTexture_170053510(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(170053510L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textureIsReadyToBlit(Lnet/minecraft/client/renderer/state/gui/pip/OversizedItemRenderState;)Z", cancellable = true)
    private void textureIsReadyToBlit__1913214463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1913214463L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "textureIsReadyToBlit(Lnet/minecraft/client/renderer/state/gui/pip/PictureInPictureRenderState;)Z", cancellable = true)
    private void textureIsReadyToBlit_2105255498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2105255498L))
            info.setReturnValue(false);
    }


}
