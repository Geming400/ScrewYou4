package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.OutgoingRpcMethod.OutgoingRpcMethodBuilder.class)
public class OutgoingRpcMethodBuilder_1732739655Mixin {
        @Inject(at = @At("HEAD"), method = "register(Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void register__2067093339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067093339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "param(Ljava/lang/String;Lnet/minecraft/server/jsonrpc/api/Schema;)Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$OutgoingRpcMethodBuilder;", cancellable = true)
    private void param_926043170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(926043170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description(Ljava/lang/String;)Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$OutgoingRpcMethodBuilder;", cancellable = true)
    private void description__621259809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621259809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowPreServerInit()Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$OutgoingRpcMethodBuilder;", cancellable = true)
    private void allowPreServerInit__1604996651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1604996651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "response(Ljava/lang/String;Lnet/minecraft/server/jsonrpc/api/Schema;)Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$OutgoingRpcMethodBuilder;", cancellable = true)
    private void response_926043170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(926043170L))
            info.setReturnValue(null);
    }


}
