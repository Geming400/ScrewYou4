package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundLockDifficultyPacket.class)
public class ServerboundLockDifficultyPacket_1453093637Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1608961226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1608961226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1157381773(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1157381773L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_2090453810(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2090453810L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLocked()Z", cancellable = true)
    private void isLocked_205211751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(205211751L))
            info.setReturnValue(false);
    }


}
