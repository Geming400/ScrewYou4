package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.WidgetTooltipHolder.class)
public class WidgetTooltipHolder968317309Mixin {
        @Inject(at = @At("HEAD"), method = "get()Lnet/minecraft/client/gui/components/Tooltip;", cancellable = true)
    private void get__620546659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620546659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/client/gui/components/Tooltip;)V", cancellable = true)
    private void set_1509138907(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1509138907L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateNarration_1483208628(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1483208628L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDelay(Ljava/time/Duration;)V", cancellable = true)
    private void setDelay_1921523221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1921523221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "refreshTooltipForNextRenderPass(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZZLnet/minecraft/client/gui/navigation/ScreenRectangle;)V", cancellable = true)
    private void refreshTooltipForNextRenderPass_1207936971(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1207936971L))
            info.cancel();
    }


}
