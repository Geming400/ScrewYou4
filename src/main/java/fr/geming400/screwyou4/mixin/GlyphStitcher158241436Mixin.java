package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.GlyphStitcher.class)
public class GlyphStitcher158241436Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__1571195552(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1571195552L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1956333993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1956333993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stitch(Lcom/mojang/blaze3d/font/GlyphInfo;Lcom/mojang/blaze3d/font/GlyphBitmap;)Lnet/minecraft/client/gui/font/glyphs/BakedSheetGlyph;", cancellable = true)
    private void stitch_106014672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(106014672L))
            info.setReturnValue(null);
    }


}
