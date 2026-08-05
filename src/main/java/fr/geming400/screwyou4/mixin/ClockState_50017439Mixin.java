package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.clock.ClockState.class)
public class ClockState_50017439Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__858608830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-858608830L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_820440963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(820440963L))
            info.setReturnValue("lDef`Uw3txY5Dj2\u9562E& \uFA01Y\u6EA8TrU9\u60B7dCD1e+\uD052qj7w1(j5\uB163\uFAD8m*z\u6555Kg\u3ADA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_607369529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(607369529L))
            info.setReturnValue(1463248557);
    }

    @Inject(at = @At("HEAD"), method = "rate()F", cancellable = true)
    private void rate_213565025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(213565025L))
            info.setReturnValue(5.041143E8F);
    }

    @Inject(at = @At("HEAD"), method = "partialTick()F", cancellable = true)
    private void partialTick_2018090819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018090819L))
            info.setReturnValue(5.041143E8F);
    }

    @Inject(at = @At("HEAD"), method = "paused()Z", cancellable = true)
    private void paused__1341309465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1341309465L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "totalTicks()J", cancellable = true)
    private void totalTicks_2126166003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126166003L))
            info.setReturnValue(5972639228064994945L);
    }


}
