package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.RetryOptions.class)
public class RetryOptions1076360264Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1833094773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833094773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__59099711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-59099711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1114623006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114623006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noRetries()Lnet/minecraft/gametest/framework/RetryOptions;", cancellable = true)
    private static void noRetries_215215078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(215215078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasRetries()Z", cancellable = true)
    private void hasRetries_1114638847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114638847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberOfTries()I", cancellable = true)
    private void numberOfTries_1114622510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114622510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlimitedTries()Z", cancellable = true)
    private void unlimitedTries_1114638847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114638847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasTriesLeft(II)Z", cancellable = true)
    private void hasTriesLeft_80484639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80484639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "haltOnFailure()Z", cancellable = true)
    private void haltOnFailure_1114638847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114638847L))
            info.setReturnValue(null);
    }


}
