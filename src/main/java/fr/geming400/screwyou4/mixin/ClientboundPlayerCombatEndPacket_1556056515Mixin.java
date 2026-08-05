package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerCombatEndPacket.class)
public class ClientboundPlayerCombatEndPacket_1556056515Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1711924104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1711924104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__35421080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-35421080L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1260344651(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1260344651L))
            info.cancel();
    }


}
