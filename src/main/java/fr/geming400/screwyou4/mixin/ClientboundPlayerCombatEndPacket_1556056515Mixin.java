package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerCombatEndPacket.class)
public class ClientboundPlayerCombatEndPacket_1556056515Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__122968574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-122968574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1753564048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1753564048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2060841869(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2060841869L))
            info.cancel();
    }


}
