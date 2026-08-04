package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.pip.GuiProfilerChartRenderer.class)
public class GuiProfilerChartRenderer_1844090811Mixin {
        @Inject(at = @At("HEAD"), method = "getRenderStateClass()Ljava/lang/Class;", cancellable = true)
    private void getRenderStateClass_843427290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843427290L))
            info.setReturnValue(null);
    }


}
