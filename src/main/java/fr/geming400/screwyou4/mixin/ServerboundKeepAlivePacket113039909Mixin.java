package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundKeepAlivePacket.class)
public class ServerboundKeepAlivePacket113039909Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_268907499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268907499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()J", cancellable = true)
    private void getId__1545282725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1545282725L))
            info.setReturnValue(-6577536634676986477L);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__182671954(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-182671954L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ServerCommonPacketListener;)V", cancellable = true)
    private void handle__1412602189(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1412602189L))
            info.cancel();
    }


}
