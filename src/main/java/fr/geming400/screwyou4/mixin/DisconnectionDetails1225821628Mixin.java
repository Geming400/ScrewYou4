package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.DisconnectionDetails.class)
public class DisconnectionDetails1225821628Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1683633409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1683633409L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_90361653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90361653L))
            info.setReturnValue("늸_X&줲fꄤꣴKYZ4ᄖsYn&YDሓzdp'8kH=c5$.>T뽆巧:Uk䈋Xꀕ,?M.f\"᱙`(kA[xZs35mҫj룝g<9G슆)YTs03}lRm䆚끞%k兓c&,<GᑷL5B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1264084370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1264084370L))
            info.setReturnValue(1456281411);
    }

    @Inject(at = @At("HEAD"), method = "reason()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void reason__951087537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-951087537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "report()Ljava/util/Optional;", cancellable = true)
    private void report_1471283050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471283050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bugReportLink()Ljava/util/Optional;", cancellable = true)
    private void bugReportLink_1471283050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471283050L))
            info.setReturnValue(null);
    }


}
