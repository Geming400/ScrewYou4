package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.debug.GameModeSwitcherScreen.GameModeSlot.class)
public class GameModeSlot_1159452241Mixin {
        @Inject(at = @At("HEAD"), method = "updateWidgetNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateWidgetNarration__464412317(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-464412317L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isHoveredOrFocused()Z", cancellable = true)
    private void isHoveredOrFocused_2127773988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127773988L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState__2047830642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2047830642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Z)V", cancellable = true)
    private void setSelected_530764906(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(530764906L))
            info.cancel();
    }


}
