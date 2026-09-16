package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.waypoints.WaypointTransmitter.EntityBlockConnection.class)
public class EntityBlockConnection768671918Mixin {
        @Inject(at = @At("HEAD"), method = "update()V", cancellable = true)
    private void update_142206008(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(142206008L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "connect()V", cancellable = true)
    private void connect__1665298249(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1665298249L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect()V", cancellable = true)
    private void disconnect_2135339077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2135339077L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBroken()Z", cancellable = true)
    private void isBroken__207431642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207431642L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "distanceManhattan()I", cancellable = true)
    private void distanceManhattan__1415536407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415536407L))
            info.setReturnValue(-981758564);
    }


}
