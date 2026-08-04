package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.debug.GameModeSwitcherScreen.GameModeSlot.class)
public class GameModeSlot_1159452241Mixin {
        @Inject(at = @At("HEAD"), method = "setSelected(Z)V", cancellable = true)
    private void setSelected__1905898227(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1905898227L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWidgetNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateWidgetNarration__1873855570(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1873855570L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState_199764868(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(199764868L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isHoveredOrFocused()Z", cancellable = true)
    private void isHoveredOrFocused_1197730823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197730823L))
            info.setReturnValue(null);
    }


}
