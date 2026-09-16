package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetBorderWarningDelayPacket.class)
public class ClientboundSetBorderWarningDelayPacket_1669491284Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1825358873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1825358873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1373779420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1373779420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_78013689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(78013689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWarningDelay()I", cancellable = true)
    private void getWarningDelay__628473700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-628473700L))
            info.setReturnValue(170300497);
    }


}
