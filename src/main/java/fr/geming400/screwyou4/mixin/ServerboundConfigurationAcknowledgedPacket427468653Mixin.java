package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundConfigurationAcknowledgedPacket.class)
public class ServerboundConfigurationAcknowledgedPacket427468653Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1251556435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1251556435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1105537566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1105537566L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1441153341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1441153341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal_465747236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(465747236L))
            info.setReturnValue(null);
    }


}
