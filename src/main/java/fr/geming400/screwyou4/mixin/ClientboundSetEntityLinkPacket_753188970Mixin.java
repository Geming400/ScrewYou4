package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetEntityLinkPacket.class)
public class ClientboundSetEntityLinkPacket_753188970Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_909056559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(909056559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__838288625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-838288625L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_457477106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(457477106L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSourceId()I", cancellable = true)
    private void getSourceId_1329736131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329736131L))
            info.setReturnValue(419256460);
    }

    @Inject(at = @At("HEAD"), method = "getDestId()I", cancellable = true)
    private void getDestId_6555612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(6555612L))
            info.setReturnValue(-1393594491);
    }


}
