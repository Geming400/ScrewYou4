package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.PlayerGlyphProvider.class)
public class PlayerGlyphProvider_1789443634Mixin {
        @Inject(at = @At("HEAD"), method = "sourceForPlayer(Lnet/minecraft/network/chat/FontDescription$PlayerSprite;)Lnet/minecraft/client/gui/GlyphSource;", cancellable = true)
    private void sourceForPlayer__188077020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188077020L))
            info.setReturnValue(null);
    }


}
