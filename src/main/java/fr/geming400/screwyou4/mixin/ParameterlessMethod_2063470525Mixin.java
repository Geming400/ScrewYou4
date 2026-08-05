package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.OutgoingRpcMethod.ParameterlessMethod.class)
public class ParameterlessMethod_2063470525Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__845984513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845984513L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_928010549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928010549L))
            info.setReturnValue("Y1\uA167\uC3FB\uB0CA!eJ|\"\u4A91Z\"K?bw]x(5`\uB871tIj9h0|d\uADD1Q\u1D712Q[\"VI\u2277");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2101733266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101733266L))
            info.setReturnValue(-1351132848);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/server/jsonrpc/api/MethodInfo;", cancellable = true)
    private void info_1389049202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1389049202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$Attributes;", cancellable = true)
    private void attributes__1237274731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237274731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decodeResult(Lcom/google/gson/JsonElement;)Ljava/lang/Object;", cancellable = true)
    private void decodeResult__1051772008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1051772008L))
            info.setReturnValue(new java.lang.Object());
    }


}
