package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.IncomingRpcMethod.Attributes.class)
public class Attributes1134975161Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1774479876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1774479876L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__484814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-484814L))
            info.setReturnValue("n\u182DPf$ENz&\u48C8NFVp#KP\uC778r%{.s]PNL\u8F57,Oz+m^)6Q?zJhZ\u3FC0#cfc/C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1173237903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173237903L))
            info.setReturnValue(-1037397992);
    }

    @Inject(at = @At("HEAD"), method = "allowPreServerInit()Z", cancellable = true)
    private void allowPreServerInit_1173253744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173253744L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "runOnMainThread()Z", cancellable = true)
    private void runOnMainThread_1173253744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173253744L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "discoverable()Z", cancellable = true)
    private void discoverable_1173253744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173253744L))
            info.setReturnValue(true);
    }


}
