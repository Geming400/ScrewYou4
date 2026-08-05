package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundClearDialogPacket.class)
public class ClientboundClearDialogPacket1374005850Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1529873440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1529873440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1078293987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1078293987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_1123949408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1123949408L))
            info.cancel();
    }


}
