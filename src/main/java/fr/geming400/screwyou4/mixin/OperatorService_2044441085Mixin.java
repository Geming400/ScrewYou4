package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.OperatorService.class)
public class OperatorService_2044441085Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void remove__1420064400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1420064400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Ljava/util/List;", cancellable = true)
    private static void get__1815353696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815353696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void clear_1712825608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712825608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void add_377681421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377681421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void set_551129166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551129166L))
            info.setReturnValue(null);
    }


}
