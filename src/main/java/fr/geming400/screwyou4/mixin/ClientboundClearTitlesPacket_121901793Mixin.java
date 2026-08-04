package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundClearTitlesPacket.class)
public class ClientboundClearTitlesPacket_121901793Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1557123296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1557123296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_799970705(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(799970705L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_319409326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(319409326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldResetTimes()Z", cancellable = true)
    private void shouldResetTimes_160180375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160180375L))
            info.setReturnValue(null);
    }


}
