package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.waypoints.WaypointTransmitter.EntityAzimuthConnection.class)
public class EntityAzimuthConnection_2053587123Mixin {
        @Inject(at = @At("HEAD"), method = "update()V", cancellable = true)
    private void update_2091861861(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2091861861L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "connect()V", cancellable = true)
    private void connect_2091861861(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2091861861L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect()V", cancellable = true)
    private void disconnect_2091861861(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2091861861L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBroken()Z", cancellable = true)
    private void isBroken_2091865705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091865705L))
            info.setReturnValue(null);
    }


}
