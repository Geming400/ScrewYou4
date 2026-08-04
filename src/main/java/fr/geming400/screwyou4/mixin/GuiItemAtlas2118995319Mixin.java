package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.GuiItemAtlas.class)
public class GuiItemAtlas2118995319Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__2137697238(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2137697238L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryPrepareFor(Ljava/util/Set;)Z", cancellable = true)
    private void tryPrepareFor_1574918435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574918435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "computeTextureSizeFor(II)I", cancellable = true)
    private static void computeTextureSizeFor_1123103605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123103605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrUpdate(Lnet/minecraft/client/renderer/item/TrackingItemStackRenderState;)Lnet/minecraft/client/gui/render/GuiItemAtlas$SlotView;", cancellable = true)
    private void getOrUpdate_325590912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(325590912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureSize()I", cancellable = true)
    private void textureSize__2137709731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137709731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame__2137697238(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2137697238L))
            info.cancel();
    }


}
