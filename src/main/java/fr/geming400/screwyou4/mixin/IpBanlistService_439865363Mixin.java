package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.IpBanlistService.class)
public class IpBanlistService_439865363Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void remove_1270327174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270327174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Ljava/util/List;", cancellable = true)
    private static void get_875037878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(875037878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void clear_108249886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(108249886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void add__1226894301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1226894301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void set__1053446556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1053446556L))
            info.setReturnValue(null);
    }


}
