package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.event.NetworkSummaryEvent.SumAggregation.class)
public class SumAggregation1305569983Mixin {
        @Inject(at = @At("HEAD"), method = "trackSentPacket(I)V", cancellable = true)
    private void trackSentPacket__1775480341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1775480341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackReceivedPacket(I)V", cancellable = true)
    private void trackReceivedPacket__1775480341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1775480341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "commitEvent()V", cancellable = true)
    private void commitEvent_1343844722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1343844722L))
            info.cancel();
    }


}
