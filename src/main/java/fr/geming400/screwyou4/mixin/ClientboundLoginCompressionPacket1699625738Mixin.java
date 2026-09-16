package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ClientboundLoginCompressionPacket.class)
public class ClientboundLoginCompressionPacket1699625738Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1855493328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855493328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1403913875(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1403913875L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ClientLoginPacketListener;)V", cancellable = true)
    private void handle__1764533358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1764533358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCompressionThreshold()I", cancellable = true)
    private void getCompressionThreshold_1792839605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792839605L))
            info.setReturnValue(2093776753);
    }


}
