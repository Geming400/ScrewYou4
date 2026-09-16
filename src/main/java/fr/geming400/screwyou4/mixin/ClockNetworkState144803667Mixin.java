package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.clock.ClockNetworkState.class)
public class ClockNetworkState144803667Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__763822601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763822601L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_915227192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915227192L))
            info.setReturnValue("! 8|KeJu^#_=k\u08ECA\u5F25=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_702155758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702155758L))
            info.setReturnValue(-1165784646);
    }

    @Inject(at = @At("HEAD"), method = "rate()F", cancellable = true)
    private void rate_308351254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(308351254L))
            info.setReturnValue(8.0035E8F);
    }

    @Inject(at = @At("HEAD"), method = "partialTick()F", cancellable = true)
    private void partialTick_2112877048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2112877048L))
            info.setReturnValue(8.0035E8F);
    }

    @Inject(at = @At("HEAD"), method = "totalTicks()J", cancellable = true)
    private void totalTicks__2074015064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2074015064L))
            info.setReturnValue(1798674313797234867L);
    }


}
