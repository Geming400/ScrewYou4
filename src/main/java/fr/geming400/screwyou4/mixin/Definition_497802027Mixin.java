package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.UnihexProvider.Definition.class)
public class Definition_497802027Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/gui/font/providers/GlyphProviderType;", cancellable = true)
    private void type_1455778054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455778054L))
            info.setReturnValue(net.minecraft.client.gui.font.providers.GlyphProviderType.BITMAP);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unpack__1590027825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1590027825L))
            info.setReturnValue(null);
    }


}
