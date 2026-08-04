package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.ServerDebugSubscribers.class)
public class ServerDebugSubscribers_769008809Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_807283547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(807283547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasAnySubscriberFor(Lnet/minecraft/util/debug/DebugSubscription;)Z", cancellable = true)
    private void hasAnySubscriberFor_19587891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(19587891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasRequiredPermissions(Lnet/minecraft/server/level/ServerPlayer;)Z", cancellable = true)
    private void hasRequiredPermissions__549201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enabledSubscriptions()Ljava/util/Set;", cancellable = true)
    private void enabledSubscriptions__1060026678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1060026678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "broadcastToAll(Lnet/minecraft/util/debug/DebugSubscription;Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private void broadcastToAll_1534014772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1534014772L))
            info.cancel();
    }


}
