package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerCombatEnterPacket.class)
public class ClientboundPlayerCombatEnterPacket941245242Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1097112832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097112832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_645533379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(645533379L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__650232352(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-650232352L))
            info.cancel();
    }


}
