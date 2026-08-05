package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundOpenBookPacket.class)
public class ClientboundOpenBookPacket784283584Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__894741504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-894741504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1462352497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1462352497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_981791118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(981791118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHand()Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private void getHand_1638272308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1638272308L))
            info.setReturnValue(net.minecraft.world.InteractionHand.MAIN_HAND);
    }


}
