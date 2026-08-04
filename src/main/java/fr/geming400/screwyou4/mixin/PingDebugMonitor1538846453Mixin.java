package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.PingDebugMonitor.class)
public class PingDebugMonitor1538846453Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1577121192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1577121192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPongReceived(Lnet/minecraft/network/protocol/ping/ClientboundPongResponsePacket;)V", cancellable = true)
    private void onPongReceived_35069350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(35069350L))
            info.cancel();
    }


}
