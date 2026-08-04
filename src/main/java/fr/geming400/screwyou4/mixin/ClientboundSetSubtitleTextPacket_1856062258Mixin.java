package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetSubtitleTextPacket.class)
public class ClientboundSetSubtitleTextPacket_1856062258Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_177037169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(177037169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1053392780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1053392780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_720602282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720602282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1894324999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894324999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1760836126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1760836126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_2053569791(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2053569791L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text__320846908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-320846908L))
            info.setReturnValue(null);
    }


}
