package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetEntityLinkPacket.class)
public class ClientboundSetEntityLinkPacket_753188970Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__925836119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-925836119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_950696503(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(950696503L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1431257882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1431257882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDestId()I", cancellable = true)
    private void getDestId_791451215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791451215L))
            info.setReturnValue(2066823098);
    }

    @Inject(at = @At("HEAD"), method = "getSourceId()I", cancellable = true)
    private void getSourceId_791451215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791451215L))
            info.setReturnValue(2066823098);
    }


}
