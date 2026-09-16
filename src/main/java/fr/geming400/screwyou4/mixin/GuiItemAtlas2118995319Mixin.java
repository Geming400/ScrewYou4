package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.GuiItemAtlas.class)
public class GuiItemAtlas2118995319Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_4419890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(4419890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOrUpdate(Lnet/minecraft/client/renderer/item/TrackingItemStackRenderState;)Lnet/minecraft/client/gui/render/GuiItemAtlas$SlotView;", cancellable = true)
    private void getOrUpdate_692030082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692030082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryPrepareFor(Ljava/util/Set;)Z", cancellable = true)
    private void tryPrepareFor__742551808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742551808L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "computeTextureSizeFor(II)I", cancellable = true)
    private static void computeTextureSizeFor_1296353137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1296353137L))
            info.setReturnValue(-1228179115);
    }

    @Inject(at = @At("HEAD"), method = "textureSize()I", cancellable = true)
    private void textureSize__533531359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533531359L))
            info.setReturnValue(-595870940);
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_1932711448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1932711448L))
            info.cancel();
    }


}
