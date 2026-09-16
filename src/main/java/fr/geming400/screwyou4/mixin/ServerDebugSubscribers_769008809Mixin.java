package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.ServerDebugSubscribers.class)
public class ServerDebugSubscribers_769008809Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_639325150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(639325150L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasAnySubscriberFor(Lnet/minecraft/util/debug/DebugSubscription;)Z", cancellable = true)
    private void hasAnySubscriberFor__184147036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-184147036L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasRequiredPermissions(Lnet/minecraft/server/level/ServerPlayer;)Z", cancellable = true)
    private void hasRequiredPermissions_2014727642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2014727642L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "broadcastToAll(Lnet/minecraft/util/debug/DebugSubscription;Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private void broadcastToAll_635437849(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(635437849L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enabledSubscriptions()Ljava/util/Set;", cancellable = true)
    private void enabledSubscriptions__1419081867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1419081867L))
            info.setReturnValue(null);
    }


}
