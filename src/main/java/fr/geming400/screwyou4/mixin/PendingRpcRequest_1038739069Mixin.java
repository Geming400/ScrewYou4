package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.PendingRpcRequest.class)
public class PendingRpcRequest_1038739069Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1870715969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1870715969L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__96720907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96720907L))
            info.setReturnValue("%dRaYDUPA{#vi9$C>)5l\"ms9'㘉鰦(E^mu&");
    }

    @Inject(at = @At("HEAD"), method = "method()Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void method__149606959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-149606959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1077001810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077001810L))
            info.setReturnValue(1093362459);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lcom/google/gson/JsonElement;)V", cancellable = true)
    private void accept_974690510(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(974690510L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "timedOut(J)Z", cancellable = true)
    private void timedOut__2041383891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2041383891L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "resultFuture()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void resultFuture__1542852967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542852967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeoutTime()J", cancellable = true)
    private void timeoutTime_1077002275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077002275L))
            info.setReturnValue(701515335661878049L);
    }


}
