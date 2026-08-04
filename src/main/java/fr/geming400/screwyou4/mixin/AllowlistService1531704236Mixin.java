package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.AllowlistService.class)
public class AllowlistService1531704236Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void remove__1034831716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034831716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Ljava/util/List;", cancellable = true)
    private static void get_565959014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(565959014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void clear_1702023659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1702023659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void add__1034831716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034831716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void set__1034831716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034831716L))
            info.setReturnValue(null);
    }


}
