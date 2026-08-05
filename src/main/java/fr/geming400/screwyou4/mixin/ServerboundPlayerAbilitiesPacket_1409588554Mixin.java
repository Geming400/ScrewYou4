package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlayerAbilitiesPacket.class)
public class ServerboundPlayerAbilitiesPacket_1409588554Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__269436535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-269436535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_2087657466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2087657466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__459033441(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-459033441L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFlying()Z", cancellable = true)
    private void isFlying_1447867136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447867136L))
            info.setReturnValue(true);
    }


}
