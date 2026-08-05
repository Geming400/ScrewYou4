package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.OutgoingRpcMethod.OutgoingRpcMethodBuilder.class)
public class OutgoingRpcMethodBuilder_1732739655Mixin {
        @Inject(at = @At("HEAD"), method = "register(Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void register_929314850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929314850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "param(Ljava/lang/String;Lnet/minecraft/server/jsonrpc/api/Schema;)Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$OutgoingRpcMethodBuilder;", cancellable = true)
    private void param__618809425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-618809425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description(Ljava/lang/String;)Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$OutgoingRpcMethodBuilder;", cancellable = true)
    private void description__332713885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-332713885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowPreServerInit()Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$OutgoingRpcMethodBuilder;", cancellable = true)
    private void allowPreServerInit_609235400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609235400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "response(Ljava/lang/String;Lnet/minecraft/server/jsonrpc/api/Schema;)Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$OutgoingRpcMethodBuilder;", cancellable = true)
    private void response_373325667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(373325667L))
            info.setReturnValue(null);
    }


}
