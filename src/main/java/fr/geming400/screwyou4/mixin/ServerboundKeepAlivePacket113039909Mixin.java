package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundKeepAlivePacket.class)
public class ServerboundKeepAlivePacket113039909Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1565985179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565985179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()J", cancellable = true)
    private void getId_151303116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151303116L))
            info.setReturnValue(8290345465952090809L);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_791108822(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(791108822L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ServerCommonPacketListener;)V", cancellable = true)
    private void handle_1672171995(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1672171995L))
            info.cancel();
    }


}
