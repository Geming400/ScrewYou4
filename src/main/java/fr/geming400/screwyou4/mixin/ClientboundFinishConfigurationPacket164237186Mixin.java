package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ClientboundFinishConfigurationPacket.class)
public class ClientboundFinishConfigurationPacket164237186Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_320104776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(320104776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__131474677(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-131474677L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ClientConfigurationPacketListener;)V", cancellable = true)
    private void handle_662156848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(662156848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal_826152755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826152755L))
            info.setReturnValue(false);
    }


}
