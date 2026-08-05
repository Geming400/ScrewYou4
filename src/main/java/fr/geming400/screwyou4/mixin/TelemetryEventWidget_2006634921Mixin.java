package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.telemetry.TelemetryEventWidget.class)
public class TelemetryEventWidget_2006634921Mixin {
        @Inject(at = @At("HEAD"), method = "setScrollAmount(D)V", cancellable = true)
    private void setScrollAmount__1079033009(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1079033009L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onOptInChanged(Z)V", cancellable = true)
    private void onOptInChanged__1058715547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1058715547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOnScrolledListener(Ljava/util/function/DoubleConsumer;)V", cancellable = true)
    private void setOnScrolledListener_423792628(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(423792628L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateLayout()V", cancellable = true)
    private void updateLayout_2044909659(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2044909659L))
            info.cancel();
    }


}
