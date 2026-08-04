package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.waypoints.WaypointTransmitter.EntityBlockConnection.class)
public class EntityBlockConnection768671918Mixin {
        @Inject(at = @At("HEAD"), method = "update()V", cancellable = true)
    private void update_806946657(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(806946657L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "connect()V", cancellable = true)
    private void connect_806946657(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(806946657L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect()V", cancellable = true)
    private void disconnect_806946657(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(806946657L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBroken()Z", cancellable = true)
    private void isBroken_806950501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(806950501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceManhattan()I", cancellable = true)
    private void distanceManhattan_806934164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(806934164L))
            info.setReturnValue(null);
    }


}
