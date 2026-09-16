package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.event.NetworkSummaryEvent.SumAggregation.class)
public class SumAggregation1305569983Mixin {
        @Inject(at = @At("HEAD"), method = "trackReceivedPacket(I)V", cancellable = true)
    private void trackReceivedPacket__1213456673(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1213456673L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "commitEvent()V", cancellable = true)
    private void commitEvent__2039956561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2039956561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackSentPacket(I)V", cancellable = true)
    private void trackSentPacket_140760982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(140760982L))
            info.cancel();
    }


}
