package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.GlyphProviderType.class)
public class GlyphProviderType129608473Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/font/providers/GlyphProviderType;", cancellable = true)
    private static void values_1133425806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1133425806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/font/providers/GlyphProviderType;", cancellable = true)
    private static void valueOf_808150001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(808150001L))
            info.setReturnValue(net.minecraft.client.gui.font.providers.GlyphProviderType.UNIHEX);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec_1865462197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1865462197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__1005851998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1005851998L))
            info.setReturnValue("Ynk");
    }


}
