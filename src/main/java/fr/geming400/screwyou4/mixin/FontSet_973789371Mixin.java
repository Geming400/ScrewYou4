package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.FontSet.class)
public class FontSet_973789371Mixin {
        @Inject(at = @At("HEAD"), method = "source(Z)Lnet/minecraft/client/gui/GlyphSource;", cancellable = true)
    private void source_1031065920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031065920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1140786059(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1140786059L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload(Ljava/util/List;Ljava/util/Set;)V", cancellable = true)
    private void reload__95986774(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-95986774L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload(Ljava/util/Set;)V", cancellable = true)
    private void reload_1946652795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1946652795L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "whiteGlyph()Lnet/minecraft/client/gui/font/glyphs/EffectGlyph;", cancellable = true)
    private void whiteGlyph__1082403556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1082403556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomGlyph(Lnet/minecraft/util/RandomSource;I)Lnet/minecraft/client/gui/font/glyphs/BakedGlyph;", cancellable = true)
    private void getRandomGlyph__1172591849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172591849L))
            info.setReturnValue(null);
    }


}
