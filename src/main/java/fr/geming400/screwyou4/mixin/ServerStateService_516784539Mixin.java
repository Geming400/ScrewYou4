package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.ServerStateService.class)
public class ServerStateService_516784539Mixin {
        @Inject(at = @At("HEAD"), method = "status(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Lnet/minecraft/server/jsonrpc/methods/ServerStateService$ServerState;", cancellable = true)
    private static void status_454271582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(454271582L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void stop_947151184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947151184L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void save__1888866271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1888866271L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "systemMessage(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/server/jsonrpc/methods/ServerStateService$SystemMessage;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void systemMessage__1802261135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1802261135L))
            info.setReturnValue(false);
    }


}
