package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.telemetry.TelemetryEventWidget.class)
public class TelemetryEventWidget_2006634921Mixin {
        @Inject(at = @At("HEAD"), method = "setScrollAmount(D)V", cancellable = true)
    private void setScrollAmount__552712938(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-552712938L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateLayout()V", cancellable = true)
    private void updateLayout__1469477144(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1469477144L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOnScrolledListener(Ljava/util/function/DoubleConsumer;)V", cancellable = true)
    private void setOnScrolledListener_1507722229(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1507722229L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onOptInChanged(Z)V", cancellable = true)
    private void onOptInChanged__1584506880(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1584506880L))
            info.cancel();
    }


}
