package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftAllowListServiceImpl.class)
public class MinecraftAllowListServiceImpl384389037Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/players/NameAndId;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void remove__1335375778(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1335375778L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clear(Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void clear__1398668124(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1398668124L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/UserWhiteListEntry;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void add__1857182770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857182770L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getEntries()Ljava/util/Collection;", cancellable = true)
    private void getEntries__1609637897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1609637897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "kickUnlistedPlayers(Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void kickUnlistedPlayers__850762323(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-850762323L))
            info.cancel();
    }


}
