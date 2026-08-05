package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftServerStateServiceImpl.class)
public class MinecraftServerStateServiceImpl_1915469050Mixin {
        @Inject(at = @At("HEAD"), method = "halt(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void halt__74341223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-74341223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "broadcastSystemMessage(Lnet/minecraft/network/chat/Component;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void broadcastSystemMessage_1423048877(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1423048877L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendSystemMessage(Lnet/minecraft/network/chat/Component;ZLjava/util/Collection;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void sendSystemMessage_836495772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(836495772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendSystemMessage(Lnet/minecraft/network/chat/Component;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void sendSystemMessage__755013425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-755013425L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isReady()Z", cancellable = true)
    private void isReady_1953747632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1953747632L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "saveEverything(ZZZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void saveEverything_1514464477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514464477L))
            info.setReturnValue(false);
    }


}
