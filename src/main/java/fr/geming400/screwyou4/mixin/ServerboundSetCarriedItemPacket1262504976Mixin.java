package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket.class)
public class ServerboundSetCarriedItemPacket1262504976Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__416520112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-416520112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSlot()I", cancellable = true)
    private void getSlot_1300767222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1300767222L))
            info.setReturnValue(1313165314);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1940573889(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1940573889L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__606117018(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-606117018L))
            info.cancel();
    }


}
