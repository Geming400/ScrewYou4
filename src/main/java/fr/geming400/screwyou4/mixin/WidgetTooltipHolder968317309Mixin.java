package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.WidgetTooltipHolder.class)
public class WidgetTooltipHolder968317309Mixin {
        @Inject(at = @At("HEAD"), method = "get()Lnet/minecraft/client/gui/components/Tooltip;", cancellable = true)
    private void get_1109071411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1109071411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/client/gui/components/Tooltip;)V", cancellable = true)
    private void set_924287481(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(924287481L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDelay(Ljava/time/Duration;)V", cancellable = true)
    private void setDelay_202980662(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(202980662L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "refreshTooltipForNextRenderPass(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZZLnet/minecraft/client/gui/navigation/ScreenRectangle;)V", cancellable = true)
    private void refreshTooltipForNextRenderPass__1473329306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1473329306L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateNarration__2064990501(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2064990501L))
            info.cancel();
    }


}
