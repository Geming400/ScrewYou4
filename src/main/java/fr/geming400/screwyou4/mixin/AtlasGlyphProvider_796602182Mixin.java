package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.AtlasGlyphProvider.class)
public class AtlasGlyphProvider_796602182Mixin {
        @Inject(at = @At("HEAD"), method = "sourceForSprite(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/gui/GlyphSource;", cancellable = true)
    private void sourceForSprite__1131475237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1131475237L))
            info.setReturnValue(null);
    }


}
