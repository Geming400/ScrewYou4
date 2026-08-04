package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.ServerStateService.class)
public class ServerStateService_516784539Mixin {
        @Inject(at = @At("HEAD"), method = "status(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Lnet/minecraft/server/jsonrpc/methods/ServerStateService$ServerState;", cancellable = true)
    private static void status_1907815020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1907815020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void stop_1330069010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1330069010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void save_646834532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646834532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "systemMessage(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/server/jsonrpc/methods/ServerStateService$SystemMessage;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private static void systemMessage__1310308711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1310308711L))
            info.setReturnValue(null);
    }


}
