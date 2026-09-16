package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftServerStateServiceImpl.class)
public class MinecraftServerStateServiceImpl_1915469050Mixin {
        @Inject(at = @At("HEAD"), method = "halt(ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void halt__1839993032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1839993032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isReady()Z", cancellable = true)
    private void isReady_307135415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307135415L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "broadcastSystemMessage(Lnet/minecraft/network/chat/Component;ZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void broadcastSystemMessage__1000413066(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1000413066L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendSystemMessage(Lnet/minecraft/network/chat/Component;ZLjava/util/Collection;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void sendSystemMessage__127706260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-127706260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendSystemMessage(Lnet/minecraft/network/chat/Component;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void sendSystemMessage_434094335(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(434094335L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveEverything(ZZZLnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void saveEverything_1806624461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1806624461L))
            info.setReturnValue(false);
    }


}
