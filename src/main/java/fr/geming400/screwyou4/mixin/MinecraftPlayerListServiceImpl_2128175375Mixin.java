package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftPlayerListServiceImpl.class)
public class MinecraftPlayerListServiceImpl_2128175375Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void remove__1612490716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1612490716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayer(Ljava/util/Optional;Ljava/util/Optional;)Ljava/util/Optional;", cancellable = true)
    private void getPlayer__680741131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-680741131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayer(Ljava/util/UUID;)Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void getPlayer_2068662504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2068662504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCachedUserById(Ljava/util/UUID;)Ljava/util/Optional;", cancellable = true)
    private void getCachedUserById_30954973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(30954973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fetchUserByName(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void fetchUserByName_1210846009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1210846009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fetchUserById(Ljava/util/UUID;)Ljava/util/Optional;", cancellable = true)
    private void fetchUserById_1017146495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1017146495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayers()Ljava/util/List;", cancellable = true)
    private void getPlayers_1247917754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247917754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerByName(Ljava/lang/String;)Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void getPlayerByName__794790852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794790852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayersWithAddress(Ljava/lang/String;)Ljava/util/List;", cancellable = true)
    private void getPlayersWithAddress_657081766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657081766L))
            info.setReturnValue(null);
    }


}
