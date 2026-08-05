package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.glyphs.BakedSheetGlyph.class)
public class BakedSheetGlyph_1245171030Mixin {
        @Inject(at = @At("HEAD"), method = "info()Lcom/mojang/blaze3d/font/GlyphInfo;", cancellable = true)
    private void info_1562016518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1562016518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createGlyph(FFIILnet/minecraft/network/chat/Style;FF)Lnet/minecraft/client/gui/font/TextRenderable$Styled;", cancellable = true)
    private void createGlyph_149193547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149193547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEffect(FFFFFIIF)Lnet/minecraft/client/gui/font/TextRenderable;", cancellable = true)
    private void createEffect__1934567401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1934567401L))
            info.setReturnValue(null);
    }


}
