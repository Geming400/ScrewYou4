package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.OutgoingRpcMethod.ParameterlessMethod.class)
public class ParameterlessMethod_2063470525Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1154844256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154844256L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1461073247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1461073247L))
            info.setReturnValue(";(!C7A]\"(f_Y\u75C00)\uAAAD*D!\uD60C|=m`CS@Z-0bEN]^p_^Ac6bT#D%\u7BBFtZ{iqqg6?v#Ho1\"F\uB2956q?Z\u7E94\u2205816Kq\uB9B6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1674144681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1674144681L))
            info.setReturnValue(689851530);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/server/jsonrpc/api/MethodInfo;", cancellable = true)
    private void info__1527956860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1527956860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$Attributes;", cancellable = true)
    private void attributes_1257912158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1257912158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decodeResult(Lcom/google/gson/JsonElement;)Ljava/lang/Object;", cancellable = true)
    private void decodeResult__1746477555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1746477555L))
            info.setReturnValue(null);
    }


}
