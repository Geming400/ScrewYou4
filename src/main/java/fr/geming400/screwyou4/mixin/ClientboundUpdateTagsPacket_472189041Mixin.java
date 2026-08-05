package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundUpdateTagsPacket.class)
public class ClientboundUpdateTagsPacket_472189041Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_628056630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628056630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_176477177(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(176477177L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_222132598(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(222132598L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTags()Ljava/util/Map;", cancellable = true)
    private void getTags_722242153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(722242153L))
            info.setReturnValue(null);
    }


}
