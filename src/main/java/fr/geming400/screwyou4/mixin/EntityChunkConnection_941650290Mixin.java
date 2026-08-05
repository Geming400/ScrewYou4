package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.waypoints.WaypointTransmitter.EntityChunkConnection.class)
public class EntityChunkConnection_941650290Mixin {
        @Inject(at = @At("HEAD"), method = "update()V", cancellable = true)
    private void update_979925028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(979925028L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "connect()V", cancellable = true)
    private void connect_979925028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(979925028L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect()V", cancellable = true)
    private void disconnect_979925028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(979925028L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBroken()Z", cancellable = true)
    private void isBroken_979928872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979928872L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "distanceChessboard()I", cancellable = true)
    private void distanceChessboard_979912535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979912535L))
            info.setReturnValue(1414429322);
    }


}
