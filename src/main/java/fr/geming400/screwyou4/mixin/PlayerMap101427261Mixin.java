package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.PlayerMap.class)
public class PlayerMap101427261Mixin {
        @Inject(at = @At("HEAD"), method = "ignored(Lnet/minecraft/server/level/ServerPlayer;)Z", cancellable = true)
    private void ignored__668130748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-668130748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removePlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void removePlayer__668134592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-668134592L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlayer(Lnet/minecraft/server/level/ServerPlayer;Z)V", cancellable = true)
    private void addPlayer_2057913514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2057913514L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAllPlayers()Ljava/util/Set;", cancellable = true)
    private void getAllPlayers__1727608225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1727608225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unIgnorePlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void unIgnorePlayer__668134592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-668134592L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ignorePlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void ignorePlayer__668134592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-668134592L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ignoredOrUnknown(Lnet/minecraft/server/level/ServerPlayer;)Z", cancellable = true)
    private void ignoredOrUnknown__668130748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-668130748L))
            info.setReturnValue(null);
    }


}
