package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChatAckPacket.class)
public class ServerboundChatAckPacket_1569366416Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__109658673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109658673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1340088622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340088622L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_433906440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(433906440L))
            info.setReturnValue("<CUn n{S\uB1801\u30EFi.\u371Bqd9O$3!Q897,l@4dYO[qJfcUB*_\u00CD");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1607629157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1607629157L))
            info.setReturnValue(-2084668098);
    }

    @Inject(at = @At("HEAD"), method = "offset()I", cancellable = true)
    private void offset_1607628661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1607628661L))
            info.setReturnValue(837515123);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2047531968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2047531968L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__299255579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-299255579L))
            info.cancel();
    }


}
