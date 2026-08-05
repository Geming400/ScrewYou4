package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.FontSet.class)
public class FontSet_973789371Mixin {
        @Inject(at = @At("HEAD"), method = "source(Z)Lnet/minecraft/client/gui/GlyphSource;", cancellable = true)
    private void source_1749490747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749490747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1012064109(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1012064109L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload(Ljava/util/List;Ljava/util/Set;)V", cancellable = true)
    private void reload__1105464687(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1105464687L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload(Ljava/util/Set;)V", cancellable = true)
    private void reload_429708642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(429708642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "whiteGlyph()Lnet/minecraft/client/gui/font/glyphs/EffectGlyph;", cancellable = true)
    private void whiteGlyph_943513305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943513305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomGlyph(Lnet/minecraft/util/RandomSource;I)Lnet/minecraft/client/gui/font/glyphs/BakedGlyph;", cancellable = true)
    private void getRandomGlyph__2135832214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2135832214L))
            info.setReturnValue(null);
    }


}
