package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetPassengersPacket.class)
public class ClientboundSetPassengersPacket1100137522Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1256005112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1256005112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__491340072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-491340072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_804425659(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(804425659L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVehicle()I", cancellable = true)
    private void getVehicle_643840226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643840226L))
            info.setReturnValue(1006399207);
    }

    @Inject(at = @At("HEAD"), method = "getPassengers()[I", cancellable = true)
    private void getPassengers_1495626958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495626958L))
            info.setReturnValue(null);
    }


}
