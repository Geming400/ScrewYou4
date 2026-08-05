package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.handshake.ClientIntentionPacket.class)
public class ClientIntentionPacket322103243Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1356921845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1356921845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1707615502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1707615502L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__813356732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813356732L))
            info.setReturnValue("wG캓NF<䏢Si:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_360365985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360365985L))
            info.setReturnValue(898466065);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/handshake/ServerHandshakePacketListener;)V", cancellable = true)
    private void handle_1200032727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1200032727L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1000172156(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1000172156L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "port()I", cancellable = true)
    private void port_360365489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360365489L))
            info.setReturnValue(1101613484);
    }

    @Inject(at = @At("HEAD"), method = "protocolVersion()I", cancellable = true)
    private void protocolVersion_360365489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360365489L))
            info.setReturnValue(1101613484);
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal_360381826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360381826L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hostName()Ljava/lang/String;", cancellable = true)
    private void hostName__813357228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813357228L))
            info.setReturnValue("`c*><EZG⪑m$RjG0`p콅ᱶ`ꛗ춗{8VvqB`&ap|]躑}427_<+츈<ၑFzF!?K17dH5@^g( tfWhHcW&uk|");
    }

    @Inject(at = @At("HEAD"), method = "intention()Lnet/minecraft/network/protocol/handshake/ClientIntent;", cancellable = true)
    private void intention__158592018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-158592018L))
            info.setReturnValue(net.minecraft.network.protocol.handshake.ClientIntent.TRANSFER);
    }


}
