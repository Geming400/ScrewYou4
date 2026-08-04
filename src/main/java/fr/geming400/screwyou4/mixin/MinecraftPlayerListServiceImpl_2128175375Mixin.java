package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftPlayerListServiceImpl.class)
public class MinecraftPlayerListServiceImpl_2128175375Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void remove_618807592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(618807592L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayers()Ljava/util/List;", cancellable = true)
    private void getPlayers__540455106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-540455106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayer(Ljava/util/Optional;Ljava/util/Optional;)Ljava/util/Optional;", cancellable = true)
    private void getPlayer_766587166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766587166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayer(Ljava/util/UUID;)Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void getPlayer__1129699489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1129699489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCachedUserById(Ljava/util/UUID;)Ljava/util/Optional;", cancellable = true)
    private void getCachedUserById_1544003688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1544003688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fetchUserById(Ljava/util/UUID;)Ljava/util/Optional;", cancellable = true)
    private void fetchUserById_1544003688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1544003688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fetchUserByName(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void fetchUserByName__156756366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-156756366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerByName(Ljava/lang/String;)Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void getPlayerByName__347554923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-347554923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayersWithAddress(Ljava/lang/String;)Ljava/util/List;", cancellable = true)
    private void getPlayersWithAddress_1432935924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432935924L))
            info.setReturnValue(null);
    }


}
