package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debugchart.RemoteDebugSampleType.class)
public class RemoteDebugSampleType1930456915Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/debugchart/RemoteDebugSampleType;", cancellable = true)
    private static void values_889597138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889597138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/debugchart/RemoteDebugSampleType;", cancellable = true)
    private static void valueOf__2073851989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073851989L))
            info.setReturnValue(net.minecraft.util.debugchart.RemoteDebugSampleType.TICK_TIME);
    }

    @Inject(at = @At("HEAD"), method = "subscription()Lnet/minecraft/util/debug/DebugSubscription;", cancellable = true)
    private void subscription_968131587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(968131587L))
            info.setReturnValue(null);
    }


}
