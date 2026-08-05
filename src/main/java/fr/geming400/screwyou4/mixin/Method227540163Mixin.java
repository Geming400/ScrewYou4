package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.IncomingRpcMethod.Method.class)
public class Method227540163Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1613052422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613052422L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__907919812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-907919812L))
            info.setReturnValue("F0XQ9e:BEZc傊;X`O@(i;<:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_265802905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(265802905L))
            info.setReturnValue(-1986166001);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lcom/google/gson/JsonElement;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lcom/google/gson/JsonElement;", cancellable = true)
    private void apply__2003153163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2003153163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/server/jsonrpc/api/MethodInfo;", cancellable = true)
    private void info__446881159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-446881159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "function()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$RpcMethodFunction;", cancellable = true)
    private void function__844777055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-844777055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$Attributes;", cancellable = true)
    private void attributes_473769634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473769634L))
            info.setReturnValue(null);
    }


}
