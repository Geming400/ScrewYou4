package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket.class)
public class ServerboundSetCarriedItemPacket1262504976Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1418372566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418372566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSlot()I", cancellable = true)
    private void getSlot_1886926850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886926850L))
            info.setReturnValue(-1383993046);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_966793113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(966793113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1899865150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1899865150L))
            info.cancel();
    }


}
