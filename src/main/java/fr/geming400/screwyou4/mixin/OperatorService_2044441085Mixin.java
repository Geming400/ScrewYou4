package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.OperatorService.class)
public class OperatorService_2044441085Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void remove__522094868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-522094868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Ljava/util/List;", cancellable = true)
    private static void get_1078695862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078695862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void clear__2080206789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2080206789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void add__522094868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-522094868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void set__522094868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-522094868L))
            info.setReturnValue(null);
    }


}
