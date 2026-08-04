package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ClientboundResetChatPacket.class)
public class ClientboundResetChatPacket1077762278Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__601262810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-601262810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1755831191(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1755831191L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ClientConfigurationPacketListener;)V", cancellable = true)
    private void handle_64636092(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(64636092L))
            info.cancel();
    }


}
