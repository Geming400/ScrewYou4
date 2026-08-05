package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.BitmapProvider.class)
public class BitmapProvider_2032683360Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__81892070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-81892070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSupportedGlyphs()Lit/unimi/dsi/fastutil/ints/IntSet;", cancellable = true)
    private void getSupportedGlyphs__800508869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-800508869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGlyph(I)Lcom/mojang/blaze3d/font/UnbakedGlyph;", cancellable = true)
    private void getGlyph_1245952783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245952783L))
            info.setReturnValue(null);
    }


}
