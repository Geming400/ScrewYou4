package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ServerStatusPinger.class)
public class ServerStatusPinger_2089738256Mixin {
        @Inject(at = @At("HEAD"), method = "removeAll()V", cancellable = true)
    private void removeAll__2054430107(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2054430107L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1960054597(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1960054597L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "formatPlayerCount(II)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void formatPlayerCount__1468147151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1468147151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pingServer(Lnet/minecraft/client/multiplayer/ServerData;Ljava/lang/Runnable;Ljava/lang/Runnable;Lnet/minecraft/server/network/EventLoopGroupHolder;)V", cancellable = true)
    private void pingServer__1106687171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1106687171L))
            info.cancel();
    }


}
