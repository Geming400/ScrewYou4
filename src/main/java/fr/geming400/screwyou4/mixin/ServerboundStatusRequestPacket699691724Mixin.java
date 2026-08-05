package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.status.ServerboundStatusRequestPacket.class)
public class ServerboundStatusRequestPacket699691724Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_855559314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855559314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_403979861(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(403979861L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/status/ServerStatusPacketListener;)V", cancellable = true)
    private void handle__1153286150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1153286150L))
            info.cancel();
    }


}
