package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.IncomingRpcMethod.ParameterlessMethod.class)
public class ParameterlessMethod_1411574711Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_502948442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(502948442L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2112969061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2112969061L))
            info.setReturnValue("#\uADCE7lR>\u25F4\u83DBBxv(\u2F9Ey1Rn\u4C13NVJ\uAB48!-{KEb,;N%\uCCA5\u663Ao(aAOvR!\"RT^s,I\u9659\uCC5F$g\u8C5C\u05C2#W$o({l?V)\uA599awlV\uB656UX?b2\uAE219/'J.Qt\u6DBFw");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1968926801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968926801L))
            info.setReturnValue(-1814847848);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lcom/google/gson/JsonElement;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lcom/google/gson/JsonElement;", cancellable = true)
    private void apply__1259610410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1259610410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/server/jsonrpc/api/MethodInfo;", cancellable = true)
    private void info_2115114622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2115114622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "supplier()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$ParameterlessRpcMethodFunction;", cancellable = true)
    private void supplier_808947332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(808947332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$Attributes;", cancellable = true)
    private void attributes__141976226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-141976226L))
            info.setReturnValue(null);
    }


}
