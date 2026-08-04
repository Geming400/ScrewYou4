package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.FontSet.Source.class)
public class Source_625203276Mixin {
        @Inject(at = @At("HEAD"), method = "getRandomGlyph(Lnet/minecraft/util/RandomSource;I)Lnet/minecraft/client/gui/font/glyphs/BakedGlyph;", cancellable = true)
    private void getRandomGlyph_1810548987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1810548987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGlyph(I)Lnet/minecraft/client/gui/font/glyphs/BakedGlyph;", cancellable = true)
    private void getGlyph__2119282021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2119282021L))
            info.setReturnValue(null);
    }


}
