package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundProjectilePowerPacket.class)
public class ClientboundProjectilePowerPacket1932986739Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_253961651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253961651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1971248985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971248985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1683911644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1683911644L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_2130494273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2130494273L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAccelerationPower()D", cancellable = true)
    private void getAccelerationPower_1971244180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971244180L))
            info.setReturnValue(null);
    }


}
