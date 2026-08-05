package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPaddleBoatPacket.class)
public class ServerboundPaddleBoatPacket_906534145Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__772490944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772490944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__962087850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-962087850L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1584603057(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1584603057L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRight()Z", cancellable = true)
    private void getRight_944812727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944812727L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLeft()Z", cancellable = true)
    private void getLeft_944812727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944812727L))
            info.setReturnValue(true);
    }


}
