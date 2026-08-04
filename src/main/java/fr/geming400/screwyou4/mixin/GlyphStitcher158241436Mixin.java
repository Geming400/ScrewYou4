package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.GlyphStitcher.class)
public class GlyphStitcher158241436Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_196516175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(196516175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_196516175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(196516175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stitch(Lcom/mojang/blaze3d/font/GlyphInfo;Lcom/mojang/blaze3d/font/GlyphBitmap;)Lnet/minecraft/client/gui/font/glyphs/BakedSheetGlyph;", cancellable = true)
    private void stitch__1420710049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1420710049L))
            info.setReturnValue(null);
    }


}
