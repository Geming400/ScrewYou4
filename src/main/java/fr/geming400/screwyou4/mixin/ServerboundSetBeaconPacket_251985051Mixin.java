package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetBeaconPacket.class)
public class ServerboundSetBeaconPacket_251985051Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_407852640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(407852640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__656641218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-656641218L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1022408575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1022408575L))
            info.setReturnValue("L)3+@SwGdu\u15BEerkWj3`#\u9350B%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_809337141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809337141L))
            info.setReturnValue(585185270);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__43726813(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-43726813L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_889345224(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(889345224L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "primary()Ljava/util/Optional;", cancellable = true)
    private void primary_276436554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(276436554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "secondary()Ljava/util/Optional;", cancellable = true)
    private void secondary__1731542084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1731542084L))
            info.setReturnValue(null);
    }


}
