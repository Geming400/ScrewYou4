package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerCombatEnterPacket.class)
public class ClientboundPlayerCombatEnterPacket941245242Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__737779846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-737779846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1619314155(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1619314155L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1138752776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1138752776L))
            info.cancel();
    }


}
