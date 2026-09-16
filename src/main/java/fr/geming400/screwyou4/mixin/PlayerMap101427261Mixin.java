package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.PlayerMap.class)
public class PlayerMap101427261Mixin {
        @Inject(at = @At("HEAD"), method = "ignored(Lnet/minecraft/server/level/ServerPlayer;)Z", cancellable = true)
    private void ignored__2119483498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2119483498L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addPlayer(Lnet/minecraft/server/level/ServerPlayer;Z)V", cancellable = true)
    private void addPlayer_538028424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(538028424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removePlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void removePlayer__424083707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-424083707L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAllPlayers()Ljava/util/Set;", cancellable = true)
    private void getAllPlayers__652820936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-652820936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignorePlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void ignorePlayer__699164333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-699164333L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unIgnorePlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void unIgnorePlayer_646619852(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(646619852L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ignoredOrUnknown(Lnet/minecraft/server/level/ServerPlayer;)Z", cancellable = true)
    private void ignoredOrUnknown__1124328007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1124328007L))
            info.setReturnValue(true);
    }


}
