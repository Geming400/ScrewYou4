package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundPongPacket.class)
public class ServerboundPongPacket1669195661Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__9829427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-9829427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1707457907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1707457907L))
            info.setReturnValue(-2117676236);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1947702722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1947702722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ServerCommonPacketListener;)V", cancellable = true)
    private void handle__1066639549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1066639549L))
            info.cancel();
    }


}
