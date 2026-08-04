package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLowDiskSpaceWarningPacket.class)
public class ClientboundLowDiskSpaceWarningPacket_1674163010Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__4862079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-4862079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1942735374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1942735374L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1871670543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1871670543L))
            info.cancel();
    }


}
