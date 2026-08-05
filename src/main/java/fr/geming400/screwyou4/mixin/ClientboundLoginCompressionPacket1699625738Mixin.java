package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ClientboundLoginCompressionPacket.class)
public class ClientboundLoginCompressionPacket1699625738Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_20600650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20600650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1917272645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1917272645L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ClientLoginPacketListener;)V", cancellable = true)
    private void handle__536743750(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-536743750L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCompressionThreshold()I", cancellable = true)
    private void getCompressionThreshold_1737887984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737887984L))
            info.setReturnValue(-1300880304);
    }


}
