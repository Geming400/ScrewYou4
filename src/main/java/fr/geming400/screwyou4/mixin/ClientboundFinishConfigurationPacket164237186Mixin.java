package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ClientboundFinishConfigurationPacket.class)
public class ClientboundFinishConfigurationPacket164237186Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1514787902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1514787902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_842306099(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(842306099L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ClientConfigurationPacketListener;)V", cancellable = true)
    private void handle__848889000(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-848889000L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal_202515769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202515769L))
            info.setReturnValue(null);
    }


}
