package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundAnimatePacket.class)
public class ClientboundAnimatePacket1582523320Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__96501768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96501768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1620785566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620785566L))
            info.setReturnValue(1266267870);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2034375063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2034375063L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1780030854(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1780030854L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAction()I", cancellable = true)
    private void getAction_1620785566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620785566L))
            info.setReturnValue(1266267870);
    }


}
