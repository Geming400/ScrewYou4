package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugSubscription.class)
public class DebugSubscription_666508030Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1436931058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1436931058L))
            info.setReturnValue("zj_M#-\u95CE+!E{.eB4uGX@,OKM-s7\u57A2=r[HbN>%Mk^ofNi\uD1D0\u6ECC7m\u1F738}");
    }

    @Inject(at = @At("HEAD"), method = "valueStreamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void valueStreamCodec_1059939988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059939988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expireAfterTicks()I", cancellable = true)
    private void expireAfterTicks_2028036106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2028036106L))
            info.setReturnValue(-1414267242);
    }

    @Inject(at = @At("HEAD"), method = "emptyUpdate()Lnet/minecraft/util/debug/DebugSubscription$Update;", cancellable = true)
    private void emptyUpdate__1294091847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1294091847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packUpdate(Ljava/lang/Object;)Lnet/minecraft/util/debug/DebugSubscription$Update;", cancellable = true)
    private void packUpdate__1714605175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1714605175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packEvent(Ljava/lang/Object;)Lnet/minecraft/util/debug/DebugSubscription$Event;", cancellable = true)
    private void packEvent_46021983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(46021983L))
            info.setReturnValue(null);
    }


}
