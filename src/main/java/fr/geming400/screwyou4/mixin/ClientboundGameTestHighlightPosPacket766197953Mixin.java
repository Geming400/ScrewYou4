package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundGameTestHighlightPosPacket.class)
public class ClientboundGameTestHighlightPosPacket766197953Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__912827135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-912827135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2143257084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2143257084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__369262022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-369262022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_804460695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804460695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1444266866(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1444266866L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_963705487(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(963705487L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "relativePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relativePos__1127188926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127188926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "absolutePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void absolutePos__1127188926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127188926L))
            info.setReturnValue(null);
    }


}
