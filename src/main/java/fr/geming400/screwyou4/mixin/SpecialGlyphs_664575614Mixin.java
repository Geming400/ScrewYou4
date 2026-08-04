package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.glyphs.SpecialGlyphs.class)
public class SpecialGlyphs_664575614Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/font/glyphs/SpecialGlyphs;", cancellable = true)
    private static void values_336746536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336746536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/font/glyphs/SpecialGlyphs;", cancellable = true)
    private static void valueOf__2080185819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2080185819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/gui/font/GlyphStitcher;)Lnet/minecraft/client/gui/font/glyphs/BakedSheetGlyph;", cancellable = true)
    private void bake_971674230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971674230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAdvance()F", cancellable = true)
    private void getAdvance_702834976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702834976L))
            info.setReturnValue(null);
    }


}
