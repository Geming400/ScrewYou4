package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.FontTexture.class)
public class FontTexture1193044670Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lcom/mojang/blaze3d/font/GlyphInfo;Lcom/mojang/blaze3d/font/GlyphBitmap;)Lnet/minecraft/client/gui/font/glyphs/BakedSheetGlyph;", cancellable = true)
    private void add__385906815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-385906815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dumpContents(Lnet/minecraft/resources/Identifier;Ljava/nio/file/Path;)V", cancellable = true)
    private void dumpContents_2020258648(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2020258648L))
            info.cancel();
    }


}
