package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTakeItemEntityPacket.class)
public class ClientboundTakeItemEntityPacket_1718996502Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_39971413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39971413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1916504035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1916504035L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1897901882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1897901882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerId()I", cancellable = true)
    private void getPlayerId_1757258747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757258747L))
            info.setReturnValue(833283323);
    }

    @Inject(at = @At("HEAD"), method = "getAmount()I", cancellable = true)
    private void getAmount_1757258747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757258747L))
            info.setReturnValue(833283323);
    }

    @Inject(at = @At("HEAD"), method = "getItemId()I", cancellable = true)
    private void getItemId_1757258747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757258747L))
            info.setReturnValue(833283323);
    }


}
