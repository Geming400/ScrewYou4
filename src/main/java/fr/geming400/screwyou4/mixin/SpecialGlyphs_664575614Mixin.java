package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.glyphs.SpecialGlyphs.class)
public class SpecialGlyphs_664575614Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/font/glyphs/SpecialGlyphs;", cancellable = true)
    private static void values__747082426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-747082426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/font/glyphs/SpecialGlyphs;", cancellable = true)
    private static void valueOf__704130227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-704130227L))
            info.setReturnValue(net.minecraft.client.gui.font.glyphs.SpecialGlyphs.MISSING);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/gui/font/GlyphStitcher;)Lnet/minecraft/client/gui/font/glyphs/BakedSheetGlyph;", cancellable = true)
    private void bake_269378173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(269378173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAdvance()F", cancellable = true)
    private void getAdvance_711480404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(711480404L))
            info.setReturnValue(7.120915E8F);
    }


}
