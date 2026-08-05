package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.IncomingRpcMethod.ParameterlessMethod.class)
public class ParameterlessMethod_1411574711Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1497880327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497880327L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_276114735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(276114735L))
            info.setReturnValue("J\"cUYUxiEeM]L븶9좟IexL");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1449837452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449837452L))
            info.setReturnValue(209838214);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lcom/google/gson/JsonElement;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lcom/google/gson/JsonElement;", cancellable = true)
    private void apply__819118616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-819118616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/server/jsonrpc/api/MethodInfo;", cancellable = true)
    private void info_737153388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(737153388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "supplier()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$ParameterlessRpcMethodFunction;", cancellable = true)
    private void supplier__827788336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-827788336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$Attributes;", cancellable = true)
    private void attributes_1657804181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657804181L))
            info.setReturnValue(null);
    }


}
