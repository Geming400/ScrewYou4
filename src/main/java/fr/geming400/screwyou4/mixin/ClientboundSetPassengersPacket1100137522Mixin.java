package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetPassengersPacket.class)
public class ClientboundSetPassengersPacket1100137522Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__578887566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578887566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1297645056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1297645056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1778206435(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1778206435L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVehicle()I", cancellable = true)
    private void getVehicle_1138399768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1138399768L))
            info.setReturnValue(-491808356);
    }

    @Inject(at = @At("HEAD"), method = "getPassengers()[I", cancellable = true)
    private void getPassengers__2008988417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2008988417L))
            info.setReturnValue(null);
    }


}
