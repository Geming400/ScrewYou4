package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.FontTexture.class)
public class FontTexture1193044670Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lcom/mojang/blaze3d/font/GlyphInfo;Lcom/mojang/blaze3d/font/GlyphBitmap;)Lnet/minecraft/client/gui/font/glyphs/BakedSheetGlyph;", cancellable = true)
    private void add_144591842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(144591842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dumpContents(Lnet/minecraft/resources/Identifier;Ljava/nio/file/Path;)V", cancellable = true)
    private void dumpContents__687923990(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-687923990L))
            info.cancel();
    }


}
