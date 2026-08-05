package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSwingPacket.class)
public class ServerboundSwingPacket_1252553331Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1408420920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1408420920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_956841467(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(956841467L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1889913504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1889913504L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHand()Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private void getHand__538663775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-538663775L))
            info.setReturnValue(net.minecraft.world.InteractionHand.MAIN_HAND);
    }


}
