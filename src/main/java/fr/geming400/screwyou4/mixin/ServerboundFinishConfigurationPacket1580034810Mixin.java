package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ServerboundFinishConfigurationPacket.class)
public class ServerboundFinishConfigurationPacket1580034810Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__98990278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-98990278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2036863573(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2036863573L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ServerConfigurationPacketListener;)V", cancellable = true)
    private void handle_1982706248(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1982706248L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal_1618313393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1618313393L))
            info.setReturnValue(true);
    }


}
