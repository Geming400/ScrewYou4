package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.BitmapProvider.class)
public class BitmapProvider_2032683360Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_2070958098(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2070958098L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGlyph(I)Lcom/mojang/blaze3d/font/UnbakedGlyph;", cancellable = true)
    private void getGlyph__463105979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-463105979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSupportedGlyphs()Lit/unimi/dsi/fastutil/ints/IntSet;", cancellable = true)
    private void getSupportedGlyphs_1428127226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1428127226L))
            info.setReturnValue(null);
    }


}
