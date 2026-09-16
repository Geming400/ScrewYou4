package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.IncomingRpcMethod.IncomingRpcMethodBuilder.class)
public class IncomingRpcMethodBuilder_613566547Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/core/Registry;Ljava/lang/String;)Lnet/minecraft/server/jsonrpc/IncomingRpcMethod;", cancellable = true)
    private void register_224791967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(224791967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "param(Ljava/lang/String;Lnet/minecraft/server/jsonrpc/api/Schema;)Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$IncomingRpcMethodBuilder;", cancellable = true)
    private void param__1403354553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1403354553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod;", cancellable = true)
    private void build_1793084920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1793084920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description(Ljava/lang/String;)Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$IncomingRpcMethodBuilder;", cancellable = true)
    private void description__1117259013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117259013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "response(Ljava/lang/String;Lnet/minecraft/server/jsonrpc/api/Schema;)Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$IncomingRpcMethodBuilder;", cancellable = true)
    private void response__411219461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-411219461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notOnMainThread()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$IncomingRpcMethodBuilder;", cancellable = true)
    private void notOnMainThread_1970789304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1970789304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowPreServerInit()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$IncomingRpcMethodBuilder;", cancellable = true)
    private void allowPreServerInit__175309728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-175309728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "undiscoverable()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$IncomingRpcMethodBuilder;", cancellable = true)
    private void undiscoverable__1259184111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1259184111L))
            info.setReturnValue(null);
    }


}
