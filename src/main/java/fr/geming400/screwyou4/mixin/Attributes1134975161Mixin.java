package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.IncomingRpcMethod.Attributes.class)
public class Attributes1134975161Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_226348893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226348893L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1905398686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905398686L))
            info.setReturnValue("{");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1692327252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692327252L))
            info.setReturnValue(-1495566008);
    }

    @Inject(at = @At("HEAD"), method = "discoverable()Z", cancellable = true)
    private void discoverable_1890549645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1890549645L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "runOnMainThread()Z", cancellable = true)
    private void runOnMainThread_1104377859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104377859L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "allowPreServerInit()Z", cancellable = true)
    private void allowPreServerInit__1085888157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1085888157L))
            info.setReturnValue(false);
    }


}
