package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.OptionInstanceSliderButton.class)
public class OptionInstanceSliderButton1132906337Mixin {
        @Inject(at = @At("HEAD"), method = "applyUnsavedValue()V", cancellable = true)
    private void applyUnsavedValue_1171181076(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1171181076L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState_173218965(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(173218965L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onRelease(Lnet/minecraft/client/input/MouseButtonEvent;)V", cancellable = true)
    private void onRelease_1356524787(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1356524787L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetValue()V", cancellable = true)
    private void resetValue_1171181076(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1171181076L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_216270623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216270623L))
            info.setReturnValue(null);
    }


}
