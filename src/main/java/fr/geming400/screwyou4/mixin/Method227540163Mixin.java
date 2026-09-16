package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.IncomingRpcMethod.Method.class)
public class Method227540163Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__681086105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-681086105L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_997963688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(997963688L))
            info.setReturnValue("\u3C08t>O\u5D00%w/M\uCC7DUM*l_g\u9E7E+>x<B7%g<q65q\uFD57e>\u7730ZiC9d**IZ\uC2AE\u3F69p\u5416zE\uA7B0Sj.1;m)|\uC942fQ\u26C1vj?W]-Pj#CpedP;\u4015M=>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_784892254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(784892254L))
            info.setReturnValue(2065105883);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lcom/google/gson/JsonElement;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lcom/google/gson/JsonElement;", cancellable = true)
    private void apply_1851322339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1851322339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/server/jsonrpc/api/MethodInfo;", cancellable = true)
    private void info_931080075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931080075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "function()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$RpcMethodFunction;", cancellable = true)
    private void function_1058679673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1058679673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$Attributes;", cancellable = true)
    private void attributes__1326010773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1326010773L))
            info.setReturnValue(null);
    }


}
