package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundStartConfigurationPacket.class)
public class ClientboundStartConfigurationPacket1603629153Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1759496743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1759496743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1307917290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1307917290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_12151559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(12151559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal__2029422574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2029422574L))
            info.setReturnValue(false);
    }


}
