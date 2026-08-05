package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundClearTitlesPacket.class)
public class ClientboundClearTitlesPacket_121901793Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_277769382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277769382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__173810071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-173810071L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1469575802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1469575802L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldResetTimes()Z", cancellable = true)
    private void shouldResetTimes_1420543373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420543373L))
            info.setReturnValue(true);
    }


}
