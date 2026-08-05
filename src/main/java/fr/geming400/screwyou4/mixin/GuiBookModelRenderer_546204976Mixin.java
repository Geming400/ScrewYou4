package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.pip.GuiBookModelRenderer.class)
public class GuiBookModelRenderer_546204976Mixin {
        @Inject(at = @At("HEAD"), method = "getRenderStateClass()Ljava/lang/Class;", cancellable = true)
    private void getRenderStateClass__696265700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-696265700L))
            info.setReturnValue(null);
    }


}
