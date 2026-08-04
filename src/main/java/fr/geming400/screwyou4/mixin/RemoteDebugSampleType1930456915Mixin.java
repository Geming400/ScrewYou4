package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debugchart.RemoteDebugSampleType.class)
public class RemoteDebugSampleType1930456915Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/debugchart/RemoteDebugSampleType;", cancellable = true)
    private static void values_128556592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(128556592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/debugchart/RemoteDebugSampleType;", cancellable = true)
    private static void valueOf__1781902381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781902381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subscription()Lnet/minecraft/util/debug/DebugSubscription;", cancellable = true)
    private void subscription__1606567706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1606567706L))
            info.setReturnValue(null);
    }


}
