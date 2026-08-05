package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundLockDifficultyPacket.class)
public class ServerboundLockDifficultyPacket_1453093637Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__225931452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-225931452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_2131162549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2131162549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__415528358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-415528358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLocked()Z", cancellable = true)
    private void isLocked_1491372219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1491372219L))
            info.setReturnValue(false);
    }


}
