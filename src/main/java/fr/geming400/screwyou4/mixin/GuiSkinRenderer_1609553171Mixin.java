package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.pip.GuiSkinRenderer.class)
public class GuiSkinRenderer_1609553171Mixin {
        @Inject(at = @At("HEAD"), method = "getRenderStateClass()Ljava/lang/Class;", cancellable = true)
    private void getRenderStateClass_608889650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(608889650L))
            info.setReturnValue(null);
    }


}
