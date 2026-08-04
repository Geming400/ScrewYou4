package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundAcceptTeleportationPacket.class)
public class ServerboundAcceptTeleportationPacket_1660327343Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__18697746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18697746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1698589588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698589588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1956571041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1956571041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__208294652(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-208294652L))
            info.cancel();
    }


}
