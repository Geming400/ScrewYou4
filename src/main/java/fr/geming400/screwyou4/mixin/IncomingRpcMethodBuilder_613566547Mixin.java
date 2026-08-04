package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.IncomingRpcMethod.IncomingRpcMethodBuilder.class)
public class IncomingRpcMethodBuilder_613566547Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/core/Registry;Ljava/lang/String;)Lnet/minecraft/server/jsonrpc/IncomingRpcMethod;", cancellable = true)
    private void register__2053996766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2053996766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "param(Ljava/lang/String;Lnet/minecraft/server/jsonrpc/api/Schema;)Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$IncomingRpcMethodBuilder;", cancellable = true)
    private void param_141498042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141498042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod;", cancellable = true)
    private void build_1480802954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480802954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description(Ljava/lang/String;)Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$IncomingRpcMethodBuilder;", cancellable = true)
    private void description__1405804937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1405804937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "response(Ljava/lang/String;Lnet/minecraft/server/jsonrpc/api/Schema;)Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$IncomingRpcMethodBuilder;", cancellable = true)
    private void response_141498042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141498042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowPreServerInit()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$IncomingRpcMethodBuilder;", cancellable = true)
    private void allowPreServerInit_1905425517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905425517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notOnMainThread()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$IncomingRpcMethodBuilder;", cancellable = true)
    private void notOnMainThread_1905425517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905425517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "undiscoverable()Lnet/minecraft/server/jsonrpc/IncomingRpcMethod$IncomingRpcMethodBuilder;", cancellable = true)
    private void undiscoverable_1905425517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905425517L))
            info.setReturnValue(null);
    }


}
