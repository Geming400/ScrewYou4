package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ServerStatusPinger.class)
public class ServerStatusPinger_2089738256Mixin {
        @Inject(at = @At("HEAD"), method = "removeAll()V", cancellable = true)
    private void removeAll_2128012994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2128012994L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2128012994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2128012994L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "formatPlayerCount(II)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void formatPlayerCount__1015888262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1015888262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pingServer(Lnet/minecraft/client/multiplayer/ServerData;Ljava/lang/Runnable;Ljava/lang/Runnable;Lnet/minecraft/server/network/EventLoopGroupHolder;)V", cancellable = true)
    private void pingServer__1587812238(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1587812238L))
            info.cancel();
    }


}
