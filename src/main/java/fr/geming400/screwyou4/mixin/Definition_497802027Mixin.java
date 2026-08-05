package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.UnihexProvider.Definition.class)
public class Definition_497802027Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/gui/font/providers/GlyphProviderType;", cancellable = true)
    private void type__1298729088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298729088L))
            info.setReturnValue(net.minecraft.client.gui.font.providers.GlyphProviderType.UNIHEX);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unpack_1321077313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1321077313L))
            info.setReturnValue(null);
    }


}
