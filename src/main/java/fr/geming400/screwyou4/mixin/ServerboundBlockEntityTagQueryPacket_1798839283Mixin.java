package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundBlockEntityTagQueryPacket.class)
public class ServerboundBlockEntityTagQueryPacket_1798839283Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_119814194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(119814194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__69782712(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-69782712L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1818059101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1818059101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__94547597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-94547597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTransactionId()I", cancellable = true)
    private void getTransactionId_1837101528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837101528L))
            info.setReturnValue(-808160631);
    }


}
