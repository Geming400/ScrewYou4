package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundPongPacket.class)
public class ServerboundPongPacket1669195661Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1825063251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1825063251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_10872066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(10872066L))
            info.setReturnValue(-1735030980);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1373483798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1373483798L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ServerCommonPacketListener;)V", cancellable = true)
    private void handle_143553563(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(143553563L))
            info.cancel();
    }


}
