package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetBeaconPacket.class)
public class ServerboundSetBeaconPacket_251985051Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1427040038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427040038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1637497309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1637497309L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__883474925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-883474925L))
            info.setReturnValue("eO!>_NG碱L*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_290247792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(290247792L))
            info.setReturnValue(-1067744753);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_930053963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(930053963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1616636944(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1616636944L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "primary()Ljava/util/Optional;", cancellable = true)
    private void primary_497446472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(497446472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "secondary()Ljava/util/Optional;", cancellable = true)
    private void secondary_497446472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(497446472L))
            info.setReturnValue(null);
    }


}
