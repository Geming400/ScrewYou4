package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundChunkBatchStartPacket.class)
public class ClientboundChunkBatchStartPacket_1158712468Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__520312621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-520312621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1836781380(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1836781380L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1356220001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1356220001L))
            info.cancel();
    }


}
