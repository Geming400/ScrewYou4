package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.pip.GuiBannerResultRenderer.class)
public class GuiBannerResultRenderer831709401Mixin {
        @Inject(at = @At("HEAD"), method = "getRenderStateClass()Ljava/lang/Class;", cancellable = true)
    private void getRenderStateClass__410761274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-410761274L))
            info.setReturnValue(null);
    }


}
