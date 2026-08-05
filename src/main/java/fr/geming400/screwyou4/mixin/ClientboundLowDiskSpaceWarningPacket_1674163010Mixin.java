package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLowDiskSpaceWarningPacket.class)
public class ClientboundLowDiskSpaceWarningPacket_1674163010Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1830030599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1830030599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1378451146(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1378451146L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_82685415(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(82685415L))
            info.cancel();
    }


}
