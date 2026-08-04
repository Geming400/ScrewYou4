package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.BanlistService.class)
public class BanlistService785014310Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void remove__1781521642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781521642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Ljava/util/List;", cancellable = true)
    private static void get__180730912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-180730912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void clear_955333733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955333733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void add__1781521642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781521642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void set__1781521642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781521642L))
            info.setReturnValue(null);
    }


}
