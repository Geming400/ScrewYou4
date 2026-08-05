package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBundlePacket.class)
public class ClientboundBundlePacket_1354263633Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1510131222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510131222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1058551769(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1058551769L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__237213962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-237213962L))
            info.cancel();
    }


}
