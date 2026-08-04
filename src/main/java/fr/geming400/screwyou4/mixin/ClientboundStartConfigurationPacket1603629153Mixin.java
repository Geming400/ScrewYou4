package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundStartConfigurationPacket.class)
public class ClientboundStartConfigurationPacket1603629153Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__75395935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-75395935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2013269230(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2013269230L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1801136687(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1801136687L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal_1641907736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1641907736L))
            info.setReturnValue(null);
    }


}
