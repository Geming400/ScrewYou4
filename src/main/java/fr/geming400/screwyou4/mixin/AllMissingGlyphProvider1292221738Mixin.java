package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.AllMissingGlyphProvider.class)
public class AllMissingGlyphProvider1292221738Mixin {
        @Inject(at = @At("HEAD"), method = "getSupportedGlyphs()Lit/unimi/dsi/fastutil/ints/IntSet;", cancellable = true)
    private void getSupportedGlyphs__1540970490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1540970490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGlyph(I)Lcom/mojang/blaze3d/font/UnbakedGlyph;", cancellable = true)
    private void getGlyph_505491162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(505491162L))
            info.setReturnValue(null);
    }


}
