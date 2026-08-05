package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSwingPacket.class)
public class ServerboundSwingPacket_1252553331Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__426471758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-426471758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1930622243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1930622243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__616068664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-616068664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHand()Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private void getHand_2106542054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106542054L))
            info.setReturnValue(net.minecraft.world.InteractionHand.MAIN_HAND);
    }


}
