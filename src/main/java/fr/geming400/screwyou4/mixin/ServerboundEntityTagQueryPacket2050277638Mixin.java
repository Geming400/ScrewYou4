package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundEntityTagQueryPacket.class)
public class ServerboundEntityTagQueryPacket2050277638Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2088822068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088822068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1607329484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1607329484L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1754565775(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1754565775L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntityId()I", cancellable = true)
    private void getEntityId_1415536024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415536024L))
            info.setReturnValue(1881310717);
    }

    @Inject(at = @At("HEAD"), method = "getTransactionId()I", cancellable = true)
    private void getTransactionId__929541143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-929541143L))
            info.setReturnValue(787249457);
    }


}
