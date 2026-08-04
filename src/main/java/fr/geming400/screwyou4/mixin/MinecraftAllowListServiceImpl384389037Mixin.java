package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftAllowListServiceImpl.class)
public class MinecraftAllowListServiceImpl384389037Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/players/NameAndId;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void remove__2094682406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2094682406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clear(Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void clear_298002967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(298002967L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/UserWhiteListEntry;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Z", cancellable = true)
    private void add__1917642865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1917642865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntries()Ljava/util/Collection;", cancellable = true)
    private void getEntries__1429259235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1429259235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "kickUnlistedPlayers(Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void kickUnlistedPlayers_298002967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(298002967L))
            info.cancel();
    }


}
