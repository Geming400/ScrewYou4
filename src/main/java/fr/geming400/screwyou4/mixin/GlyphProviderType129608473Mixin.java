package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.GlyphProviderType.class)
public class GlyphProviderType129608473Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/font/providers/GlyphProviderType;", cancellable = true)
    private static void values_712655280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712655280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/font/providers/GlyphProviderType;", cancellable = true)
    private static void valueOf__2011933239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2011933239L))
            info.setReturnValue(net.minecraft.client.gui.font.providers.GlyphProviderType.SPACE);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec__614386597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614386597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_217817095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(217817095L))
            info.setReturnValue("xyJO'\u6D05MFx$!ER|yFlJb3B?n<o4\uCC4C8TPbM\uB500\uFD9AN\uBC47CyE,-Er>:72AU\u3BD2V.n7c\u760E{j^R");
    }


}
