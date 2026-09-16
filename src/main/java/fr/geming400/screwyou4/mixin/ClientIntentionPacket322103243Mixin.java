package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.handshake.ClientIntentionPacket.class)
public class ClientIntentionPacket322103243Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_477970833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(477970833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__586523025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-586523025L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1092526768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1092526768L))
            info.setReturnValue("<wW\uC6D1E\u21A5 ]Y.Zp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_879455334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(879455334L))
            info.setReturnValue(-693191697);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/handshake/ServerHandshakePacketListener;)V", cancellable = true)
    private void handle_218898095(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(218898095L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_26391380(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(26391380L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "port()I", cancellable = true)
    private void port_1384533456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384533456L))
            info.setReturnValue(1594762754);
    }

    @Inject(at = @At("HEAD"), method = "protocolVersion()I", cancellable = true)
    private void protocolVersion__450189679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-450189679L))
            info.setReturnValue(769544236);
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal_984018812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984018812L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hostName()Ljava/lang/String;", cancellable = true)
    private void hostName_1588635495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1588635495L))
            info.setReturnValue("OrP");
    }

    @Inject(at = @At("HEAD"), method = "intention()Lnet/minecraft/network/protocol/handshake/ClientIntent;", cancellable = true)
    private void intention_1037378690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1037378690L))
            info.setReturnValue(net.minecraft.network.protocol.handshake.ClientIntent.LOGIN);
    }


}
