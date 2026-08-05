package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.glyphs.EmptyGlyph.class)
public class EmptyGlyph_1149705655Mixin {
        @Inject(at = @At("HEAD"), method = "info()Lcom/mojang/blaze3d/font/GlyphInfo;", cancellable = true)
    private void info_1466551143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466551143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lcom/mojang/blaze3d/font/UnbakedGlyph$Stitcher;)Lnet/minecraft/client/gui/font/glyphs/BakedGlyph;", cancellable = true)
    private void bake_551941450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551941450L))
            info.setReturnValue(null);
    }


}
