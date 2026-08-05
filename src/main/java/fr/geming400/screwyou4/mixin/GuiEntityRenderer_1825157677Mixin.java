package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.pip.GuiEntityRenderer.class)
public class GuiEntityRenderer_1825157677Mixin {
        @Inject(at = @At("HEAD"), method = "getRenderStateClass()Ljava/lang/Class;", cancellable = true)
    private void getRenderStateClass_582687001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582687001L))
            info.setReturnValue(null);
    }


}
