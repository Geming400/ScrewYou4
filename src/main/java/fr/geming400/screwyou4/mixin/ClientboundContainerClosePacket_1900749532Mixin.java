package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundContainerClosePacket.class)
public class ClientboundContainerClosePacket_1900749532Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_221724443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(221724443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1716148852(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1716148852L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_2098257065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2098257065L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainerId()I", cancellable = true)
    private void getContainerId_1939011777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939011777L))
            info.setReturnValue(782439225);
    }


}
