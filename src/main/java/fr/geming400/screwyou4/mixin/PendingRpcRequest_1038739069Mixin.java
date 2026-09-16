package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.PendingRpcRequest.class)
public class PendingRpcRequest_1038739069Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_130112800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130112800L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1809162593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809162593L))
            info.setReturnValue("]9XA-`\u1CD7g/k_Z`3#cPJs\u9F01=6AQb{a\u5460\uA301`'o83J+fgM\u24D7?dE \u8B0E=H(%7\u4AE2r? \u82CFH&\uC2E1^74D?Zs\u550DAR@p\u522C>g\u838A|)I|\u3B990zgi@[\u317C");
    }

    @Inject(at = @At("HEAD"), method = "method()Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void method__1274212848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274212848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1596091159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596091159L))
            info.setReturnValue(-1714491327);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lcom/google/gson/JsonElement;)V", cancellable = true)
    private void accept__774304810(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-774304810L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "timedOut(J)Z", cancellable = true)
    private void timedOut_1467529092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467529092L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "resultFuture()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void resultFuture_212698841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(212698841L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "timeoutTime()J", cancellable = true)
    private void timeoutTime_510489877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(510489877L))
            info.setReturnValue(-2011591395067550254L);
    }


}
