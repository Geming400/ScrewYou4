package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.waypoints.WaypointTransmitter.EntityChunkConnection.class)
public class EntityChunkConnection_941650290Mixin {
        @Inject(at = @At("HEAD"), method = "update()V", cancellable = true)
    private void update_315184379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(315184379L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "connect()V", cancellable = true)
    private void connect__1492319878(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1492319878L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect()V", cancellable = true)
    private void disconnect__1986649848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1986649848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBroken()Z", cancellable = true)
    private void isBroken__34453271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-34453271L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "distanceChessboard()I", cancellable = true)
    private void distanceChessboard__1338965380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338965380L))
            info.setReturnValue(1052045361);
    }


}
