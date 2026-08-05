package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundChunkBatchStartPacket.class)
public class ClientboundChunkBatchStartPacket_1158712468Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1314580057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1314580057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_863000604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(863000604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__432765127(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-432765127L))
            info.cancel();
    }


}
