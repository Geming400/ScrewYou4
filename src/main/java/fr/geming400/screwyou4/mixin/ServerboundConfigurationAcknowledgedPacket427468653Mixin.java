package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundConfigurationAcknowledgedPacket.class)
public class ServerboundConfigurationAcknowledgedPacket427468653Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_583336243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583336243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_131756790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(131756790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1064828827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1064828827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal_1089384222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089384222L))
            info.setReturnValue(false);
    }


}
