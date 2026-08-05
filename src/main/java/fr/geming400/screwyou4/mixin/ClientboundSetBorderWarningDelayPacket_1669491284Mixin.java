package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetBorderWarningDelayPacket.class)
public class ClientboundSetBorderWarningDelayPacket_1669491284Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__9533805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-9533805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1947407100(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1947407100L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1866998817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1866998817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWarningDelay()I", cancellable = true)
    private void getWarningDelay_1707753529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1707753529L))
            info.setReturnValue(-2043845928);
    }


}
