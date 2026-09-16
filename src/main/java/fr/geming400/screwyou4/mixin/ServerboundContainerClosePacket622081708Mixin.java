package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundContainerClosePacket.class)
public class ServerboundContainerClosePacket622081708Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_777949298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777949298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_326369845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(326369845L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1259441882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1259441882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainerId()I", cancellable = true)
    private void getContainerId__1767323636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1767323636L))
            info.setReturnValue(-1253042210);
    }


}
