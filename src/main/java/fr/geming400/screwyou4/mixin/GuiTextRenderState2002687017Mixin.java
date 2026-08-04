package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.GuiTextRenderState.class)
public class GuiTextRenderState2002687017Mixin {
        @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__1117254975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117254975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ensurePrepared()Lnet/minecraft/client/gui/Font$PreparedText;", cancellable = true)
    private void ensurePrepared__1708277060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1708277060L))
            info.setReturnValue(null);
    }


}
