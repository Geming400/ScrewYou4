package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.waypoints.WaypointTransmitter.EntityAzimuthConnection.class)
public class EntityAzimuthConnection_2053587123Mixin {
        @Inject(at = @At("HEAD"), method = "update()V", cancellable = true)
    private void update_1427121212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1427121212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "connect()V", cancellable = true)
    private void connect__380383045(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-380383045L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect()V", cancellable = true)
    private void disconnect__874713015(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-874713015L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBroken()Z", cancellable = true)
    private void isBroken_1077483562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077483562L))
            info.setReturnValue(false);
    }


}
