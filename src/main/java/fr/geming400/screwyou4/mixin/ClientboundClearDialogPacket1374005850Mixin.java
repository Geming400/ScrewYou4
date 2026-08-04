package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundClearDialogPacket.class)
public class ClientboundClearDialogPacket1374005850Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__305019238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-305019238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_2052074763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2052074763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle__86243704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-86243704L))
            info.cancel();
    }


}
