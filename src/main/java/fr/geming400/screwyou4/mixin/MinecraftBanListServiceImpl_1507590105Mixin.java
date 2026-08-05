package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftBanListServiceImpl.class)
public class MinecraftBanListServiceImpl_1507590105Mixin {
        @Inject(at = @At("HEAD"), method = "addIpBan(Lnet/minecraft/server/players/IpBanListEntry;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void addIpBan__979684603(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-979684603L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addUserBan(Lnet/minecraft/server/players/UserBanListEntry;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void addUserBan__1229132659(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1229132659L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIpBanEntries()Ljava/util/Collection;", cancellable = true)
    private void getIpBanEntries_1835623238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1835623238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearIpBans(Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void clearIpBans__1318604550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1318604550L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeUserBan(Lnet/minecraft/server/players/NameAndId;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void removeUserBan_254634533(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(254634533L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeIpBan(Ljava/lang/String;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void removeIpBan__90639684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-90639684L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearUserBans(Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void clearUserBans__1773948066(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1773948066L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUserBanEntries()Ljava/util/Collection;", cancellable = true)
    private void getUserBanEntries_1262869098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262869098L))
            info.setReturnValue(null);
    }


}
