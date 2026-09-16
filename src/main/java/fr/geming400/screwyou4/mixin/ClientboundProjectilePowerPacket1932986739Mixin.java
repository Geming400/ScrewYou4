package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundProjectilePowerPacket.class)
public class ClientboundProjectilePowerPacket1932986739Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2088854329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088854329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_274663144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(274663144L))
            info.setReturnValue(938596358);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1637274876(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1637274876L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_341509145(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(341509145L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAccelerationPower()D", cancellable = true)
    private void getAccelerationPower__1228396987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228396987L))
            info.setReturnValue(2.7917750059562975E8D);
    }


}
