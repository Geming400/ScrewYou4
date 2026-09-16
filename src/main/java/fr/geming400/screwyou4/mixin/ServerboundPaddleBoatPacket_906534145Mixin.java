package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPaddleBoatPacket.class)
public class ServerboundPaddleBoatPacket_906534145Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1062401734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062401734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1543894318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1543894318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_610822281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(610822281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRight()Z", cancellable = true)
    private void getRight__831874543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831874543L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLeft()Z", cancellable = true)
    private void getLeft__1709084582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1709084582L))
            info.setReturnValue(false);
    }


}
