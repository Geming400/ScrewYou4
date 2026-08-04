package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.pip.GuiEntityRenderer.class)
public class GuiEntityRenderer_1825157677Mixin {
        @Inject(at = @At("HEAD"), method = "getRenderStateClass()Ljava/lang/Class;", cancellable = true)
    private void getRenderStateClass_824494156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824494156L))
            info.setReturnValue(null);
    }


}
