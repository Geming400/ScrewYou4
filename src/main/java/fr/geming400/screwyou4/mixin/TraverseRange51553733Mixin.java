package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.GuiRenderState.TraverseRange.class)
public class TraverseRange51553733Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/state/gui/GuiRenderState$TraverseRange;", cancellable = true)
    private static void values__1448662225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1448662225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/state/gui/GuiRenderState$TraverseRange;", cancellable = true)
    private static void valueOf_1833570284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1833570284L))
            info.setReturnValue(net.minecraft.client.renderer.state.gui.GuiRenderState.TraverseRange.BEFORE_BLUR);
    }


}
