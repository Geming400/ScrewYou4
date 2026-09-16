package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.DisconnectionDetails.class)
public class DisconnectionDetails1225821628Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_317195360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(317195360L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1996245153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1996245153L))
            info.setReturnValue("\u92B7cEf9Mruez\uD4FF&\uC1C9C+OB\u46E6OWg-\u2AA0qxxyt_\"i\u19A4T\"p)Mz\uFFD2ZKF\u3A50O4\u0ACC\"sL*j\u60B6wsC\u25D8;]\uC464[5|:HQ'zH\u8A6CK+GQ`5;BDV\uC7ECs9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1783173719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1783173719L))
            info.setReturnValue(1906684337);
    }

    @Inject(at = @At("HEAD"), method = "reason()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void reason__1612706925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612706925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "report()Ljava/util/Optional;", cancellable = true)
    private void report__547424098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-547424098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bugReportLink()Ljava/util/Optional;", cancellable = true)
    private void bugReportLink_1364693580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364693580L))
            info.setReturnValue(null);
    }


}
