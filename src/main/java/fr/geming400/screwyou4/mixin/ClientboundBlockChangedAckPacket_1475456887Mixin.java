package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBlockChangedAckPacket.class)
public class ClientboundBlockChangedAckPacket_1475456887Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__203568202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203568202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1433998151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1433998151L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_339996911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339996911L))
            info.setReturnValue("H6|vPVB)䧳GU㣶9kR*(e娩Qmgf^\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1513719628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1513719628L))
            info.setReturnValue(-1984344118);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1672964420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1672964420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2141441497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2141441497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sequence()I", cancellable = true)
    private void sequence_1513719132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1513719132L))
            info.setReturnValue(-1781196699);
    }


}
