package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundEntityTagQueryPacket.class)
public class ServerboundEntityTagQueryPacket2050277638Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_371252550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371252550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_181655644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(181655644L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1566620745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1566620745L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntityId()I", cancellable = true)
    private void getEntityId_2088539884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088539884L))
            info.setReturnValue(-1764409629);
    }

    @Inject(at = @At("HEAD"), method = "getTransactionId()I", cancellable = true)
    private void getTransactionId_2088539884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088539884L))
            info.setReturnValue(-1764409629);
    }


}
