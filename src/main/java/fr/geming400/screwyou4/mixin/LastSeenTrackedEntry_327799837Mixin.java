package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LastSeenTrackedEntry.class)
public class LastSeenTrackedEntry_327799837Mixin {
        @Inject(at = @At("HEAD"), method = "signature()Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void signature__916684947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-916684947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1713312095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1713312095L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__807660139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-807660139L))
            info.setReturnValue("n,r^\uCBFANC3g0s@Jp5Z\uB16EBWt[Lz&/k\u7ACFB>a\u0696C-%%.F\uA0CE^ytk^B\u6A54-L#\uBCC8b-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_366062578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(366062578L))
            info.setReturnValue(2046724438);
    }

    @Inject(at = @At("HEAD"), method = "pending()Z", cancellable = true)
    private void pending_366078419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(366078419L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "acknowledge()Lnet/minecraft/network/chat/LastSeenTrackedEntry;", cancellable = true)
    private void acknowledge_541238821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541238821L))
            info.setReturnValue(null);
    }


}
