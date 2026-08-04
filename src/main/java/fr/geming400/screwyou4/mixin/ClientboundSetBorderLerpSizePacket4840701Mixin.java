package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetBorderLerpSizePacket.class)
public class ClientboundSetBorderLerpSizePacket4840701Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1674184387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1674184387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_202348235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(202348235L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_682909614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(682909614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLerpTime()J", cancellable = true)
    private void getLerpTime_43103908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43103908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOldSize()D", cancellable = true)
    private void getOldSize_43098142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43098142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNewSize()D", cancellable = true)
    private void getNewSize_43098142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43098142L))
            info.setReturnValue(null);
    }


}
