package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundBlockEntityTagQueryPacket.class)
public class ServerboundBlockEntityTagQueryPacket_1798839283Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1954706872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954706872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1858767840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1858767840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1503127419(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1503127419L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTransactionId()I", cancellable = true)
    private void getTransactionId__1180979499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1180979499L))
            info.setReturnValue(1706145063);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__2006562283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006562283L))
            info.setReturnValue(null);
    }


}
