package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ClientboundLoginFinishedPacket.class)
public class ClientboundLoginFinishedPacket312330756Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1366694332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1366694332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1697843015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697843015L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__823129219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-823129219L))
            info.setReturnValue("Y\u88C5`c3\uA85E0U\u2583\uB98FKw:\u6B77qQf\uC498M!#[mR?2C4z?(jP(#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_350593498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350593498L))
            info.setReturnValue(92752133);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ClientLoginPacketListener;)V", cancellable = true)
    private void handle__1924038732(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1924038732L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_990399669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(990399669L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal_350609339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350609339L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sessionId()Ljava/util/UUID;", cancellable = true)
    private void sessionId_723465239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723465239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameProfile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void gameProfile_829499036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(829499036L))
            info.setReturnValue(null);
    }


}
