package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.SingleSpriteSource.class)
public class SingleSpriteSource1503408768Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1406046269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406046269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_367948793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(367948793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1541671510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1541671510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomGlyph(Lnet/minecraft/util/RandomSource;I)Lnet/minecraft/client/gui/font/glyphs/BakedGlyph;", cancellable = true)
    private void getRandomGlyph__1606212816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1606212816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGlyph(I)Lnet/minecraft/client/gui/font/glyphs/BakedGlyph;", cancellable = true)
    private void getGlyph__1241076528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1241076528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "glyph()Lnet/minecraft/client/gui/font/glyphs/BakedGlyph;", cancellable = true)
    private void glyph_1831469655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831469655L))
            info.setReturnValue(null);
    }


}
