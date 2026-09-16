package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.SingleSpriteSource.class)
public class SingleSpriteSource1503408768Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_594782500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(594782500L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2021135003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021135003L))
            info.setReturnValue("-\uC810t6PCj/<Sd\u2071uOm/Ej@:#df>t\u8F0CabJ\u6D8CFp\u2168oTc4\u8558w\u0B02LN\u32E6)t\uFE00`#Z?{db,eSz*(ru,u}EZ{m-m`n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2060760859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2060760859L))
            info.setReturnValue(-342461078);
    }

    @Inject(at = @At("HEAD"), method = "getRandomGlyph(Lnet/minecraft/util/RandomSource;I)Lnet/minecraft/client/gui/font/glyphs/BakedGlyph;", cancellable = true)
    private void getRandomGlyph__642972451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-642972451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGlyph(I)Lnet/minecraft/client/gui/font/glyphs/BakedGlyph;", cancellable = true)
    private void getGlyph__793329722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-793329722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "glyph()Lnet/minecraft/client/gui/font/glyphs/BakedGlyph;", cancellable = true)
    private void glyph_1035994283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1035994283L))
            info.setReturnValue(null);
    }


}
