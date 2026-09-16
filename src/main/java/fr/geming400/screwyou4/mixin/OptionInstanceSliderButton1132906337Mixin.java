package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.OptionInstanceSliderButton.class)
public class OptionInstanceSliderButton1132906337Mixin {
        @Inject(at = @At("HEAD"), method = "applyUnsavedValue()V", cancellable = true)
    private void applyUnsavedValue_2058591139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2058591139L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState__2074376545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2074376545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1101852706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1101852706L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onRelease(Lnet/minecraft/client/input/MouseButtonEvent;)V", cancellable = true)
    private void onRelease_524450843(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(524450843L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetValue()V", cancellable = true)
    private void resetValue__154968590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-154968590L))
            info.cancel();
    }


}
