package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftBanListServiceImpl.class)
public class MinecraftBanListServiceImpl_1507590105Mixin {
        @Inject(at = @At("HEAD"), method = "addIpBan(Lnet/minecraft/server/players/IpBanListEntry;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void addIpBan_1485462956(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1485462956L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addUserBan(Lnet/minecraft/server/players/UserBanListEntry;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void addUserBan__570057968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-570057968L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearIpBans(Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void clearIpBans_1421204034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1421204034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeIpBan(Ljava/lang/String;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void removeIpBan__83215496(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-83215496L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIpBanEntries()Ljava/util/Collection;", cancellable = true)
    private void getIpBanEntries__306058168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-306058168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUserBanEntries()Ljava/util/Collection;", cancellable = true)
    private void getUserBanEntries__306058168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-306058168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearUserBans(Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void clearUserBans_1421204034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1421204034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeUserBan(Lnet/minecraft/server/players/NameAndId;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void removeUserBan__971481339(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-971481339L))
            info.cancel();
    }


}
