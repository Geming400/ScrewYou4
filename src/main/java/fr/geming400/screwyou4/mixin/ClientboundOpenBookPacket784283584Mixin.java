package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundOpenBookPacket.class)
public class ClientboundOpenBookPacket784283584Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_940151174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(940151174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_488571721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(488571721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__807194010(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-807194010L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHand()Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private void getHand__1006933521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006933521L))
            info.setReturnValue(net.minecraft.world.InteractionHand.OFF_HAND);
    }


}
