package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.UnihexProvider.class)
public class UnihexProvider1858708124Mixin {
        @Inject(at = @At("HEAD"), method = "getGlyph(I)Lcom/mojang/blaze3d/font/UnbakedGlyph;", cancellable = true)
    private void getGlyph__637081214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-637081214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSupportedGlyphs()Lit/unimi/dsi/fastutil/ints/IntSet;", cancellable = true)
    private void getSupportedGlyphs_1254151991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254151991L))
            info.setReturnValue(null);
    }


}
