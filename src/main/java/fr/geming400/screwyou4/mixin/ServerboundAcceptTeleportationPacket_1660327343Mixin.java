package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundAcceptTeleportationPacket.class)
public class ServerboundAcceptTeleportationPacket_1660327343Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1816194932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816194932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_2003747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2003747L))
            info.setReturnValue(1915140256);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1364615479(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1364615479L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1997279780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1997279780L))
            info.cancel();
    }


}
