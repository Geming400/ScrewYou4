package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBlockChangedAckPacket.class)
public class ClientboundBlockChangedAckPacket_1475456887Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1631324476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631324476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_566830618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566830618L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2049086885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2049086885L))
            info.setReturnValue("E:_7-VZS$vYx^U{-\uCF8D@\u7F9C<IIkNz2Q\u30CFyW*s");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2032808977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032808977L))
            info.setReturnValue(2019085843);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__116020708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-116020708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1179745023(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1179745023L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sequence()I", cancellable = true)
    private void sequence_701677115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701677115L))
            info.setReturnValue(1164212016);
    }


}
