package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundContainerClosePacket.class)
public class ClientboundContainerClosePacket_1900749532Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2056617121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056617121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1605037668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1605037668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_309271937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(309271937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainerId()I", cancellable = true)
    private void getContainerId__488655813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-488655813L))
            info.setReturnValue(-1635889433);
    }


}
