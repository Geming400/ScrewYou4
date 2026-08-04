package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.glyphs.BakedSheetGlyph.class)
public class BakedSheetGlyph_1245171030Mixin {
        @Inject(at = @At("HEAD"), method = "info()Lcom/mojang/blaze3d/font/GlyphInfo;", cancellable = true)
    private void info_1509599092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1509599092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createGlyph(FFIILnet/minecraft/network/chat/Style;FF)Lnet/minecraft/client/gui/font/TextRenderable$Styled;", cancellable = true)
    private void createGlyph__1664409893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1664409893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEffect(FFFFFIIF)Lnet/minecraft/client/gui/font/TextRenderable;", cancellable = true)
    private void createEffect__1352982358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1352982358L))
            info.setReturnValue(null);
    }


}
